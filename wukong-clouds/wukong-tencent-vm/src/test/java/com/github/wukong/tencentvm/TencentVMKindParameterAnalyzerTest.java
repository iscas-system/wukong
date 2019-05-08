package com.github.wukong.tencentvm;

import com.github.kubesys.tool.generators.ParamterStyleGenerator;

import io.github.wukong.core.KindParameterAnalyzer;

public class TencentVMKindParameterAnalyzerTest {
	

	public static void main(String[] args) {
		TencnetVMKindAnalyzer ka = new TencnetVMKindAnalyzer();
		KindParameterAnalyzer mpa = new KindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
			ParamterStyleGenerator.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
		}
	}

}
