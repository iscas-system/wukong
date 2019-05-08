package com.github.wukong.kubernetes;

import com.github.kubesys.tool.generators.ParamterStyleGenerator;

public class KubernetesKindParameterAnalyzerTest {

	public static void main(String[] args) {
		KubernetesKindAnalyzer ka = new KubernetesKindAnalyzer();
		KubernetesKindParameterAnalyzer mpa = new KubernetesKindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
			ParamterStyleGenerator.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
		}
	}

}
