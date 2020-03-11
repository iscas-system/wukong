/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.wukong.openshift;


public class OpenShiftKindAnalyzerTest {

	public static void main(String[] args) {
		OpenShiftKindAnalyzer ka = new OpenShiftKindAnalyzer();
		System.out.println(ka.getKinds().size());
		for (String kind : ka.getKinds()) {
			System.out.println(kind + ":<" + ka.getDesc(kind)
					+ "," + ka.getModel(kind) + ">");
		}
		
		
	}

}
