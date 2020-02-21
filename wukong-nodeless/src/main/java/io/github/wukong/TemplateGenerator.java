/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package io.github.wukong;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import io.github.wukong.aliyunvm.AliyunEcsKindAnalyzer;
import io.github.wukong.amazonvm.AmazonCE2KindAnalyzer;
import io.github.wukong.core.KindAnalyzer;
import io.github.wukong.tencentvm.TencnetVMKindAnalyzer;

/**
 * @author wuheng@(otcaix.iscas.ac.cn)
 *
 */
public class TemplateGenerator {

	public final static String DEFAULT_DIR = "E:/codes/kubeext-http-apiserver/jsons";
	
	public final static String TEMP_POSTFIX = "Template";
	
	public final static String JSON_FILE = ".json";
	
	public final static Map<String, String> kinds = new HashMap<String, String>();

	public final static String JSONTEMP = "{\r\n" + 
			"  \"apiVersion\":\"cloudplus.io/v1alpha3\",\r\n" + 
			"  \"kind\":\"KIND\",\r\n" + 
			"  \"metadata\":{\r\n" + 
			"    \"name\":\"NAME\"\r\n" + 
			"  },\r\n" + 
			"  \"spec\":{\r\n" + 
			"    \"data\":{\r\n" + 
			"      \"lifecycle\": JSON\r\n" + 
			"    },\r\n" + 
			"    \"type\":\"TYPE\"\r\n" + 
			"  }\r\n" + 
			"}";
	
