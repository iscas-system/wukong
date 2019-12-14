/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package io.github.wukong.core.anas;

import java.lang.reflect.Method;

import io.github.wukong.core.KindAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @since  2019.1
 */
public abstract class ParamAndRespPatternAnalyzer extends KindAnalyzer {

	@Override
	protected boolean isKind(Method method) {
		if (method == null 
				|| getSuperclass() == null) {
			return false;
		}
		
		if (method.isAnnotationPresent(Deprecated.class)) {
			return false;
		}
		
		if (method.getParameterCount() != 1) {
			return false;
		}

		Class<?> paramType = method.getParameterTypes()[0];
		for (Class<?> clazz : paramType.getInterfaces()) {
			if (getSuperclass().equals(clazz.getName())) {
				return true;
			}
		}
		
		if( paramType.getSuperclass() != null && getSuperclass().equals(
					paramType.getSuperclass().getName())) {
			return true;
		}
		
		return false;
	}

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
		String simpleName = method.getName();
		return simpleName.substring(0, 1).toUpperCase() + simpleName.substring(1);
	}

	@Override
	protected String toParamDesc(Method method) {
		return method.getParameterTypes()[0].getTypeName();
	}
	
	/**
	 * We're not gonna check if it's empty.
	 * 
	 * @return superclass
	 */
	protected abstract String getSuperclass();
}
