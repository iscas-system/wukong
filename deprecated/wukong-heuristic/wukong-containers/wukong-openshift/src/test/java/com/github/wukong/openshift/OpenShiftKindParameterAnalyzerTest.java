package com.github.wukong.openshift;

import io.github.wukong.core.gens.ParamterStyleGenerator;

public class OpenShiftKindParameterAnalyzerTest {

	public static void main(String[] args) {
		OpenShiftKindAnalyzer ka = new OpenShiftKindAnalyzer();
		OpenShiftKindParameterAnalyzer mpa = new OpenShiftKindParameterAnalyzer(ka);
		
		for (String kind : ka.getKinds()) {
			System.out.println(kind);
		}
		
		for (String kind : ka.getKinds()) {
			ParamterStyleGenerator.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
		}
	}

}
