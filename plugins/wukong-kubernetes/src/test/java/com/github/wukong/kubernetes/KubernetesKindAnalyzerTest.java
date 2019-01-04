package com.github.wukong.kubernetes;


public class KubernetesKindAnalyzerTest {

	public static void main(String[] args) {
		KubernetesKindAnalyzer kka = new KubernetesKindAnalyzer();
		System.out.println(kka.getKinds());
	}

}
