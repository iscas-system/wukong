package com.github.wukong.tencentvm;

import io.github.wukong.core.KindParameterAnalyzer;
import io.github.wukong.core.gens.ParamterStyleGenerator;

public class TencentVMKindParameterAnalyzerTest {
	

	public static void main(String[] args) {
		TencnetVMKindAnalyzer ka = new TencnetVMKindAnalyzer();
		KindParameterAnalyzer mpa = new KindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
			ParamterStyleGenerator.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
		}
	}

}
