/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package com.github.wukong.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.github.wukong.core.impl.DefaultClient;
import com.github.wukong.core.utils.StringUtils;


/**
 * The {@code KindAnalyzer} class represents the relationship between kind name and kind description.
 * All kind object literals in Java programs can be instantiated by kind description.
 * <p>
 * Here, kind means a executable unit of a specified cloud java client, then we can manage the VM,
 * Container, OSS life cycle. 
 * <p>
 * 
 * @author wuheng@(otcaix.iscas.ac.cn)
 *
 * 2018年3月2日
 */
public abstract class KindAnalyzer {

	/************************************************************************************
	 * 
	 *                            Cores 
	 * 
	 ************************************************************************************/
	
	/**
	 * 用来记录所有的kind及其描述，所谓描述，是指该kind如何实例化
	 * 比如 deployment可如下获取
	 * DefaultKubernetesClient client = new DefaultKubernetesClient();
	 * client.extensions().deployments().
	 * 则kinds需要记录的key是deployment，value是extensions-deployments
	 * 
	 * 又比如Pod可以如下获取
	 * DefaultKubernetesClient client = new DefaultKubernetesClient();
	 * client.pods().
	 * 则kinds需要记录的key是pods，value是pod
	 */
	protected final Map<String, String> kinds = new HashMap<String, String>();
	
	/**
	 * 
	 */
	protected final static String DEFAULT_DESC = "";
	
	/**
	 * 
	 */
	public KindAnalyzer() {
		analyseKinds(getClient(), DEFAULT_DESC);
	}
	
	/**
	 * 分析出客户端(KubernetesClient，OpenShiftClient)的所有kind的类型
	 * 
	 * @param classname 类名
	 * @param parentDesc 父节点
	 */
	protected void analyseKinds(String classname, String parentDesc) {
		Class<?> clazz = loadClass(classname);
    	for (Method method : clazz.getMethods()) {
    		if (isKind(method)) {
    			kinds.put(toKind(method), 
    					  	toDesc(parentDesc, method));
    		} else if (isKindGroup(method)) {
    			analyseKinds(method.getReturnType().getName(), 
    						method.getName());
    		} 
    	}
	}

	
	/**
	 * 获取指定客户端(KubernetesClient，OpenShiftClient)的所有的kind的类型
	 * kind比如Deployment，Pod等
	 * 
	 * @return 获取指定客户端(KubernetesClient，OpenShiftClient)的所有的kind的类型
	 */
	public Set<String> getKinds() {
		return kinds.keySet();
	}
	
	/**
	 * 获取kind的描述，以便后续可以通过反射进行实例化
	 * 比如kind是Deployment，desc是extensions-deployments
	 * 表示可以通过client.extensions().deployments()进行实例化
	 * 
	 * @param kind 具体kind类型
	 * @return 获取kind的描述，以便后续可以通过反射进行实例化
	 */
	public String getKindDesc(String kind) {
		return StringUtils.isNull(kind) ? null : kinds.get(kind);
	}
	
	
	/**
	 * @param classname classname
	 * @return class
	 */
	protected Class<?> loadClass(String classname) {
		try {
			return Class.forName(classname);
		} catch (Exception e) {
			return DefaultClient.class;
		}
	}
	
	/************************************************************************************
	 * 
	 *                   You should implement it by yourself
	 * 
	 ************************************************************************************/
	
	/**
	 * 
	 * @param method 方法名
	 * @return 方法名对应的kind
	 */
	protected abstract boolean isKind(Method method);
	
	/**
	 * 
	 * @param method 方法名
	 * @return 是不是kindGroup
	 */
	protected abstract boolean isKindGroup(Method method);
	
	/**
	 * @param method 名字
	 * @return 转换为kind的类型
	 */
	protected abstract String toKind(Method method);
	
	/**
	 * @param parent 父节点是什么
	 * @param method 方法名
	 * @return 描述
	 */
	protected abstract String toDesc(String parent, Method method);
	
	
	/**
	 * @return the client for the specified cloud
	 */
	public abstract String getClient();
}
