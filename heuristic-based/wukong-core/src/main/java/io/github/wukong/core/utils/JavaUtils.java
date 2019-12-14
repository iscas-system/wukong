/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package io.github.wukong.core.utils;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * The {@code JavaUtils} class provides some common functions for Java language.
 * 
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @since  2019.1
 */
public class JavaUtils {

	
	/*********************************************************************
	 *
	 * 
	 *                    Java type checker
	 * 
	 * 
	 *********************************************************************/
	
	
	/**
	 * primitive type in Java
	 */
	protected final static Set<String> primitive = new HashSet<String>();
	
	
	static {
		primitive.add(String.class.getName());
		primitive.add(Boolean.class.getName());
		primitive.add(Integer.class.getName());
		primitive.add(Long.class.getName());
		primitive.add(Double.class.getName());
		primitive.add(Float.class.getName());
		primitive.add(Byte.class.getName());
		primitive.add("boolean");
		primitive.add("int");
		primitive.add("long");
		primitive.add("double");
		primitive.add("float");
		primitive.add("byte");
	}
	
	/**
	 * @param typename            typename
	 * @return                    return true if the classname is primitive, otherwise return false
	 */
	public static boolean isPrimitive(String typename) {
		return ObjectUtils.isNullString(typename) ? false : primitive.contains(typename);
	}
	
	
	/**
	 * @param clazz               class
	 * @return                    return true if the typename is primitive, otherwise return false
	 */
	public static boolean isPrimitive(Class<?> clazz) {
		return ObjectUtils.isNullObject(clazz) ? false : isPrimitive(clazz.getName());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * @param typename             typename
	 * @return                     return true if the typename is starts with java.util.Map, otherwise return false
	 */
	public static boolean isMap(String typename) {
		return ObjectUtils.isNullString(typename) ? false : typename.startsWith(Map.class.getName());
	}

	
	/**
	 * @param clazz                class
	 * @return                     return true if the typename is starts with java.util.Map, otherwise return false
	 */
	public static boolean isMap(Class<?> clazz) {
		return ObjectUtils.isNullObject(clazz) ? false : isMap(clazz.getName());
	}
	
	/**
	 * @param typename            typename
	 * @return                    true if the typename is java.util.Map with (String, String) style, otherwise return false
	 */
	public static boolean isStringStringMap(String typename) {
		try {
			return ObjectUtils.isNullString(typename) ? false
					: typename.equals(Map.class.getTypeName() + "<String, String>");
		} catch (Exception e) {
			return false;
		}
	}
	
	
	/**
	 * @param typename             typename
	 * @return                     return true if the typename is Map, but not java.util.Map with (String, String) style, otherwise return false
	 */
	public static boolean isStringObjectMap(String typename) {
		return isMap(typename) && !isStringStringMap(typename);
	}

	
	
	
	
	
	
	
	
	/**
	 * @param typename              typename
	 * @return                      return true if the typename is starts with java.util.List, otherwise return false
	 */
	public static boolean isList(String typename) {
		return ObjectUtils.isNullString(typename) ? false : typename.startsWith(List.class.getName());
	}
	
	/**
	 * @param clazz                 class
	 * @return                      return true if the typename is starts with java.util.List, otherwise return false
	 */
	public static boolean isList(Class<?> clazz) {
		return ObjectUtils.isNullObject(clazz) ? false : isList(clazz.getName());
	}
	
	
	/**
	 * @param typename             typename
	 * @return                     return true if the typename is java.util.List with String style, otherwise return false
	 */
	public static boolean isStringList(String typename) {
		try {
			return ObjectUtils.isNullString(typename) ? false
					: typename.equals(List.class.getTypeName() + "<String>");
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * @param typename              typename
	 * @return                      return true if the typename is starts with java.util.List, but not java.util.List with String style, otherwise return false
	 */
	public static boolean isObjectList(String typename) {
		return isList(typename) && !isStringList(typename);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * @param typename              typename
	 * @return                      return true if the typename is starts with java.util.Set, otherwise return false
	 */
	public static boolean isSet(String typename) {
		return ObjectUtils.isNullString(typename) ? false : typename.startsWith(Set.class.getName());
	}
	
	/**
	 * @param  clazz                class
	 * @return                      return true if the typename is starts with java.util.Set, otherwise return false
	 */
	public static boolean isSet(Class<?> clazz) {
		return ObjectUtils.isNullObject(clazz) ? false : isSet(clazz.getName());
	}
	
	/**
	 * @param typename              typename
	 * @return                      return true if the typename is starts with java.util.Set<String>, otherwise return false
	 */
	public static boolean isStringSet(String typename) {
		try {
			return ObjectUtils.isNullString(typename) ? false
					: typename.equals(JavaUtils.class
							.getDeclaredField("set").getGenericType().getTypeName());
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * @param typename              typename
	 * @return                      return true if the typename is starts with java.util.Set<Object>, otherwise return false
	 */
	public static boolean isObjectSet(String typename) {
		return isSet(typename) && !isStringSet(typename);
	}

	
	
	
	
	
	/*********************************************************************
	 * 
	 * 
	 *                 Java Method Checker        
	 * 
	 * 
	 *********************************************************************/
	
	protected final static Set<String> ignoreMethods = new HashSet<String>();
	
	static {
		ignoreMethods.add("getProtectionDomain");
		ignoreMethods.add("getModifiers");
		ignoreMethods.add("getSuperclass");
		ignoreMethods.add("getComponentType");
		ignoreMethods.add("getAnnotatedInterfaces");
		ignoreMethods.add("getAnnotatedSuperclass");
		ignoreMethods.add("getCanonicalName");
		ignoreMethods.add("getClassLoader");
		ignoreMethods.add("getClasses");
		ignoreMethods.add("getConstructors");
		ignoreMethods.add("getDeclaredAnnotations");
		ignoreMethods.add("getDeclaredClasses");
		ignoreMethods.add("getDeclaredConstructors");
		ignoreMethods.add("getDeclaredFields");
		ignoreMethods.add("getDeclaredMethods");
		ignoreMethods.add("getDeclaringClass");
		ignoreMethods.add("getEnclosingClass");
		ignoreMethods.add("getEnclosingConstructor");
		ignoreMethods.add("getEnclosingMethod");
		ignoreMethods.add("getEnumConstants");
		ignoreMethods.add("getFields");
		ignoreMethods.add("getGenericInterfaces");
		ignoreMethods.add("getGenericSuperclass");
		ignoreMethods.add("getInterfaces");
		ignoreMethods.add("getMethods");
		ignoreMethods.add("getPackage");
		ignoreMethods.add("getSigners");
		ignoreMethods.add("getSimpleName");
		ignoreMethods.add("getTypeName");
		ignoreMethods.add("getTypeParameters");
		ignoreMethods.add("getClass");
		ignoreMethods.add("getBytes");
		ignoreMethods.add("equals");
		ignoreMethods.add("wait");
		ignoreMethods.add("toString");
		ignoreMethods.add("hashCode");
		ignoreMethods.add("notify");
		ignoreMethods.add("notifyAll");
	}
	
	/**
	 * @param name                   name
	 * @return                       if it is in the ignoreMethods, return true
	 */
	public static boolean ignoreMethod(String name) {
		return ObjectUtils.isNullString(name) ? true : ignoreMethods.contains(name);
	}
	
}
