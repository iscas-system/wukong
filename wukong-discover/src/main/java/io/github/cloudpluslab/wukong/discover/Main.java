/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package io.github.cloudpluslab.wukong.discover;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.JSON;

import io.github.cloudpluslab.wukong.discover.core.ClassScan;
import io.github.cloudpluslab.wukong.discover.model.JDKInfo;
import io.github.cloudpluslab.wukong.discover.utils.JSONUtils;

/**
 * @author tangting18@otcaix.iscas.ac.cn
 * @author wuheng@iscas.ac.cn
 * @since 2019.12.10
 */
public class Main {
	public final static String JDKINFO_FILE = "conf/jdkinfo.conf";

	public final static StringBuffer sb = new StringBuffer();
	
	public static void main(String[] args) throws Exception {
		
		JDKInfo info = JSON.parseObject(new FileInputStream(new File(JDKINFO_FILE)), JDKInfo.class);
		Class<?> clientClass = Class.forName(info.getClient());
		
		
		sb.append("---\n");
		sb.append(JSONUtils.metaInfo(info.getKind()));
		sb.append("\n");
		
		Set<Class<?>> thisCls = null;
		
		for (Method method : filter(clientClass.getMethods())) {

			if (isGenericStyle(method)) {
				thisCls = genericStyleDiscover(method);
			} else {
				continue;
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

	private static List<Method> filter(Method[] methods) {
		List<Method> list = new ArrayList<Method>();
		for (Method method : methods) {
			if (method.getParameterCount() != 1) {
				continue;
			} 
			list.add(method);
		}
		return list;
	}
	
	/*************************************************************
	 * 
	 * Discover with Generic Style
	 * 
	 *************************************************************/
	@SuppressWarnings("unchecked")
	private static Set<Class<?>> genericStyleDiscover(Method method) {
		String superclass = genericStyleSuperClass(method.getGenericParameterTypes()[0].getTypeName());
		String thispkg = genericStylePackage(superclass);
		return genericStyleExtra(superclass, ClassScan.scan(thispkg));
	}

	private static Set<Class<?>> genericStyleExtra(String superclass, Set<Class<?>> allCls) {
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
				thisCls.addAll(genericStyleExtra(cls.getName(), allCls));
			}
		}

		return thisCls;
	}

	private static boolean isGenericStyle(Method method) {
		String ret = method.getGenericReturnType().getTypeName();
		String pam = method.getGenericParameterTypes()[0].getTypeName();
		return pam.contains("<" + ret + ">");
	}

	private static String genericStyleSuperClass(String name) {
		int pos = name.indexOf("<");
		return name.substring(0, pos);
	}

	private static String genericStylePackage(String name) {
		int pos = name.lastIndexOf(".");
		return name.substring(0, pos);
	}

	/*************************************************************
	 * 
	 * statistics based methods
	 * 
	 *************************************************************/
	
	protected String frequent(Method[] methods) {
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
				return entry.getKey();
			}
		}
		return null;
	}
	
}
