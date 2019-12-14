/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package io.github.cloudpluslab.wukong.discover;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.JSON;

import io.github.cloudpluslab.wukong.discover.core.ClassScan;
import io.github.cloudpluslab.wukong.discover.model.JDKInfo;
import io.github.cloudpluslab.wukong.discover.utils.JSONUtils;
import io.github.cloudpluslab.wukong.discover.utils.JavaUtils;

/**
 * @author tangting18@otcaix.iscas.ac.cn
 * @author wuheng@iscas.ac.cn
 * @since 2019.12.10
 */
public class Main {
	
	public final static String JDKINFO_FILE = "conf/jdkinfo.conf";

	public final static StringBuffer sb = new StringBuffer();
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		
		JDKInfo info = JSON.parseObject(new FileInputStream(new File(JDKINFO_FILE)), JDKInfo.class);
		Class<?> clientClass = Class.forName(info.getClient());
		
		
		sb.append("---\n");
		sb.append(JSONUtils.metaInfo(info.getKind()));
		sb.append("\n");
		
		Set<Class<?>> thisCls = new HashSet<Class<?>>();
	
		String superclassBySearch    = search(clientClass.getDeclaredMethods());
		String superclassByFrequency = frequency(clientClass.getDeclaredMethods());
		if (superclassBySearch != null) {
			String thispkg = getPackage(superclassBySearch);
			thisCls.addAll(searchingSuperclass(superclassBySearch, ClassScan.scan(thispkg)));
		} else if (superclassByFrequency != null) {
			thisCls.addAll(frequentSuperclass(superclassByFrequency, clientClass.getDeclaredMethods()));
		} else {
			String supperclass = sorting(clientClass);
			for (Method method : clientClass.getDeclaredMethods()) {
				try {
					Class<?> returnType = method.getReturnType();
					System.out.println("==" + returnType);
					for (Method m : returnType.getDeclaredMethods()) {
						String typeName = m.getReturnType().getTypeName();
						if (supperclass.equals(typeName)) {
							System.out.println(JSONUtils.xmlInfo(info.getKind(), m));
						}
					}
				} catch (Exception ex) {
					// ignore here
				}
			}
		}
		
		for (Class<?> cls : thisCls) {
			if (Modifier.isAbstract(cls.getModifiers())) {
				continue;
			}
			
			sb.append("---\n");
			sb.append(JSONUtils.objInfo(info.getKind(), cls));
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

	/*************************************************************
	 * 
	 * Discover with Generic Style
	 * 
	 *************************************************************/

	private static String sorting(Class<?> clientClass) {
		Map<String, Integer> sorts = new HashMap<String, Integer>();
		String type = null;
		int i = 0;
		for (Method method : clientClass.getDeclaredMethods()) {
			if (method.getParameterCount() == 0) {
				try {
					for (Method m : method.getReturnType().getDeclaredMethods()) {
						String typeName = m.getReturnType().getTypeName();
						if (JavaUtils.isPrimitive(typeName) ||
								JavaUtils.isList(typeName) ||
								JavaUtils.isSet(typeName) ||
								JavaUtils.isMap(typeName) ||
								typeName.equals("void")) {
							continue;
						}
						Integer itr = sorts.get(typeName);
						itr = (itr == null) ? 1 : itr + 1;
						sorts.put(typeName, itr);
					}
					
				} catch (Exception ex) {
					
				}
			}
		}
		for (String name : sorts.keySet()) {
			int value = sorts.get(name);
			if (value > i) {
				i = value;
				type = name;
			}
		}
		return type;
	}
	
	private static Set<Class<?>> frequentSuperclass(String superclass, Method[] methods) {
		Set<Class<?>> thisCls = new HashSet<Class<?>>();
		
		for (Method method : methods) {
			if (method.getParameterCount() != 1) {
				continue;
			}
			
			Class<?> thisclass = method.getParameterTypes()[0];
			String scname = thisclass.getSuperclass().getName();
			if (superclass.trim().equals(scname)) {
				thisCls.add(thisclass);
			}
		}

		return thisCls;
	}
	
	private static Set<Class<?>> searchingSuperclass(String superclass, Set<Class<?>> allCls) {
		Set<Class<?>> thisCls = new HashSet<Class<?>>();
		for (Class<?> cls : allCls) {
			if (!cls.isInterface() && superclass.equals(cls.getSuperclass().getName())) {
				thisCls.add(cls);
			}
		}

		Set<Class<?>> cloneCls = new HashSet<Class<?>>();
		for (Class<?> cls : thisCls) {
			cloneCls.add(cls);
		}

		for (Class<?> cls : cloneCls) {
			if (Modifier.isAbstract(cls.getModifiers())) {
				thisCls.addAll(searchingSuperclass(cls.getName(), allCls));
			}
		}

		return thisCls;
	}

	private static String getPackage(String name) {
		int pos = name.lastIndexOf(".");
		return name.substring(0, pos);
	}

	/*************************************************************
	 * 
	 * get supperclasses methods
	 * 
	 *************************************************************/
	
	protected static String search(Method[] methods) {
		for (Method method : methods) {
			if (method.getParameterCount() != 1) {
				continue;
			}
			
			String ret = method.getGenericReturnType().getTypeName();
			String pam = method.getGenericParameterTypes()[0].getTypeName();
			
			if(pam.contains("<" + ret + ">")) {
				String name = method.getGenericParameterTypes()[0].getTypeName();
				int pos = name.indexOf("<");
				return name.substring(0, pos);
			}
		}
		return null;
	}
	
	protected static String frequency(Method[] methods) {
		HashMap<String, Integer> temp = new HashMap<String, Integer>();
		for (Method method : methods) {
			if(method != null && !method.isAnnotationPresent(Deprecated.class) && method.getParameterCount() == 1) {
				Class<?> paramType = method.getParameterTypes()[0];
				if( paramType.getSuperclass() != null) {
					String[] str = paramType.getSuperclass().toString().split(" ");
					if(!str[1].substring(0, 4).equals("java")) {
						if (!temp.containsKey(String.valueOf(paramType.getSuperclass()))) {
							temp.put(String.valueOf(paramType.getSuperclass()), 1);
						} else {
							temp.put(String.valueOf(paramType.getSuperclass()), 1 + temp.get(String.valueOf(paramType.getSuperclass())));
						}
					} else {
						for (Class<?> clazz : paramType.getInterfaces()) {
							String strz = clazz.getName().toString();
							if(!strz.substring(0, 4).equals("java")) {
								if (!temp.containsKey(String.valueOf(clazz.getName()))) {
									temp.put(String.valueOf(clazz.getName()), 1);
								} else {
									temp.put(String.valueOf(clazz.getName()), 1 + temp.get(String.valueOf(clazz.getName())));
								}
							}
						}
					}

				}
			}

		}
		Collection<Integer> c = temp.values();
		Object[] obj = c.toArray();
		Arrays.sort(obj);

		for (Map.Entry<String, Integer> entry : temp.entrySet()) {
			//System.out.println("entry.getKey()"+entry.getKey()+"entry.getValue()"+entry.getValue());
			if(obj[obj.length - 1] == entry.getValue()){
				return entry.getKey().substring(5);
			}
		}
		return null;
	}
	
}
