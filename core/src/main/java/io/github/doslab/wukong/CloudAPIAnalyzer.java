/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package io.github.doslab.wukong;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.github.doslab.wukong.utils.ClassUtils;
import io.github.doslab.wukong.utils.JavaUtils;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @since  2020.10.29
 */
public class CloudAPIAnalyzer {

	/**
	 * Method mapper
	 */
	protected final Map<String, String>  methodMappers = new HashMap<>();

	/**
	 * parameter mapper
	 */
	protected final Map<String, Class<?>> paramMappers = new HashMap<>();

	/**
	 * kind
	 */
	protected final String kind;

	/**
	 * client instance
	 */
	protected final Class<?> client;

	/**
	 * classloader
	 */
	protected final CloudClassloader loader;

	/***************************************************************
	 * 
	 * Constructors
	 * 
	 ***************************************************************/

	/**
	 * @param ccm                    ccm
	 * @param loader                 loader
	 * @throws Exception             exception  
	 */
	public CloudAPIAnalyzer(CloudMetadata ccm, CloudClassloader loader) throws Exception {
		this.kind = ccm.getKind();
		this.loader = loader;
		this.client = loader.loadClass(ccm.getClient());
	}


	/***************************************************************
	 * 
	 * analyse
	 * 
	 ***************************************************************/
	/**
	 * @return                            apis
	 */
	public Map<String, JsonNode> extractCloudAPIs() {
		Map<String, Integer> possibleSuperClasses = new HashMap<String, Integer>();
		Map<String, Integer> possibleAPIs = new HashMap<String, Integer>();
		
		boolean generic = findPossibleSuperClassesAndAPIs(possibleSuperClasses, possibleAPIs);

		List<Class<?>> findAllRequestsBySuperClasses = findAllRequestsBySuperClasses(possibleSuperClasses.keySet());

		doAnalysisUseRegisterInfos(possibleAPIs, generic, findAllRequestsBySuperClasses);

		return extractCloudAPIs(findAllRequestsBySuperClasses);
	}


	protected boolean findPossibleSuperClassesAndAPIs(Map<String, Integer> possibleSuperClasses,
			Map<String, Integer> possibleAPIs) {
		boolean generic = false;
		for (Method method : client.getMethods()) {
			if (method.getParameters().length != 1 || method.getParameterTypes()[0].isInterface()
					|| method.getParameterTypes()[0].getSuperclass() == null
					|| method.getParameterTypes()[0].isAssignableFrom(Object.class)
					|| JavaUtils.isPrimitive(method.getReturnType()) || method.getReturnType().isInterface()
					|| method.getReturnType().getTypeName().startsWith("java")
					|| method.getReturnType().getTypeName().equals(client.getName())) {
				continue;
			}

			if (!method.getParameterTypes()[0].getName().equals(method.getGenericParameterTypes()[0].getTypeName())) {
				// Generic type
				possibleSuperClasses.put(method.getParameterTypes()[0].getTypeName(), 100);
				possibleAPIs.put(method.getName(), 100);
				generic = true;
			} else {
				// Direct request
				String typeName = method.getParameterTypes()[0].getSuperclass().getName();
				Integer itr = possibleSuperClasses.get(typeName);
				itr = (itr == null) ? 1 : itr + 1;
				possibleSuperClasses.put(typeName, itr);
			}

		}
		return generic;
	}

	protected void doAnalysisUseRegisterInfos(Map<String, Integer> useMethods, boolean generic,
			List<Class<?>> findAllRequestsBySuperClasses) {

		for (Class<?> clz : findAllRequestsBySuperClasses) {
			if (generic) {
				String value = null;
				for (String str : useMethods.keySet()) {
					if (str.toLowerCase().contains("response")) {
						value = str;
						break;
					}
				}
				String newkey = clz.getSimpleName().substring(0, 1).toLowerCase() + clz.getSimpleName().substring(1);
				methodMappers.put(newkey, value);
				paramMappers.put(newkey, clz);
			} else {
				for (Method mm : client.getDeclaredMethods()) {
					if (mm.getParameterCount() != 1) {
						continue;
					}

					String param = mm.getParameterTypes()[0].getSimpleName();
					String newkey = param.substring(0, 1).toLowerCase() + param.substring(1);
					methodMappers.put(newkey, mm.getName());
					paramMappers.put(newkey, mm.getParameterTypes()[0]);
				}
				break;
			}
		}
	}

	public List<Class<?>> findAllRequestsBySuperClasses(Set<String> superClasses) {
		List<Class<?>> list = new ArrayList<>();
		String pkgName = client.getPackage().getName();
		searchingAllPossiblePackages(superClasses, list, pkgName);
		if (list.isEmpty()) {
			int idx = pkgName.lastIndexOf(".");
			String basename = pkgName.substring(0, idx);
			searchingAllPossiblePackages(superClasses, list, basename);
		}
		return list;
	}

