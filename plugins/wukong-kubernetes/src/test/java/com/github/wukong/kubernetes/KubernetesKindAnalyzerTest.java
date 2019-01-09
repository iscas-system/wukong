/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.wukong.kubernetes;

public class KubernetesKindAnalyzerTest {

	public static void main(String[] args) {
		KubernetesKindAnalyzer kka = new KubernetesKindAnalyzer();
		System.out.println(kka.getKinds().size());
		for (String kind : kka.getKinds()) {
			System.out.println(kind + ":<" + kka.getDesc(kind)
					+ "," + kka.getModel(kind) + ">");
		}
	}

}
