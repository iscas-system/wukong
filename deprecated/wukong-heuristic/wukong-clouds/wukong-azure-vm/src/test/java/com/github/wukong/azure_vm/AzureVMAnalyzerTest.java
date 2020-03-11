package com.github.wukong.azure_vm;

import io.github.wukong.azure_vm.AzureVMKindAnalyzer;

public class AzureVMAnalyzerTest {

	public static void main(String[] args) {
		AzureVMKindAnalyzer ka = new AzureVMKindAnalyzer();
		System.out.println(ka.getKinds().size());
		for (String kind : ka.getKinds()) {
			System.out.println(kind + ":<" + ka.getDesc(kind)
						+ "," + ka.getModel(kind) + ">");
		}
	}

}
