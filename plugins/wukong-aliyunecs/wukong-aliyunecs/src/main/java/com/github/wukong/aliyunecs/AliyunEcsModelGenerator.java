/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.wukong.aliyunecs;

import com.github.wukong.core.ModelGenerator;
import com.github.wukong.core.ModelParameterAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月8日
 */
public class AliyunEcsModelGenerator extends ModelGenerator {

	protected final static AliyunEcsModelParameterAnalyzer 
				analyzer = new AliyunEcsModelParameterAnalyzer();
	
	/**
	 * 
	 */
	public AliyunEcsModelGenerator() {
		super();
	}

	/**
	 * @param objectRef
	 */
	public AliyunEcsModelGenerator(String objectRef) {
		super(objectRef);
	}
	
	@Override
	public ModelParameterAnalyzer getModelParameter() {
		return analyzer;
	}

}
