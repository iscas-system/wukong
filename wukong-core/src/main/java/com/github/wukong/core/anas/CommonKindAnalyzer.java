/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package com.github.wukong.core.anas;

import java.lang.reflect.Method;

import com.github.wukong.core.KindAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @since  2019.1
 */
public abstract class CommonKindAnalyzer extends KindAnalyzer {

	@Override
	protected boolean isKind(Method method) {
		if (method == null 
				|| getPostfix() == null
				|| getSuperclass() == null) {
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
			if (getSuperclass().equals(clazz.getName())) {
				return true;
			}
		}
		
		if( returnType.getSuperclass() != null && getSuperclass().equals(
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
		return simpleName.substring(0, simpleName.length() - getPostfix().length());
	}

	@Override
	protected String toModel(Method method) {
		return method.getReturnType().getName();
	}
	
	/**
	 * We're not gonna check if it's empty.
	 * 
	 * @return postfix 
	 */
	protected abstract String getPostfix();
	
	/**
	 * We're not gonna check if it's empty.
	 * 
	 * @return superclass
	 */
	protected abstract String getSuperclass();
}
