package com.github.wukong.jdcloudvm;

import io.github.wukong.core.KindParameterAnalyzer;
import io.github.wukong.core.gens.ParamterStyleGenerator;

public class JDcloudVMKindParameterAnalyzerTest {

	public static void main(String[] args) {
		JDcloudVMEKindAnalyzer ka = new JDcloudVMEKindAnalyzer();
		KindParameterAnalyzer mpa = new KindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
			ParamterStyleGenerator.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
		}
	}

}
