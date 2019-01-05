package com.github.wukong.aliyunecs;

public class AliyunEcsModelParameterAnalyzerTest {

	public static void main(String[] args) {
		AliyunEcsModelParameterAnalyzer kmpa = new AliyunEcsModelParameterAnalyzer();
		System.out.println(kmpa.getModelParameters("Cronjob"));
	}

}
