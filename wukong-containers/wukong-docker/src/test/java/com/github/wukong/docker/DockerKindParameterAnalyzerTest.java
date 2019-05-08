package com.github.wukong.docker;

import com.github.wukong.core.KindParameterAnalyzer;
import com.github.wukong.core.tools.ParametersTool;

public class DockerKindParameterAnalyzerTest {

	public static void main(String[] args) {
		DockerKindAnalyzer ka = new DockerKindAnalyzer();
		KindParameterAnalyzer mpa = new KindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
			ParametersTool.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
		}
	}

}
