/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.wukong.aliyunecs;

import java.lang.reflect.Method;

import com.aliyuncs.RpcAcsRequest;
import com.github.wukong.core.KindAnalyzer;
import com.github.wukong.core.utils.ObjectUtils;

/**
 * @author wuheng@iscas.ac.cn
 * @since  2019.1
 */
public class AliyunEcsKindAnalyzer extends KindAnalyzer {

	public final static String REQUEST = RpcAcsRequest.class.getName();
	
	public final static String POSTFIX = "Request";
	
	/**
	 * 
	 */
	public AliyunEcsKindAnalyzer() {
		super();
	}
	
	@SuppressWarnings("unused")
	@Override
	protected boolean isKind(Method method) {
		if (ObjectUtils.isNull(method)) {
			return false;
		}
		
		if (method.isAnnotationPresent(Deprecated.class)) {
			return false;
		}
		
		if (method.getParameterCount() != 0) {
			return false;
		}

		Class<?> returnType = method.getReturnType();
		for (Class<?> clazz : returnType.getInterfaces()) {
			if (REQUEST.equals(clazz.getName())) {
				return true;
			}
		}
		
		if( returnType.getSuperclass() != null && REQUEST.equals(
					returnType.getSuperclass().getName())) {
			return true;
		}
		
		return false;
	}

	/**
	 * 对于fabric8的DefaultKubernetesClient而言，如果返回值是以GroupDSL结尾的， 则说明它是一种kind的类型. <br>
	 * <br>
	 * 
	 * 更进一步，要求这些方法不是<code>Deprecated.class</code>的类型
	 */
	@Override
	protected boolean isKindGroup(Method method) {
		return false;
	}

	/**
	 * 根据名字方法名返回kind类型，如果不存在，返回null
	 * 
	 */
	@Override
	protected String toKind(Method method) {
		String simpleName = method.getReturnType().getSimpleName();
		return simpleName.substring(0, simpleName.length() - POSTFIX.length());
	}

	@Override
	protected String toModel(Method method) {
		return method.getReturnType().getName();
	}
	
	@Override
	public String getClient() {
		return AliyunDefaultAcsClient.class.getName();
	}

}
