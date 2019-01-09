/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.wukong.kubernetes;

public class KubernetesKindAnalyzerTest {

	public static void main(String[] args) {
		KubernetesKindAnalyzer ka = new KubernetesKindAnalyzer();
		System.out.println(ka.getKinds().size());
		for (String kind : ka.getKinds()) {
			System.out.println(kind + ":<" + ka.getDesc(kind)
					+ "," + ka.getModel(kind) + ">");
		}
	}

}
