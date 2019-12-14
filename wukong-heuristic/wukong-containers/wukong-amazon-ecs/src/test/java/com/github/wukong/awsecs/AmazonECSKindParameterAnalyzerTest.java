package com.github.wukong.awsecs;


import io.github.wukong.core.KindParameterAnalyzer;
import io.github.wukong.core.gens.ParamterStyleGenerator;

public class AmazonECSKindParameterAnalyzerTest {

	public static void main(String[] args) {
		AmazonCE2KindAnalyzer ka = new AmazonCE2KindAnalyzer();
		KindParameterAnalyzer mpa = new KindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
			ParamterStyleGenerator.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
		}
	}

}
