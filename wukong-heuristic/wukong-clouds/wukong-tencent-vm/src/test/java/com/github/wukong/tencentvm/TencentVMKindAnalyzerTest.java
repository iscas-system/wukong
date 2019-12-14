package com.github.wukong.tencentvm;

import com.github.wukong.tencentvm.TencnetVMKindAnalyzer;

public class TencentVMKindAnalyzerTest {

	public static void main(String[] args) {
		TencnetVMKindAnalyzer ka = new TencnetVMKindAnalyzer();
		System.out.println(ka.getKinds().size());
		for (String kind : ka.getKinds()) {
			System.out.println(kind + ":<" + ka.getDesc(kind)
					+ "," + ka.getModel(kind) + ">");
		}
	}

}
