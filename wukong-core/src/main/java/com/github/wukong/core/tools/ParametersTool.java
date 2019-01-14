/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.wukong.core.tools;

import com.alibaba.fastjson.JSON;
import com.github.wukong.core.utils.JavaUtils;

import java.util.*;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @since  2019.1
 */
public class ParametersTool {

	/**
	 * @param type type
	 * @param kind kind
	 * @param models models
	 */
	public static void showModelParametersWithKeyValueStyle(String kind, Map<String, String> models) {
		System.out.println("## " + kind + " parameterss:");
		System.out.println();
		System.out.println("```");
		for (String key : models.keySet()) {
			System.out.println("- " + key + " = " + models.get(key));
		}
		System.out.println("```");
	}
	
	/**
	 * @param type type
	 * @param kind kind
	 * @param models models
	 */
	public static void showModelParametersWithNetstedStyle(String kind, Map<String, String> models) {
		System.out.println("## " + kind + " parameterss:");
		System.out.println();
		System.out.println("```");
		for (String key : models.keySet()) {
			System.out.println("- " + getIndent(key) + getSimpleName(key) + " = " + models.get(key));
		}
		System.out.println("```");
	}
	
	/**
	 * @param type type
	 * @param kind kind
	 * @param models models
	 */
	public static void showModelParametersWithJsonStyle(String kind, Map<String, String> models) {
		System.out.println("## " + kind + " parameterss:");
		System.out.println();
		System.out.println("```");
		System.out.println(JSON.toJSONString(toJSonStyle(models)));
		System.out.println("```");
	}
	
	/*********************************************************************
	 * 
	 * 
	 *********************************************************************/
	
	/**
	 * @param models models
	 * @return map
	 */
	public static Map<String, Map<String, Object>> toJSonStyle(Map<String, String> models) {
		Map<String, Map<String, Object>> json = new LinkedHashMap<String, Map<String, Object>>();
		int id = 0;
		String type = "main";
		String prefix = null;
		for (String key : models.keySet()) {
			if (prefix != null && !key.contains(prefix)) {
				type = "main";
				prefix = null;
			}
			String value = models.get(key);
			if (!json.keySet().contains(type)) {
				json.put(type, new LinkedHashMap<String, Object>());
			}
			Map<String, Object> kv = json.get(type);
			if (JavaUtils.isPrimitive(value)) {
				kv.put(getRealKey(key, prefix), value);
			} else if (JavaUtils.isStringList(value)
					|| JavaUtils.isStringSet(value)) {
				List<String> list = new ArrayList<String>();
				list.add(String.class.getName() + "0");
				list.add(String.class.getName() + "1");
				kv.put(getRealKey(key, prefix), list);
			} else if (JavaUtils.isStringStringMap(value)) {
				Map<String, String> map = new HashMap<String, String>();
				map.put(String.class.getName() + "0", String.class.getName() + "0");
				map.put(String.class.getName() + "1", String.class.getName() + "1");
				kv.put(getRealKey(key, prefix), map);
			} else if (JavaUtils.isObjectList(value)
					|| JavaUtils.isObjectSet(value)) {
				id += 1;
				type = "ref" + id + "-" + JavaUtils.getClassNameForListOrSetStyle(value);
				prefix = key;
				List<String> list = new ArrayList<String>();
				list.add(type);
				kv.put(getRealKey(key, prefix), list);
			} else if (JavaUtils.isStringObjectMap(value)) {
				id += 1;
				type = "ref" + id + "-" + JavaUtils.getClassNameForMapStyle(value);
				prefix = key;
				Map<String, String> map = new HashMap<String, String>();
				map.put(String.class.getName() + "0", type);
				kv.put(getRealKey(key, prefix), map);
			} else {
				continue;
			}
		}
		return json;
	}
	
	/**
	 * @param key  key
	 * @param prefix prefix
	 * @return prefix-key
	 */
	public static String getRealKey(String key, String prefix) {
		try {
			return key.substring(prefix.length() + 1);
		} catch (Exception e) {
			return key;
		}
		
	}

	/**
	 * @param fullname fullname
	 * @return true if ok
	 */
	protected static String getSimpleName(String fullname) {
		int idx = fullname.lastIndexOf("-");
		return idx == -1 ? fullname : fullname.substring(idx + 1);
	}
	
	/**
	 * @param fullname fullname
	 * @return true
	 */
	protected static String getIndent(String fullname) {
		int num = fullname.split("-").length;
		StringBuffer sb = new StringBuffer();
		while (--num > 0) {
			sb.append("\t");
		}
		return sb.toString();
	}

	
}
