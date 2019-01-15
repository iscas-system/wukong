package com.github.wukong.core.tools;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;

import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
import org.springframework.core.ParameterNameDiscoverer;

public class CodesTool {

	public static void generateRequest(File file, Class<?> superClass, Method parent, Method thisMethod)
			throws Exception {
		generateRequest(file, superClass, parent, thisMethod, false, 0);
	}
	
	public static void generateRequest(File file, Class<?> superClass, Method parent, Method thisMethod, boolean exception, int num)
			throws Exception {

		String name = thisMethod.getName().substring(0, 1).toUpperCase() 
								+ thisMethod.getName().substring(1) + "Request";
		FileOutputStream fileWriter = new FileOutputStream(new File(file, name + ".java"));

		// class
		StringBuffer sb = new StringBuffer();
		generateClassBody(superClass, parent, name, sb);
		String[] filedNames = generateFileds(thisMethod, sb);
		generateSetterAndGetter(thisMethod, sb, filedNames);
		fileWriter.write(sb.toString().getBytes());
		fileWriter.close();
		generateProxy(superClass, parent, thisMethod, name, filedNames, exception, num);
	}

	private static void generateProxy(Class<?> superClass, Method method, Method thisMethod, String name,
			String[] filedNames, boolean exception, int num) {
		String returnType = thisMethod.getGenericReturnType().getTypeName().replace("$", ".");
		String fakeType = returnType;
		String realname = "";
		while (num-- > 0) {
			int idx = fakeType.lastIndexOf(".");
			String postfix = (idx == -1) ? fakeType : fakeType.substring(idx + 1);
			realname = postfix.substring(0, 1).toUpperCase() + postfix.substring(1);
			fakeType = fakeType.substring(0, idx);
		}
		
		System.out.print("\tpublic " + returnType + " " + thisMethod.getName() + realname
				+ "(" + superClass.getPackage().getName() + "." + method.getName() + "." + name + " request) ");

		if (exception) {
			System.out.println("throws Exception {");
		} else {
			System.out.println("{");
		}
		
		if (thisMethod.getReturnType().getTypeName().equals("void")) {
			System.out.print("\t\tthis." + method.getName() + "()." + thisMethod.getName() + "(");
		} else {
			System.out.print("\t\treturn this." + method.getName() + "()." + thisMethod.getName() + "(");
		}

		if (filedNames != null) {
			for (int i = 0; i < filedNames.length; i++) {
				String pName = filedNames[i].substring(0, 1).toUpperCase() + filedNames[i].substring(1);
				if (i != filedNames.length - 1) {
					System.out.print("request.get" + pName + "(),");
				} else {
					System.out.print("request.get" + pName + "()");
				}
			}
		}
		System.out.println(");");
		System.out.println("\t}");
		System.out.println();
	}

	private static void generateSetterAndGetter(Method thisMethod, StringBuffer sb, String[] filedNames) {
		// setter and getter
		if (filedNames != null) {
			for (int i = 0; i < filedNames.length; i++) {
				String pName = filedNames[i].substring(0, 1).toUpperCase() + filedNames[i].substring(1);
				sb.append("\t").append("public void set").append(pName).append("(")
						.append(thisMethod.getParameters()[i].getParameterizedType().getTypeName()).append(" ")
						.append(filedNames[i]).append(") {\n").append("\t\tthis.").append(filedNames[i]).append(" = ")
						.append(filedNames[i]).append(";\n").append("}\n");
	
				sb.append("\t").append("public ").append(thisMethod.getParameters()[i].getParameterizedType().getTypeName())
						.append(" get").append(pName).append("() {\n").append("\t\treturn this.").append(filedNames[i])
						.append(";\n").append("}\n");
			}
		}

		sb.append("}");
	}

	private static String[] generateFileds(Method thisMethod, StringBuffer sb) {
		// filed
		ParameterNameDiscoverer pnd = new LocalVariableTableParameterNameDiscoverer();
		String[] filedNames = pnd.getParameterNames(thisMethod);
		
		if (filedNames == null) {
			return null;
		}

		for (int i = 0; i < filedNames.length; i++) {
			sb.append("\t").append("protected ")
					.append(thisMethod.getParameters()[i].getParameterizedType().getTypeName()).append(" ")
					.append(filedNames[i]).append(";\n\n");
		}
		return filedNames;
	}

	private static void generateClassBody(Class<?> superClass, Method method, String name, StringBuffer sb) {
		sb.append("package " + superClass.getPackage().getName() + "." + method.getName() + ";");
		sb.append("\n\n");
		sb.append("public class " + name + " implements " + superClass.getName() + " {");
		sb.append("\n");
	}

	public static File getBase(Class<?> clazz) {
		return new File(clazz.getResource("").getPath().replace("/target/classes/", "/src/main/java/"));
	}
}
