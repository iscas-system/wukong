package com.github.wukong.kubernetes;

import io.github.wukong.core.gens.ParamterStyleGenerator;

public class KubernetesKindParameterAnalyzerTest {

	public static void main(String[] args) {
		KubernetesKindAnalyzer ka = new KubernetesKindAnalyzer();
		KubernetesKindParameterAnalyzer mpa = new KubernetesKindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
			ParamterStyleGenerator.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
		}
	}

}
