/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package com.github.wukong.core.utils;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 * @author wuheng@(otcaix.iscas.ac.cn)
 *
 *         2018年3月2日
 */
public class ObjectUtils {

	/**
	 * 判断对象是否为空
	 * 
	 * @param obj 对象
	 * @return 是否为空
	 */
	public static boolean isNull(Object obj) {
		return (obj == null) ? true : false;
	}

	/**
	 * we do not check this parameters.
	 * please ensure they are valid by yourself
	 * 
	 * @param jarPath      jarptah
	 * @param childPackage package
	 * @return classname
	 * @throws Exception
	 */
	public static List<Class<?>> getClassNameByJar(String pkgName, Class<?> parent) throws Exception {

		List<Class<?>> myClasses = new ArrayList<Class<?>>();
		
		String[] jarInfo = Thread.currentThread().
								getContextClassLoader().getResource(
										pkgName.replace(".", "/")).getFile().split("!");
		
		@SuppressWarnings("resource")
		JarFile jarFile = new JarFile(jarInfo[0].substring(
											jarInfo[0].indexOf("/")));
		
		Enumeration<JarEntry> entrys = jarFile.entries();
		while (entrys.hasMoreElements()) {
			JarEntry jarEntry = entrys.nextElement();
			String entryName = jarEntry.getName();
			if (entryName.endsWith(".class") && 
					entryName.startsWith(pkgName.replace(".", "/"))) {
				int index = entryName.lastIndexOf("/");
				String fullname = (index != -1) ? entryName
										.substring(index + 1) : entryName; 
				String classname = pkgName + "." + fullname
										.substring(0, fullname.length() - ".class".length());
				
				Class<?> forClass = Class.forName(classname);
				for (Class<?> clazz : forClass.getInterfaces()) {
					if (parent.getName().equals(clazz.getName())) {
						myClasses.add(forClass);
					}
				}
				
				if(forClass.getSuperclass().getName().equals(parent.getName())) {
					myClasses.add(forClass);
				}
				
			}
		}

		return myClasses;
	}
}
