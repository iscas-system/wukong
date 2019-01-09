package com.github.wukong.kubernetes;

import com.github.wukong.core.utils.ParametersUtils;

public class KubernetesKindParameterAnalyzerTest {

	public static void main(String[] args) {
		KubernetesKindAnalyzer kka = new KubernetesKindAnalyzer();
		KubernetesKindParameterAnalyzer kmpa = new KubernetesKindParameterAnalyzer(kka);
		for (String kind : kka.getKinds()) {
			ParametersUtils.showModelParametersWithNetstedStyle(kind, kmpa.getParameters(kind));
		}
	}

}
