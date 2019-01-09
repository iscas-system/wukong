package com.github.wukong.aliyunecs;

public class AliyunEcsModelParameterAnalyzerTest {

	public static void main(String[] args) {
		AliyunEcsModelParameterAnalyzer kmpa = new AliyunEcsModelParameterAnalyzer(
				new AliyunEcsKindAnalyzer());
		System.out.println(kmpa.getParameters("Cronjob"));
	}

}
