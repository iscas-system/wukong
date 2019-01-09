/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.wukong.docker;

import com.github.wukong.core.KindAnalyzer;
import com.github.wukong.core.KindParameterAnalyzer;

import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps;


/**
 * @author wuheng@iscas.ac.cn
 * @since  2019.1
 */
public class DockerKindParameterAnalyzer extends KindParameterAnalyzer {

	public DockerKindParameterAnalyzer(KindAnalyzer analyzer) {
		super(analyzer);
	}

	static {
		blacklist.add(JSONSchemaProps.class.getName());
	}
	

}
