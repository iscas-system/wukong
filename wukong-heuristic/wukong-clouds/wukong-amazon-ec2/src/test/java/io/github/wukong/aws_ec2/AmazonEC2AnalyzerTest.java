package io.github.wukong.aws_ec2;

import io.github.wukong.aws_ec2.AmazonCE2KindAnalyzer;

public class AmazonEC2AnalyzerTest {

	public static void main(String[] args) {
		AmazonCE2KindAnalyzer ka = new AmazonCE2KindAnalyzer();
		System.out.println(ka.getKinds().size());
		for (String kind : ka.getKinds()) {
			System.out.println(kind + ":<" + ka.getDesc(kind)
					+ "," + ka.getModel(kind) + ">");
		}
	}

}
