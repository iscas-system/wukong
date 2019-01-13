package com.github.wukong.jdcloudvm;

import com.github.wukong.jdcloudvm.JDcloudVMEKindAnalyzer;

public class JDcloudVMKindAnalyzerTest {

	public static void main(String[] args) {
		JDcloudVMEKindAnalyzer ka = new JDcloudVMEKindAnalyzer();
		System.out.println(ka.getKinds().size());
		for (String kind : ka.getKinds()) {
			System.out.println(kind + ":<" + ka.getDesc(kind)
					+ "," + ka.getModel(kind) + ">");
		}
	}

}
