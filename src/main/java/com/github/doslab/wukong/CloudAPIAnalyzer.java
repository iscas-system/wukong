/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong;

import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.github.doslab.wukong.utils.ClassUtils;
import com.github.doslab.wukong.utils.JSONUtils;
import com.github.doslab.wukong.utils.JavaUtils;

/**
 * @author tangting18@otcaix.iscas.ac.cn
 * @author wuheng@otcaix.iscas.ac.cn
 * @since 2020.3.8
 */
public class CloudAPIAnalyzer {

	/**
	 * target dir
	 */
	protected static final String TARGET_DIR = "target/";

	/**
	 * lib dir
	 */
	protected static final String LIB_DIR = "lib";

	/**
	 * file prefix
	 */
	protected static final String JAR_NAME_PREFIX = "crosscloud-";

	/**
	 * file postfix
	 */
	protected static final String JAR_NAME_POSTFIX = "jar-with-dependencies.jar";

	/**
	 * Method mapper
	 */
	protected final Map<String, String> methodMappers = new HashMap<String, String>();

	/**
	 * parameter mapper
	 */
	protected final Map<String, Class<?>> paramMappers = new HashMap<String, Class<?>>();

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
	protected final ClassLoader loader;

	/***************************************************************
	 * 
	 * Constructors
	 * 
	 ***************************************************************/

	/**
	 * @param kind   kind
	 * @param client client
	 * @throws Exception exception
	 */
	public CloudAPIAnalyzer(String kind, String client) throws Exception {
		this(kind, client, CloudAPIAnalyzer.class.getClassLoader());
	}

	public CloudAPIAnalyzer(CloudMetadata ccm) throws Exception {
		this(ccm.getKind(), ccm.getClient(), new URLClassLoader(toURLs(getUrl(ccm))));
	}

	public CloudAPIAnalyzer(String kind, String client, ClassLoader loader) throws Exception {
		super();
		this.kind = kind;
		this.loader = loader;
		this.client = loader.loadClass(client);
	}

	/***************************************************************
	 * 
	 * Core
	 * 
	 ***************************************************************/
	/**
	 * @return list
	 */
	public Map<String, JsonNode> extraCloudAPIs() {
		Map<String, Integer> superClasses = new HashMap<String, Integer>();
		Map<String, Integer> useMethods = new HashMap<String, Integer>();
		boolean generic = false;
		for (Method method : client.getMethods()) {
			if (method.getParameters().length != 1 || method.getParameterTypes()[0].isInterface()
					|| method.getParameterTypes()[0].getSuperclass() == null
					|| method.getParameterTypes()[0].isAssignableFrom(Object.class)
					|| JavaUtils.isBasic(method.getReturnType()) || method.getReturnType().isInterface()
					|| method.getReturnType().getTypeName().startsWith("java")
					|| method.getReturnType().getTypeName().equals(client.getName())) {
				continue;
			}

			if (!method.getParameterTypes()[0].getName().equals(method.getGenericParameterTypes()[0].getTypeName())) {
				// Generic type
				superClasses.put(method.getParameterTypes()[0].getTypeName(), 100);
				useMethods.put(method.getName(), 100);
				generic = true;
			} else {
				// Direct request
				String typeName = method.getParameterTypes()[0].getSuperclass().getName();
				Integer itr = superClasses.get(typeName);
				itr = (itr == null) ? 1 : itr + 1;
				superClasses.put(typeName, itr);
			}

		}

		List<Class<?>> findAllRequestsBySuperClasses = findAllRequestsBySuperClasses(superClasses.keySet());

		doAnalysisUseRegisterInfos(useMethods, generic, findAllRequestsBySuperClasses);

		return generateLifecycle(findAllRequestsBySuperClasses);
	}

	protected Map<String, JsonNode> generateLifecycle(List<?> list)  {
		Map<String, JsonNode> map = new HashMap<>();
		for (Object obj : list) {

			ObjectNode spec = new ObjectMapper().createObjectNode();
			
			ObjectNode life = new ObjectMapper().createObjectNode();
			Class<?> clz = (Class<?>) obj;
			String str = clz.getSimpleName().substring(0, 1).toLowerCase() + clz.getSimpleName().substring(1);
			life.set(str, JSONUtils.objInfo(clz));
			
			spec.set("lifecycle", life);

			map.put(str, spec);
		}
		return map;
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
		List<Class<?>> list = new ArrayList<Class<?>>();
		String pkgName = client.getPackage().getName();
		searchingAllPossiblePackages(superClasses, list, pkgName);
		if (list.size() == 0) {
			int idx = pkgName.lastIndexOf(".");
			String basename = pkgName.substring(0, idx);
			searchingAllPossiblePackages(superClasses, list, basename);
		}
		return list;
	}

	protected void searchingAllPossiblePackages(Set<String> superClasses, List<Class<?>> list, String pkgname) {
		System.out.println("now at: " + pkgname);
		for (Class<?> clz : ClassUtils.scan(pkgname, this.loader)) {
			if (clz.getModifiers() == Modifier.PUBLIC && clz.getModifiers() != Modifier.ABSTRACT
					&& clz.getAnnotation(Deprecated.class) == null) {
				System.out.println("now class is " + clz);
				Class<?> sc = clz.getSuperclass();
				while (!sc.getName().equals(Object.class.getName())) {
					if (superClasses.contains(sc.getName())
							&& !clz.getPackage().getName().equals(client.getPackage().getName())) {
						System.out.println("add: " + clz);
						list.add(clz);
						break;
					}
					sc = sc.getSuperclass();
				}
			}
		}
	}

	protected static String getUrl(CloudMetadata ccm) {
		File jarFile = new File(getRootDir(ccm), TARGET_DIR + JAR_NAME_PREFIX + ccm.getKind().toLowerCase() + "-"
				+ ccm.getVersion() + "-" + JAR_NAME_POSTFIX);
		return "file:" + jarFile.getAbsolutePath();
	}

	protected static URL[] toURLs(String url) {
		try {
			URL[] urls = new URL[1];
			urls[0] = new URL(url);
			return urls;
		} catch (Exception ex) {
			return null;
		}
	}

	public static File getRootDir(CloudMetadata ccm) {
		File rootDir = new File(new File(LIB_DIR), JAR_NAME_PREFIX + ccm.getKind().toLowerCase());

		if (!rootDir.exists()) {
			rootDir.mkdirs();
		}

		return rootDir;
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

}
