package com.github.wukong.docker;

import com.github.wukong.core.docs.ParametersUtils;
import com.github.wukong.docker.DockerKindAnalyzer;
import com.github.wukong.docker.DockerKindParameterAnalyzer;

public class DockerKindParameterAnalyzerTest {

	public static void main(String[] args) {
		DockerKindAnalyzer ka = new DockerKindAnalyzer();
		DockerKindParameterAnalyzer mpa = new DockerKindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
			ParametersUtils.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
		}
	}

}
