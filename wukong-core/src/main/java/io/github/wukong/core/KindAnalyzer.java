/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package io.github.wukong.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.github.kubesys.tool.utils.ObjectUtils;

import io.github.wukong.core.impl.DefaultClient;


/**
 * The {@code KindAnalyzer} class represents the relationship 
 * between kind name and kind description.
 * The kind object literals in Java programs can be 
 * instantiated by kind description.
 * <p>
 * 
 * @author wuheng@otcaix.iscas.ac.cn
 * @since 2019.1
 *
 */
public abstract class KindAnalyzer {

	
	/**
	 * for example, we want to create VM ('VM' is a type),
	 * and the code is as below <p>
	 * 
	 * <p>
	 * client.Vms().createVM(VMObject obj)
	 * <p>
	 * 
	 * In this case, the key and value of methodDescs is <'VM', 'VMs-createVM'>,
	 * VMs the the parent of createVM.
	 * while the key and value of paramDescs is <'VM', 'VMObject'>,
	 */
	protected final Map<String, String> methodDescs = new HashMap<String, String>();
	
	protected final Map<String, String> paramDescs  = new HashMap<String, String>();
	
	protected final static String DEFAULT_METHOD_PARENT_DESC = "";
	
	/**
	 * init
	 */
	public KindAnalyzer() {
		analyseKinds(getClient(), DEFAULT_METHOD_PARENT_DESC);
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
    		try {
	    		if (isKind(method)) {
	    			String kind = toKind(method);
					methodDescs.put(kind, toMethodDesc(parentDesc, method));
					paramDescs.put(kind, toParamDesc(method));
	    		} else if (isKindGroup(method)) {
	    			// take client.Vms().createVM(VMObject obj) for examples
	    			// the term 'Vms' means a set of operators
	    			analyseKinds(method.getReturnType().getName(), 
	    						method.getName());
	    		} 
    		} catch (Exception e) {
    			
    		}
    	}
	}

	/**
	 * @return all kinds
	 */
	public Set<String> getKinds() {
		return methodDescs.keySet();
	}
	
	/**
	 * @param kind   kind
	 * @return       kind description
	 */
	public String getDesc(String kind) {
		return methodDescs.get(kind);
	}
	
	/**
	 * @param kind   kind
	 * @return       kind model
	 */
	public String getModel(String kind) {
		return paramDescs.get(kind);
	}
	
	protected Map<String, String> getAllKinds() {
		return paramDescs;
	}
	
	/**
	 * @param parent   parent class
	 * @param method   method
	 * @return         convert to description
	 */
	protected String toMethodDesc(String parent, Method method) {
		return ObjectUtils.isNullString(method.getName()) ? null : 
			(ObjectUtils.isNullString(parent) ? method.getName() : parent + "-" + method.getName());
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
	 * @return          client name
	 */
	protected abstract String  getClient();
	/**
	 * @param method  method
	 * @return        return true if this method is a kind 
	 */
	protected abstract boolean isKind(Method method);
	/**
	 * @param method   method
	 * @return         convert method to kind
	 */
	protected abstract String  toKind(Method method);
	/**
	 * @param method   method
	 * @return         convert to model
	 */
	protected abstract String  toParamDesc(Method method);
	/**
	 * @param method   method
	 * @return         return true if this method is a kind group
	 */
	protected abstract boolean isKindGroup(Method method);
	
}
