/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package com.github.wukong.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.github.wukong.core.impl.DefaultClient;


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
public abstract class KindAnalyzer {

	/************************************************************************************
	 * 
	 *                            Cores 
	 * 
	 ************************************************************************************/
	
	/**
	 * kind and how it is instantiated
	 */
	protected final Map<String, String> descs = new HashMap<String, String>();
	
	/**
	 * kind and how it is instantiated
	 */
	protected final Map<String, String> models = new HashMap<String, String>();
	
	/**
	 * default description
	 */
	private   final static String DEFAULT_DESC = "";
	
	/**
	 * init
	 */
	public KindAnalyzer() {
		analyseKinds(getClient(), DEFAULT_DESC);
	}
	
	/**
	 * use the depth-first search strategy to find all kinds
	 * 
	 * @param classname
	 * @param parentDesc
	 */
	private void analyseKinds(String classname, 
									  String parentDesc) {
		Class<?> clazz = loadClass(classname);
    	for (Method method : clazz.getMethods()) {
    		if (isKind(method)) {
    			String kind = toKind(method);
				descs.put(kind, toDesc(parentDesc, method));
				models.put(kind, toModel(method));
    		} else if (isKindGroup(method)) {
    			analyseKinds(method.getReturnType().getName(), 
    						method.getName());
    		} 
    	}
	}

	/**
	 * @return all kinds
	 */
	public Set<String> getKinds() {
		return descs.keySet();
	}
	
	/**
	 * @param kind   kind
	 * @return       kind description
	 */
	public String getDesc(String kind) {
		return descs.get(kind);
	}
	
	/**
	 * @param kind   kind
	 * @return       kind model
	 */
	public String getModel(String kind) {
		return models.get(kind);
	}
	
	/**
	 * @param classname   name
	 * @return            class
	 */
	private Class<?> loadClass(String classname) {
		try {
			return Class.forName(classname);
		} catch (Exception e) {
			return DefaultClient.class;
		}
	}
	
	/************************************************************************************
	 * 
	 *                 You should implement these by yourself
	 * 
	 ************************************************************************************/
	
	/**
	 * @param method  method
	 * @return        return true if this method is a kind 
	 */
	protected abstract boolean isKind(Method method);
	
	/**
	 * @param method   method
	 * @return         return true if this method is a kind group
	 */
	protected abstract boolean isKindGroup(Method method);
	
	/**
	 * @param method   method
	 * @return         convert method to kind
	 */
	protected abstract String  toKind(Method method);
	
	/**
	 * @param parent   parent class
	 * @param method   method
	 * @return         convert to description
	 */
	protected abstract String  toDesc(String parent, Method method);
	
	/**
	 * @param method   method
	 * @return         convert to model
	 */
	protected abstract String  toModel(Method method);
	/**
	 * @return          client name
	 */
	protected abstract String  getClient();
}
