package com.github.wukong.kubernetes;

public class KubernetesModelParameterAnalyzerTest {

	public static void main(String[] args) {
		KubernetesModelParameterAnalyzer kmpa = new KubernetesModelParameterAnalyzer(
							new KubernetesKindAnalyzer());
		System.out.println(kmpa.getModelParameters("Cronjob"));
	}

}
