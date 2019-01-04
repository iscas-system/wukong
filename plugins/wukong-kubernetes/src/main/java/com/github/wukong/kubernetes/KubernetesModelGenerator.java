/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.wukong.kubernetes;

import com.github.wukong.core.ModelGenerator;
import com.github.wukong.core.ModelParameterAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月8日
 */
public class KubernetesModelGenerator extends ModelGenerator {

	protected final static KubernetesModelParameterAnalyzer 
				analyzer = new KubernetesModelParameterAnalyzer();
	
	/**
	 * 
	 */
	public KubernetesModelGenerator() {
		super();
	}

	/**
	 * @param objectRef
	 */
	public KubernetesModelGenerator(String objectRef) {
		super(objectRef);
	}
	
	@Override
	public ModelParameterAnalyzer getModelParameter() {
		return analyzer;
	}

}
