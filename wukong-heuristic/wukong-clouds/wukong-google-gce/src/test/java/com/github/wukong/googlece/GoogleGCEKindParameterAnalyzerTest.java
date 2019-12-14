package com.github.wukong.googlece;

import io.github.wukong.core.gens.ParamterStyleGenerator;

public class GoogleGCEKindParameterAnalyzerTest {

	public static void main(String[] args) {
		GoogleGCEKindAnalyzer ka = new GoogleGCEKindAnalyzer();
		GoogleKindParameterAnalyzer mpa = new GoogleKindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
			ParamterStyleGenerator.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
		}
	}

}
