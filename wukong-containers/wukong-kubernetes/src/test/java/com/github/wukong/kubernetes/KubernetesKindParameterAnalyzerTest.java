package com.github.wukong.kubernetes;

import com.github.wukong.core.tools.ParametersTool;

public class KubernetesKindParameterAnalyzerTest {

	public static void main(String[] args) {
		KubernetesKindAnalyzer ka = new KubernetesKindAnalyzer();
		KubernetesKindParameterAnalyzer mpa = new KubernetesKindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
			ParametersTool.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
		}
	}

}
