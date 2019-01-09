/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package com.github.wukong.core.utils;

/**
 * The {@code StringUtils} class provides some common String processing functions.
 * 
 * @author wuheng@iscas.ac.cn
 * @since  2019.1
 */
public class StringUtils {
	
	/**
	 * Check whether a string is null
	 * 
	 * @param str string
	 * @return return true of the string is null, otherwise return false
	 */
	public static boolean isNull(String str) {
		return (str == null || "".equals(str)) ? true : false;
	}
	
}
