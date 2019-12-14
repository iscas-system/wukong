/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.wukong.kubernetes;

import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps;
import io.github.wukong.core.KindAnalyzer;
import io.github.wukong.core.KindParameterAnalyzer;


/**
 * @author wuheng@iscas.ac.cn
 * @since  2019.1
 */
public class KubernetesKindParameterAnalyzer extends KindParameterAnalyzer {

	public KubernetesKindParameterAnalyzer(KindAnalyzer analyzer) {
		super(analyzer);
	}

	static {
		blacklist.add(JSONSchemaProps.class.getName());
	}
	

}
