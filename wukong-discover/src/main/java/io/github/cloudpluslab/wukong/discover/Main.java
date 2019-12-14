/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package io.github.cloudpluslab.wukong.discover;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	public final static String JDKINFO_FILE = "conf/jdkinfo.conf-googlegce";

	public final static StringBuffer sb = new StringBuffer();

	public static void main(String[] args) throws Exception {

		JDKInfo info = JSON.parseObject(new FileInputStream(new File(JDKINFO_FILE)), JDKInfo.class);

		generate(JSONUtils.metaInfo(info.getKind()));

		Class<?> clientClass = Class.forName(info.getClient());
		List<String> objStrs = findObjectJSON(info, clientClass.getDeclaredMethods());
		
		for (String strJson : objStrs) {
			generate(strJson);
		}
		
		System.out.println(objStrs.size());
		System.out.println(sb);
	}

	private static void generate(String jsonStr) {
		sb.append("---\n");
		sb.append(jsonStr);
		sb.append("\n");
	}

	private static String getPackage(String fullname) {
		int pos = fullname.lastIndexOf(".");
		return fullname.substring(0, pos);
	}


	/*************************************************************
	 * 
	 * Find JSONs
	 * 
	 *************************************************************/

	protected static List<String> findObjectJSON(JDKInfo info, Method[] methods) throws Exception {
		List<String> json = new ArrayList<String>();
		json.addAll(findGenericStyleObjectJSON(info, methods));
		json.addAll(findDirectStyleObjectJSON(info, methods));
		System.out.println(getCatalogStyleSuperclass(methods));
		json.addAll(findCatalogStyleObjectJSON(info, methods));
		return json;
	}

	@SuppressWarnings("unchecked")
	protected static List<String> findGenericStyleObjectJSON(JDKInfo info, Method[] methods) throws Exception {
		String superclass = getGenericStyleSuperclass(methods);
		return superclass == null ? new ArrayList<>()
				: getGenericStyleJSON(info.getKind(), superclass, ClassScan.scan(getPackage(superclass)));
	}

	protected static List<String> findDirectStyleObjectJSON(JDKInfo info, Method[] methods) throws Exception {
		String superclass = getDirectStyleSuperclass(methods);
		return superclass == null ? new ArrayList<>() 
				: getDirectStyleJSON(info.getKind(), superclass, methods);
	}
	
	protected static List<String> findCatalogStyleObjectJSON(JDKInfo info, Method[] methods) throws Exception {
		String superclass = getCatalogStyleSuperclass(methods);
		System.out.println(superclass);
		return superclass == null ? new ArrayList<>() 
				: getCatalogStyleJSON(info.getKind(), superclass, methods);
	}

	/*************************************************************
	 *
	 * Generic Style
	 * 
	 *************************************************************/

	protected static String getGenericStyleSuperclass(Method[] methods) {
		for (Method method : methods) {
			if (method.getParameterCount() == 1 && method
					.getGenericParameterTypes()[0].getTypeName().contains("<")) {
				return method.getParameterTypes()[0].getName();
			}
		}
		return null;
	}

	private static List<String> getGenericStyleJSON(String kind, String superclass, List<Class<?>> classes)
			throws Exception {

		List<String> targetObjects = new ArrayList<String>();
		for (Class<?> targetClass : getGenericStyleClasses(superclass, classes)) {
			targetObjects.add(JSONUtils.objInfo(kind, targetClass));
		}

		return targetObjects;
	}

	private static List<Class<?>> getGenericStyleClasses(String superclass, List<Class<?>> classes) {
		List<Class<?>> targetClasses = new ArrayList<Class<?>>();
		for (Class<?> clz : classes) {
			String typename = Modifier.isAbstract(clz.getSuperclass().getModifiers())
					? (clz.getSuperclass().getSuperclass() == null ? null
							: clz.getSuperclass().getSuperclass().getName())
					: clz.getSuperclass().getName();
			if (superclass.equals(typename)) {
				targetClasses.add(clz);
			}
		}
		return targetClasses;
	}

	/*************************************************************
	 *
	 * Direct Style
	 * 
	 *************************************************************/

	private static String getDirectStyleSuperclass(Method[] methods) {
		int max = 0;
		String superclass = null;
		Map<String, Integer> cached = new HashMap<String, Integer>();
		for (Method method : methods) {
			if (method.getParameterCount() == 1 && !method.getParameterTypes()[0].isInterface() 
					&& !JavaUtils.isBasic(method.getParameterTypes()[0].getName())) {
				String typeName = method.getParameterTypes()[0].getSuperclass().getName();
				Integer itr = cached.get(typeName);
				itr = (itr == null) ? 1 : itr + 1;
				cached.put(typeName, itr);
				superclass = (itr > max) ? typeName : superclass;
				max = (itr > max) ? itr : max;
			}
		}
		return superclass;
	}
	
	private static List<String> getDirectStyleJSON(String kind, String superclass, Method[] methods) throws Exception {
		List<String> targetObjects = new ArrayList<String>();
		for (Class<?> targetClass : getDirectStyleClasses(superclass, methods)) {
			targetObjects.add(JSONUtils.objInfo(kind, targetClass));
		}
		return targetObjects;

	}

	private static List<Class<?>> getDirectStyleClasses(String superclass, Method[] methods) {
		List<Class<?>> targetClasses = new ArrayList<Class<?>>();
		for (Method method : methods) {
			if (method.getParameterCount() == 1 && !JavaUtils.isBasic(method.getParameterTypes()[0].getName()) 
					&& !method.isAnnotationPresent(Deprecated.class) && !method.getParameterTypes()[0].isInterface()
					&& superclass.equals(method.getParameterTypes()[0].getSuperclass().getName())) {
				targetClasses.add(method.getParameterTypes()[0]);
			}
		}
		return targetClasses;
	}
	
	/*************************************************************
	 *
	 * Catalog Style
	 * 
	 *************************************************************/

	private static String getCatalogStyleSuperclass(Method[] methods) {
		int max = 0;
		String superclass = null;
		Map<String, Integer> cached = new HashMap<String, Integer>();
		for (Method m1 : methods) {
			try {
				for (Method m2 : m1.getReturnType().getDeclaredMethods()) {
					if (!m2.getReturnType().isInterface() 
							&& !JavaUtils.isBasic(m2.getReturnType())
							&& !m2.getReturnType().getName().equals("void")) {
						String typeName = m2.getReturnType().getName();
						Integer itr = cached.get(typeName);
						itr = (itr == null) ? 1 : itr + 1;
						cached.put(typeName, itr);
						superclass = (itr > max) ? typeName : superclass;
						max = (itr > max) ? itr : max;
					}
				} 
			} catch (Exception ex) {
				// ignore here
			}
		}
		return (cached.get(superclass) < 20) ?  null : superclass;
	}
	
	private static List<String> getCatalogStyleJSON(String kind, String superclass, Method[] methods) throws Exception {
		List<String> targetObjects = new ArrayList<String>();
		for (Method targetMethod : getCatalogStyleClasses(superclass, methods)) {
			targetObjects.add(JSONUtils.paramInfo(kind, targetMethod));
		}
		return targetObjects;

	}

	private static List<Method> getCatalogStyleClasses(String superclass, Method[] methods) {
		List<Method> targetClasses = new ArrayList<Method>();
		for (Method m1 : methods) {
			for (Method m2 : m1.getReturnType().getDeclaredMethods()) {
				if (m2.getReturnType().getName().equals(superclass)) {
					targetClasses.add(m2);
				}
			}
		}
		return targetClasses;
	}

}
