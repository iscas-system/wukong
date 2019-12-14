package com.github.wukong.awsecs;

import com.github.wukong.awsecs.AmazonCE2KindAnalyzer;

public class AmazonECSAnalyzerTest {

	public static void main(String[] args) {
		AmazonCE2KindAnalyzer ka = new AmazonCE2KindAnalyzer();
		System.out.println(ka.getKinds().size());
		for (String kind : ka.getKinds()) {
			System.out.println(kind + ":<" + ka.getDesc(kind)
					+ "," + ka.getModel(kind) + ">");
		}
	}

}
