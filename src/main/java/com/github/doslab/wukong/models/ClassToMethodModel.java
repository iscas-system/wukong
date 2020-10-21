/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong.models;

import java.lang.reflect.Method;

/**
 * @author tangting18@otcaix.iscas.ac.cn
 * @author wuheng@otcaix.iscas.ac.cn
 * @since  2020.3.8
 */
public class ClassToMethodModel {

	protected final Class<?> parent;
	
	protected final Method method;

	/***************************************************************
	 * 
	 *    Constructor
	 * 
	 ***************************************************************/
	public ClassToMethodModel(Class<?> parent, Method method) {
		super();
		this.parent = parent;
		this.method = method;
	}

	/***************************************************************
	 * 
	 *    Setter and Getter
	 * 
	 ***************************************************************/
	public Class<?> getParent() {
		return parent;
	}

	public Method getMethod() {
		return method;
	}
	
}
