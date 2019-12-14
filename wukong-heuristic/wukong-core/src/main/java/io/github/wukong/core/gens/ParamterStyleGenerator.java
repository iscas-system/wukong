/**
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.wukong.core.gens;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import io.github.wukong.core.utils.JavaUtils;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @since 2019/5/7
 * 
 */
public class ParamterStyleGenerator {

	/**
	 * @param name name
	 * @param kinds kinds
	 */
	public static void showAllFeatures(String name, Set<String> kinds) {
		System.out.println("## " + name + " features:");
		System.out.println();
		System.out.println("```");
		for (String kind : kinds) {
			System.out.println("- " + kind);
		}
		System.out.println("```");
	}
	
	/**
	 * @param kinds kinds
	 */
	public static void testFeaturesWithTrueResults(Set<String> kinds) {
		for (String kind : kinds) {
			System.out.println("Assert.assertEquals(kinds.contains(\"" + kind
					+ "\"), true);");
		}
		
	}
	
	/**
	 * @param kinds kinds
	 */
	public static void testFeaturesWithFalseResults(Set<String> kinds) {
		for (String kind : kinds) {
			System.out.println("Assert.assertEquals(kinds.contains(\"" + kind
					+ "False\"), false);");
		}
		
	}
	
	/**
	 * @param name name
	 * @param models models
	 */
	public static void showAllModels(String name, Map<String, String> models) {
		System.out.println("## " + name + " models:");
		System.out.println();
		System.out.println("```");
		Set<String> kinds = models.keySet();
		for (String kind : kinds) {
			System.out.println("- " + kind + " = " + models.get(kind));
		}
		System.out.println("```");
	}
	
	/**
	 * @param models models
	 */
	public static void testModelsWithTrueResults(Collection<String> models) {
		for (String model : models) {
			System.out.println("Assert.assertEquals(models.contains(\"" + model
					+ "\"), true);");
		}
		
	}
	
	/**
	 * @param models models
	 */
	public static void testModelsWithFalseResults(Collection<String> models) {
		for (String model : models) {
			System.out.println("Assert.assertEquals(models.contains(\"" + model
					+ "False\"), false);");
		}
		
	}
	
	/**
	 * @param set1 set1
	 * @param set2 set1
	 * @return true if set1 == set2
	 */
	public static boolean testGreatAndEuqalFeatures(Set<String> set1, Set<String> set2) {
		if (set1.size() < set2.size()) {
			return false;
		}
		
		return set1.containsAll(set2);
	}
	
	/**
	 * @param set1 set1
	 * @param set2 set1
	 * @return true if set1 == set2
	 */
	public static boolean testEuqalFeatures(Set<String> set1, Set<String> set2) {
		if (set1.size() != set2.size()) {
			return false;
		}
		
		return set1.containsAll(set2);
	}
	
	/**
	 * @param type type
	 * @param kind kind
	 * @param models models
	 */
	public static void showModelParametersWithKeyValueStyle(String kind, Map<String, String> models) {
		System.out.println("## " + kind + " parameterss:");
		System.out.println();
		System.out.println("URL: http://[spring application.yml]/vm/" + kind);
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
		System.out.println("URL: http://[spring application.yml]/vm/" + kind);
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
		System.out.println("URL: http://[spring application.yml]/vm/" + kind);
		System.out.println();
		System.out.println("```");
		System.out.println(JSON.toJSONString(toJSonStyle(models), 
								SerializerFeature.PrettyFormat, 
								SerializerFeature.WriteMapNullValue, 
								SerializerFeature.WriteDateUseDateFormat));
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
				type = "ref" + id + "-" + getClassNameForListOrSetStyle(value);
				prefix = key;
				List<String> list = new ArrayList<String>();
				list.add(type);
				kv.put(getRealKey(key, prefix), list);
			} else if (JavaUtils.isStringObjectMap(value)) {
				id += 1;
				type = "ref" + id + "-" + getClassNameForMapStyle(value);
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
	
	/**
	 * @param typename
	 * @return Map中对象
	 */
	public static String getClassNameForMapStyle(String typename) {
		if (!JavaUtils.isMap(typename)) {
			throw new InvalidParameterException("typename shoule be Map");
		}
		int start = typename.indexOf(",");
		int end = typename.indexOf(">");
		return (start == -1) ? typename 
				: typename.substring(start + 1, end).trim(); // <String, Object>的,后有一个空格
	}

	/**
	 * @param typename
	 *            名字
	 * @return List中对象
	 */
	public static String getClassNameForListOrSetStyle(String typename) {
		if (!JavaUtils.isList(typename) && !JavaUtils.isSet(typename)) {
			throw new InvalidParameterException("typename shoule be Map");
		}
		int start = typename.indexOf("<");
		int end = typename.indexOf(">");
		return (start == -1) ? typename 
				: typename.substring(start + 1, end).trim();
	}
	
}
