/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.wukong.openshift;

import com.github.wukong.core.KindAnalyzer;
import com.github.wukong.kubernetes.KubernetesKindParameterAnalyzer;

/**
 * @author wuheng@iscas.ac.cn
 * @since  2019.1
 */
public class OpenShiftKindParameterAnalyzer extends KubernetesKindParameterAnalyzer {

	public OpenShiftKindParameterAnalyzer(KindAnalyzer analyzer) {
		super(analyzer);
	}

}