	static {
//		kinds.put("BaiduVM", BaiduBCEKindAnalyzer.class.getName());
		kinds.put("AliyunVM", AliyunEcsKindAnalyzer.class.getName());
		kinds.put("TencentVM", TencnetVMKindAnalyzer.class.getName());
		kinds.put("AmazonVM", AmazonCE2KindAnalyzer.class.getName());
	}
	
	
	public static void generateJSONs(String kind, KindAnalyzer analyzer) {
		for (String name : analyzer.getKinds()) {
			try {
				String jkind = kind + TEMP_POSTFIX;
				String jname = kind.toLowerCase() + "-" + name.toLowerCase();
				String jdata = JsonUtils.createJSON(name.toLowerCase(), Class.forName(analyzer.getModel(name)));
				String json = JSONTEMP.replaceAll("KIND", jkind)
										.replaceAll("NAME", jname)
										.replaceAll("JSON", jdata)
										.replaceAll("TYPE", kind);
				FileUtils.createFile(DEFAULT_DIR + "/" + kind.toLowerCase() + TEMP_POSTFIX, 
									jname + JSON_FILE, json);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public static void generateCMDs(String kind, KindAnalyzer analyzer) {
		StringBuffer sb = new StringBuffer();
		for (String name : analyzer.getKinds()) {
			try {
//				String jkind = kind + TEMP_POSTFIX;
//				String jname = kind.toLowerCase() + "-" + name.toLowerCase();
//				String jdata = JsonUtils.createJSON(name.toLowerCase(), Class.forName(analyzer.getModel(name)));
//				String json = JSONTEMP.replaceAll("KIND", jkind)
//										.replaceAll("NAME", jname)
//										.replaceAll("JSON", jdata)
//										.replaceAll("TYPE", kind);
//				FileUtils.createFile(DEFAULT_DIR + "/" + kind.toLowerCase() + TEMP_POSTFIX, 
//									jname + JSON_FILE, json);
				sb.append(name.substring(0, 1).toLowerCase() + name.substring(1) 
								+ "::" + analyzer.getDesc(name) + ":" + analyzer.getModel(name) + ";default:defaut;;");
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		System.out.println(sb.toString());
	}
	
	public static void main(String[] args) throws Exception {
		for (String kind : kinds.keySet()) {
			KindAnalyzer ka = (KindAnalyzer) Class.forName(
					kinds.get(kind)).newInstance();
			System.out.println("---" + kind);
			generateCMDs(kind, ka);
		}
//		generateJSONs();
	}

	public static void generateJSONs() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		for (String kind : kinds.keySet()) {
			KindAnalyzer ka = (KindAnalyzer) Class.forName(
					kinds.get(kind)).newInstance();
			generateJSONs(kind, ka);
		}
	}
	
	public static class FileUtils {

		public static void createFile(String dir, String name, String data) throws Exception {
			
			File fdir = new File(dir);
			
			// create directory
			if (!fdir.exists()) {
				fdir.mkdirs();
			}
			
			// delete existing file
			File file = new File(fdir, name);
			if (file.exists()) {
				file.delete();
			}
			
			// create new file
			file.createNewFile();
			FileWriter fileWritter = new FileWriter(file, true);
			BufferedWriter out = new BufferedWriter(fileWritter);
			out.write(data);
			out.flush();
			out.close();
			
		}
	}
	
	public static class JsonUtils {
		
		public static String createJSON(String operator, Class<?> clazz) throws Exception {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put(operator, createObject(clazz));
			return JSON.toJSONString(map, SerializerFeature.PrettyFormat, 
					SerializerFeature.WriteMapNullValue, 
					SerializerFeature.WriteDateUseDateFormat);
		}
		
		protected static Map<String, Object> createObject(Class<?> clazz) throws Exception {
			Map<String, Object> model = new HashMap<String, Object>();
			for (Method method: clazz.getDeclaredMethods()) {
				if ((!method.getName().startsWith("set")
						|| !Modifier.isStatic(method.getModifiers()))
						&& Modifier.isPublic(method.getModifiers())
						&& method.getParameterCount() == 1) {
					String value = method.getGenericParameterTypes()[0].getTypeName();
					String key = method.getName().substring(3).toLowerCase();
					if (JavaUtils.isPrimitive(value)
							|| JavaUtils.isStringList(value)
							|| JavaUtils.isStringSet(value)
							|| JavaUtils.isStringStringMap(value)) {
						model.put(key, JavaUtils.typeMapping.get(value));
					}  else if (JavaUtils.isObjectList(value) 
							|| JavaUtils.isObjectSet(value)) {
						int idx = value.indexOf("<");
						model.put(key, createObject(Class.forName(
								value.substring(idx + 1, value.length() -1 ).trim())));
						model.put(key, createObject(Class.forName(
								value.substring(idx + 1, value.length() -1 ).trim())));
					} else if (JavaUtils.isStringObjectMap(value)) {
						Map<String, Object> newValue = new HashMap<String, Object>();
						int start = value.indexOf(",");
						int end = value.lastIndexOf(">");
						String classname = value.substring(start + 1, end).trim();
						newValue.put("key1", createObject(Class.forName(classname)));
						newValue.put("key2", createObject(Class.forName(classname)));
						model.put(key, newValue);
					}
				}
			}
			return model;
		}
		
	}
	
	public static class JavaUtils {

		public static final Map<String, String> typeMapping = new HashMap<String, String>();
		
		static {
			typeMapping.put(String.class.getName(), String.class.getSimpleName().toLowerCase());
			typeMapping.put(Integer.class.getName(), Integer.class.getSimpleName().toLowerCase());
			typeMapping.put(Float.class.getName(), Float.class.getSimpleName().toLowerCase());
			typeMapping.put(Double.class.getName(), Double.class.getSimpleName().toLowerCase());
			typeMapping.put("String", String.class.getSimpleName().toLowerCase());
			typeMapping.put("int", Integer.class.getSimpleName().toLowerCase());
			typeMapping.put("float", Float.class.getSimpleName().toLowerCase());
			typeMapping.put("double", Double.class.getSimpleName().toLowerCase());
		}
		
		public static String getJavaType(Class<?> clazz) {
			String type = typeMapping.get(clazz.getName());
			return (type == null) ? clazz.getName() : type;
		}
		
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
		 * @param typename typename
		 * @return return true if the classname is primitive, otherwise return false
		 */
		public static boolean isPrimitive(String typename) {
			return isNull(typename) ? false : primitive.contains(typename);
		}
		
		
		/**
		 * @param clazz class
		 * @return return true if the typename is primitive, otherwise return false
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
		 * @return  true if the typename is java.util.Map with (String, String) style, otherwise return false
		 */
		public static boolean isStringStringMap(String typename) {
			try {
				return isNull(typename) ? false
						: typename.equals(JavaUtils.class
								.getDeclaredField("map").getGenericType().getTypeName());
			} catch (Exception e) {
				return false;
			}
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
		 * @return return true if the typename is Map, but not java.util.Map with (String, String) style, otherwise return false
		 */
		public static boolean isStringObjectMap(String typename) {
			return isMap(typename) && !isStringStringMap(typename);
		}

		
		/**
		 * 
		 */
		protected final static List<String> list = null; 
		
		/**
		 * @param typename typename
		 * @return return true if the typename is java.util.List with String style, otherwise return false
		 */
		public static boolean isStringList(String typename) {
			try {
				return isNull(typename) ? false
						: typename.equals(JavaUtils.class
								.getDeclaredField("list").getGenericType().getTypeName());
			} catch (Exception e) {
				return false;
			}
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
		 * @return return true if the typename is starts with java.util.List, but not java.util.List with String style, otherwise return false
		 */
		public static boolean isObjectList(String typename) {
			return isList(typename) && !isStringList(typename);
		}
		
		/**
		 * 
		 */
		protected final static Set<String> set = null; 
		
		/**
		 * @param typename typename
		 * @return 是否是String类型的Set
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
		 * @param typename
		 *            名字
		 * @return 是否是Set
		 */
		public static boolean isSet(String typename) {
			return isNull(typename) ? false : typename.startsWith(Set.class.getName());
		}

		/**
		 * @param typename
		 *            名字
		 * @return 是否是Object类型的Set
		 */
		public static boolean isObjectSet(String typename) {
			return isSet(typename) && !isStringSet(typename);
		}

		/**
		 * @param typename
		 * @return Map中对象
		 */
		public static String getClassNameForMapStyle(String typename) {
			if (!isMap(typename)) {
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
			if (!isList(typename) && !isSet(typename)) {
				throw new InvalidParameterException("typename shoule be Map");
			}
			int start = typename.indexOf("<");
			int end = typename.indexOf(">");
			return (start == -1) ? typename 
					: typename.substring(start + 1, end).trim();
		}
		
		/*********************************************************************
		 * 
		 * 
		 *                         
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
		 * @param name 名字
		 * @return 是否过滤
		 */
		public static boolean ignoreMethod(String name) {
			return isNull(name) ? true : ignoreMethods.contains(name);
		}	
		
		/**
		 * Check whether a string is null
		 * 
		 * @param str string
		 * @return return true of the string is null, otherwise return false
		 */
		public static boolean isNull(String str) {
			return (str == null || "".equals(str)) ? true : false;
		}
		
		/**
		 * 判断对象是否为空
		 * 
		 * @param obj 对象
		 * @return 是否为空
		 */
		public static boolean isNull(Object obj) {
			return (obj == null) ? true : false;
		}
	}
	
}
