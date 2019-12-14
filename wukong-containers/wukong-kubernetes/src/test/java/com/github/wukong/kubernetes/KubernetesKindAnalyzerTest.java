/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.wukong.kubernetes;

import io.fabric8.kubernetes.client.DefaultKubernetesClient;

public class KubernetesKindAnalyzerTest {

	public static void main(String[] args) {
		KubernetesKindAnalyzer ka = new KubernetesKindAnalyzer();
		System.out.println(ka.getKinds().size());
		for (String kind : ka.getKinds()) {
			System.out.println(kind + ":<" + ka.getDesc(kind)
					+ "," + ka.getModel(kind) + ">");
		}
		
		DefaultKubernetesClient client = null;
		client.pods().create(null);
	}

}
