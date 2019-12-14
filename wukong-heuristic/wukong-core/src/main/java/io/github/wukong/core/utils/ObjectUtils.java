/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package io.github.wukong.core.utils;

/**
 * The {@code ObjectUtils} class provides some common functions for Java object.
 * 
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @since  2019.1
 */
public class ObjectUtils {

	/**
	  * Check whether an object is null
	 * 
	 * @param obj                object
	 * @return                   return true of the object is null, otherwise return false
	 */
	public static boolean isNullObject(Object obj) {
		return (obj == null) ? true : false;
	}
	
	/**
	 * Check whether a string is null
	 * 
	 * @param str                 string
	 * @return                    return true of the string is null, otherwise return false
	 */
	public static boolean isNullString(String str) {
		return (str == null || "".equals(str)) ? true : false;
	}

}
