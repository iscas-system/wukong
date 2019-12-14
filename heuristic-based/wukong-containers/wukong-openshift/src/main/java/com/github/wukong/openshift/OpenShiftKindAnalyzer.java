/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.wukong.openshift;

import com.github.wukong.kubernetes.KubernetesKindAnalyzer;

import io.fabric8.openshift.client.DefaultOpenShiftClient;

/**
 * @author wuheng@iscas.ac.cn
 * @since  2019.1
 */
public class OpenShiftKindAnalyzer extends KubernetesKindAnalyzer {

	/**
	 * 
	 */
	public OpenShiftKindAnalyzer() {
		super();
	}

	@Override
	public String getClient() {
		return DefaultOpenShiftClient.class.getName();
	}

}
