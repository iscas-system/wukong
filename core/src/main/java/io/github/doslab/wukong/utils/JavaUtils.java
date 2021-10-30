/**
 * Copyrigt (2021, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.doslab.wukong.utils;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * @author wuheng@iscas.ac.cn
 * @since  2021.10.30
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
	protected final static Set<String> primitive = new HashSet<>();
	
	
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
	 * @param  typename typename
	 * @return return true if the class is primitive, otherwise return false
	 */
	public static boolean isPrimitive(String typename) {
		return isNull(typename) ? false : primitive.contains(typename);
	}
	
	
	/**
	 * @param clazz class
	 * @return return true if the type is primitive, otherwise return false
	 */
	public static boolean isPrimitive(Class<?> clazz) {
		return isNull(clazz) ? false : isPrimitive(clazz.getName());
	}
	
	/**
	 * @param typename typename
	 * @return return true if the typename is starts with java.util.Map, otherwise return false
	 */
	public static boolean isMap(String typename) {
		return isNull(typename) ? false : typename.startsWith(Map.class.getName());
	}

	
	/**
	 * 
	 */
	protected final static Map<String, String> map = null; 
	
	/**
	 * @param typename typename
	 * @return  true if the typename is java.util.Map(String, String) with (String, String) style, otherwise return false
	 */
	public static boolean isStringStringMap(String typename) {
			try {
				return isNull(typename) ? false
						: typename.equals(JavaUtils.class
								.getDeclaredField("map").getGenericType().getTypeName());
			} catch (NoSuchFieldException e) {
			} catch (SecurityException e) {
			}
			return false;
	}
	
	/**
	 * @param clazz class
	 * @return return true if the typename is starts with java.util.Map, otherwise return false
	 */
	public static boolean isMap(Class<?> clazz) {
		return isNull(clazz) ? false : isMap(clazz.getName());
	}
	
	/**
	 * @param typename typename
	 * @return return true if the typename is Map, but not java.util.MapM(String, String), otherwise return false
	 */
	public static boolean isStringObjectMap(String typename) {
		return isMap(typename) && !isStringStringMap(typename);
	}

	
	/**
	 * list
	 */
	protected final static List<String> list = null; 
	
	/**
	 * @param typename typename
	 * @return return true if the typename is java.util.List(String), otherwise return false
	 */
	public static boolean isStringList(String typename) {
		try {
			return isNull(typename) ? false
					: typename.equals(JavaUtils.class
							.getDeclaredField("list").getGenericType().getTypeName());
		} catch (NoSuchFieldException e) {
		} catch (SecurityException e) {
		}
		return false;
	}


	/**
	 * @param typename typename
	 * @return return true if the typename is starts with java.util.List, otherwise return false
	 */
	public static boolean isList(String typename) {
		return isNull(typename) ? false : typename.startsWith(List.class.getName());
	}

	/**
	 * @param typename typename
	 * @return return true if the typename is starts with java.util.List, but not java.util.List(String)
	 */
	public static boolean isObjectList(String typename) {
		return isList(typename) && !isStringList(typename);
	}
	
	/**
	 * set
	 */
	protected final static Set<String> set = null; 
	
	/**
	 * @param typename typename
	 * @return true if true if the typename is starts with java.util.Set(String)
	 */
	public static boolean isStringSet(String typename) {
		try {
			return isNull(typename) ? false
					: typename.equals(JavaUtils.class
							.getDeclaredField("set").getGenericType().getTypeName());
		} catch (Exception e) {
			return false;
		}
	}


	/**
	 * @param typename typename
	 * @return true if the typename is starts with java.util.Set
	 */
	public static boolean isSet(String typename) {
		return isNull(typename) ? false : typename.startsWith(Set.class.getName());
	}

	
	/**
	 * @param typename  typename
	 * @return true if the typename is starts with java.util.List, but not java.util.Set(String)
	 */
	public static boolean isObjectSet(String typename) {
		return isSet(typename) && !isStringSet(typename);
	}


	/**
	 * @param str       str
	 * @return  true if str is null
	 */
	public static boolean isNull(String str) {
		return (str == null || "".equals(str)) ? true : false;
	}
	
	/**
	 * @param obj       obj
	 * @return true if object is null
	 */
	public static boolean isNull(Object obj) {
		return (obj == null) ? true : false;
	}
}
