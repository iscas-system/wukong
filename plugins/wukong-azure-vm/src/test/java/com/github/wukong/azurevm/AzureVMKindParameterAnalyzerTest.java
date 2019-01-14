package com.github.wukong.azurevm;

import com.github.wukong.core.tools.ParametersTool;

public class AzureVMKindParameterAnalyzerTest {

	public static void main(String[] args) {
		AzureVMKindAnalyzer ka = new AzureVMKindAnalyzer();
		AzureVMKindParameterAnalyzer mpa = new AzureVMKindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
			ParametersTool.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
		}
	}

}
