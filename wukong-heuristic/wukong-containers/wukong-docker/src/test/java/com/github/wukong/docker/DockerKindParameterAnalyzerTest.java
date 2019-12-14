package com.github.wukong.docker;


import io.github.wukong.core.KindParameterAnalyzer;
import io.github.wukong.core.gens.ParamterStyleGenerator;

public class DockerKindParameterAnalyzerTest {

	public static void main(String[] args) {
		DockerKindAnalyzer ka = new DockerKindAnalyzer();
		KindParameterAnalyzer mpa = new KindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
			ParamterStyleGenerator.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
		}
	}

}
