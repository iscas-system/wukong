package com.github.wukong.kubernetes;

import com.github.wukong.core.docs.ParametersUtils;

public class KubernetesKindParameterAnalyzerTest {

	public static void main(String[] args) {
		KubernetesKindAnalyzer ka = new KubernetesKindAnalyzer();
		KubernetesKindParameterAnalyzer mpa = new KubernetesKindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
			ParametersUtils.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
		}
	}

}
