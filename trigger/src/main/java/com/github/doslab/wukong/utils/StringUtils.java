/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong.utils;

/**
 * 
 * @author tangting18@otcaix.iscas.ac.cn
 * @since 2019.12.10
 * 
 * This code comes from Internet, it works well in our case.
 */
public class StringUtils {

	public static String toMiddleString(String str, String prefix, String postfix) {
		int stx = str.indexOf(prefix);
		int etx = str.indexOf(postfix);
		return str.substring(stx + prefix.length(), etx);
	}
	
	public static String toDateTime(String date) {
		String[] splits = date.split(",");
		return splits[1].trim() + toDateTimePostfix(splits[0]);
	}
	
	public static int toMonth(String eng) {
		if (eng.trim().equals("Jan")) {
			return 1;
		} else if (eng.trim().equals("Feb")) {
			return 2;
		} else if (eng.trim().equals("Mar")) {
			return 3;
		} else if (eng.trim().equals("Apr")) {
			return 4;
		} else if (eng.trim().equals("May")) {
			return 5;
		} else if (eng.trim().equals("Jun")) {
			return 6;
		} else if (eng.trim().equals("Jul")) {
			return 7;
		} else if (eng.trim().equals("Aug")) {
			return 8;
		} else if (eng.trim().equals("Sep")) {
			return 9;
		} else if (eng.trim().equals("Oct")) {
			return 10;
		} else if (eng.trim().equals("Nov")) {
			return 11;
		} else if (eng.trim().equals("Dec")) {
			return 12;
		} 
		return -1;
	}
	
	public static String toDateTimePostfix(String eng) {
		if (eng.trim().equals("Jan")) {
			return "-01-01 00:00:00";
		} else if (eng.trim().equals("Jan")) {
			return "-01-01 00:00:00";
		} else if (eng.trim().equals("Feb")) {
			return "-02-01 00:00:00";
		} else if (eng.trim().equals("Mar")) {
			return "-03-01 00:00:00";
		} else if (eng.trim().equals("Apr")) {
			return "-04-01 00:00:00";
		} else if (eng.trim().equals("May")) {
			return "-05-01 00:00:00";
		} else if (eng.trim().equals("Jun")) {
			return "-06-01 00:00:00";
		} else if (eng.trim().equals("Jul")) {
			return "-07-01 00:00:00";
		} else if (eng.trim().equals("Aug")) {
			return "-08-01 00:00:00";
		} else if (eng.trim().equals("Sep")) {
			return "-09-01 00:00:00";
		} else if (eng.trim().equals("Oct")) {
			return "-10-01 00:00:00";
		} else if (eng.trim().equals("Nov")) {
			return "-11-01 00:00:00";
		} else if (eng.trim().equals("Dec")) {
			return "-12-01 00:00:00";
		} 
		return null;
	}
}
