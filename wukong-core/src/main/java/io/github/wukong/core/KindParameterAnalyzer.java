/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package io.github.wukong.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import io.github.wukong.core.utils.JavaUtils;
import io.github.wukong.core.utils.ObjectUtils;


/**
 * The {@code KindAnalyzer} class represents the relationship 
 * between kind name and kind description.
 * The kind object literals in Java programs can be 
 * instantiated by kind description.
 * <p>
 * 
 * @author wuheng@iscas.ac.cn
 * @since 2019.1
 *
 */
public class KindParameterAnalyzer {

	public    final static String METHOD_STARTSWITH_SET  = "set";
	
	public    final static String METHOD_STARTSWITH_ADD  = "add";
	
	public    final static String METHOD_STARTSWITH_WITH = "with";
	
	protected final static String DEFAULT_PARAM_PARENT   = "";
	
	protected final KindAnalyzer analyzer;
	
	public KindParameterAnalyzer(KindAnalyzer analyzer) {
		this.analyzer = analyzer;
		for (String kind : analyzer.getKinds()) {
			try {
				Class<?> paramClass = Class.forName(analyzer.getModel(kind));
				parameters.put(kind, new LinkedHashMap<String, String>());
				analyseParameters(paramClass, kind,  DEFAULT_PARAM_PARENT);
			} catch (Exception e) {
				// ignore here
			}
		}
	}

	/************************************************************************************
	 * 
	 *                                    Cores
	 * 
	 ************************************************************************************/
	
	protected final Map<String, Map<String, String>> parameters = new HashMap<String,  Map<String, String>>();
	
	
	protected final static Set<String> blacklist = new HashSet<String>();
	
	
	/**
	 * @param clazz class
	 * @param kind kind
	 * @param parent parent
	 * @throws Exception fail reason
	 */
	protected void analyseParameters(Class<?> clazz,  
							String kind, 
							String parent) throws Exception {
		for (Method method : clazz.getMethods()) {
			if(canReflect(method) && !blacklist.contains(clazz.getName())) {
				addParametersToModel(kind, parent, method);
//				System.out.println(clazz.getName() + ":" + method.getName());
				if(canNested(getParamType(method))) {
					analyseParameters(Class.forName(getParamType(method)), kind, getParent(parent, method));
				}
			}
			
		}
	}

	/**
	 * @param method   method
	 * @return         fullname
	 */
	private String getParamType(Method method) {
		String fullname = method.getGenericParameterTypes()[0].getTypeName();
		int idx = fullname.indexOf(",") == -1 ? fullname.indexOf("<") : fullname.indexOf(",");
		String typename = (idx == -1) ? fullname 
				: fullname.substring(idx + 1, fullname.indexOf(">")).trim();
		return typename.endsWith("[]") ? typename.substring(
				0, typename.length() - "[]".length()) : typename;
	}

	/**
	 * 
	 * setMetadata=io.fabric8.kubernetes.api.model.ObjectMeta
	 * setMetadata-setName=java.lang.String
	 * 
	 */
	private void addParametersToModel(String kind, String parent, Method method) {
		Map<String, String> results = parameters.get(kind);
		results.put(getParent(parent, method), method.getGenericParameterTypes()[0].getTypeName());
	}

	/**
	 * 
	 * @param parent class
	 * @param method method
	 * @return       fullname
	 */
	protected String getParent(String parent, Method method) {
		return DEFAULT_PARAM_PARENT.equals(parent) 
				? method.getName() : parent + "-" + method.getName();
	}

	
	/**
	 * @param kind    kind
	 * @return        the kind parameters
	 */
	public Map<String, String> getParameters(String kind) {
		return parameters.get(kind);
	}
	
	/**
	 * @param method    method name
	 * @return          true of if this parameter need to be reflected
	 */
	protected boolean canReflect(Method method) {
		return ObjectUtils.isNullObject(method) ? false
				: ((method.getName().startsWith(METHOD_STARTSWITH_SET) //  startswith set
						|| (method.getName().startsWith(METHOD_STARTSWITH_ADD))
						|| (method.getName().startsWith(METHOD_STARTSWITH_WITH))) // startswith add
						&& method.getParameterCount() == 1 // has only one parameter
						&& !JavaUtils.ignoreMethod(method.getName())); // is not deprecated
	}
	
	
	/**
	 * @param typename   typename
	 * @return           return true if the parameter need to 
	 */
	protected boolean canNested(String typename) {
		return !JavaUtils.isPrimitive(typename) // is not Primitive
				&& !JavaUtils.isStringList(typename) // is not List<String>
				&& !JavaUtils.isStringSet(typename) // is not Set<String>
				&& !JavaUtils.isStringStringMap(typename); // is not Map<String, String>
//				&& typename.split(",").length < 2; // it may be Map<String, String>, then the length is 2 if we splits the string by ','
	}

	public Map<String, String> getAllKinds() {
		return analyzer.getAllKinds();
	}

}
