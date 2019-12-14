package com.github.wukong.azure_vm;

import io.github.wukong.azure_vm.AzureVMKindAnalyzer;
import io.github.wukong.azure_vm.AzureVMKindParameterAnalyzer;
import io.github.wukong.core.gens.ParamterStyleGenerator;

public class AzureVMKindParameterAnalyzerTest {

	public static void main(String[] args) {
		AzureVMKindAnalyzer ka = new AzureVMKindAnalyzer();
		AzureVMKindParameterAnalyzer mpa = new AzureVMKindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
			ParamterStyleGenerator.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
		}
	}

}
