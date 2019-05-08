package com.github.wukong.azure_vm;

import com.github.kubesys.tool.generators.ParamterStyleGenerator;

import io.github.wukong.azure_vm.AzureVMKindAnalyzer;
import io.github.wukong.azure_vm.AzureVMKindParameterAnalyzer;

public class AzureVMKindParameterAnalyzerTest {

	public static void main(String[] args) {
		AzureVMKindAnalyzer ka = new AzureVMKindAnalyzer();
		AzureVMKindParameterAnalyzer mpa = new AzureVMKindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
			ParamterStyleGenerator.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
		}
	}

}