	protected void searchingAllPossiblePackages(Set<String> superClasses, List<Class<?>> list, String pkgname) {
		for (Class<?> clz : ClassUtils.scan(pkgname, this.loader)) {
			if (clz.getModifiers() == Modifier.PUBLIC && clz.getModifiers() != Modifier.ABSTRACT
					&& clz.getAnnotation(Deprecated.class) == null) {
				Class<?> sc = clz.getSuperclass();
				while (!sc.getName().equals(Object.class.getName())) {
					if (superClasses.contains(sc.getName())
							&& !clz.getPackage().getName().equals(client.getPackage().getName())) {
						list.add(clz);
						break;
					}
					sc = sc.getSuperclass();
				}
			}
		}
	}
	
	/***************************************************************
	 * 
	 * analyse
	 * 
	 ***************************************************************/
	
	/**
	 * @param list                               list
	 * @return                                   map
	 */
	protected Map<String, JsonNode> extractCloudAPIs(List<?> list)  {
		Map<String, JsonNode> map = new HashMap<>();
		for (Object obj : list) {
			ObjectNode spec = new ObjectMapper().createObjectNode();
			
			ObjectNode life = new ObjectMapper().createObjectNode();
			Class<?> clz = (Class<?>) obj;
			String str = clz.getSimpleName().substring(0, 1).toLowerCase() + clz.getSimpleName().substring(1);
			life.set(str, objInfo(clz));
			
			spec.set("lifecycle", life);

			map.put(str, spec);
		}
		return map;
	}
	
	public static ObjectNode objInfo(Class<?> cls)  {

		ObjectNode obj = new ObjectMapper().createObjectNode();

		for (Field field : cls.getDeclaredFields()) {

			if ((!Modifier.isPrivate(field.getModifiers()) && !Modifier.isProtected(field.getModifiers()))
					|| Modifier.isFinal(field.getModifiers()) || Modifier.isStatic(field.getModifiers())) {
				continue;
			}

			String type = field.getType().getTypeName();
			String key = field.getName();

			toJSON(obj, type, key);
		}

		return obj;
	}
	
	protected static void toJSON(ObjectNode obj, String type, String key) {
		if (JavaUtils.isPrimitive(type)) {
			if (type.equals(Boolean.class.getName()) || type.equals("boolean")) {
				obj.put(key, true);
			} else if (type.equals(String.class.getName()) || type.equals("String")) {
				obj.put(key, "String");
			} else {
				obj.put(key, 1);
			}
		} else if (JavaUtils.isStringList(type) || JavaUtils.isStringSet(type)) {
			ArrayNode list = new ObjectMapper().createArrayNode();
			list.add(String.class.getSimpleName());
			list.add(String.class.getSimpleName());
			obj.set(key, list);
		} else if (JavaUtils.isStringStringMap(type)) {
			ObjectNode map = new ObjectMapper().createObjectNode();
			map.put(String.class.getName() + "0", String.class.getSimpleName());
			map.put(String.class.getName() + "1", String.class.getSimpleName());
			obj.set(key, map);
		} else if (JavaUtils.isObjectList(type) || JavaUtils.isObjectSet(type)) {

			int sidx = type.indexOf("<");
			int eidx = type.indexOf(">");

			try {
				String newObjClass = type.substring(sidx + 1, eidx);
				ArrayNode list = new ObjectMapper().createArrayNode();
				list.add(objInfo(Class.forName(newObjClass)));
				list.add(objInfo(Class.forName(newObjClass)));
				obj.set(key, list);
			} catch (Exception ex) {
				return;
			}

		} else if (JavaUtils.isStringObjectMap(type)) {

			int sidx = type.indexOf("<");
			int eidx = type.indexOf(",");

			try {
				String newObjClass = type.substring(sidx + 1, eidx);
				ObjectNode map = new ObjectMapper().createObjectNode();
				map.set(String.class.getName() + "0", objInfo(Class.forName(newObjClass)));
				map.set(String.class.getName() + "1", objInfo(Class.forName(newObjClass)));
				obj.set(key, map);
			} catch (Exception ex) {
				return;
			}

		} else {
			
			if (type.contains("java.lang")) {
				return;
			}
			
			try {
				obj.set(key, objInfo(Class.forName(type)));
			} catch (Exception ex) {
				// ignore here
			}
		}
	}
	
	


	/***************************************************************
	 * 
	 * Getters
	 * 
	 ***************************************************************/
	/**
	 * @return kind
	 */
	public String getKind() {
		return kind;
	}

	public Class<?> getClient() {
		return client;
	}

	public Map<String, Class<?>> getParams() {
		return paramMappers;
	}

	public Map<String, String> getMethods() {
		return methodMappers;
	}

	public String getAPI(String key) {
		return methodMappers.get(key);
	}
	
	public Class<?> getData(String key) {
		return paramMappers.get(key);
	}
}
