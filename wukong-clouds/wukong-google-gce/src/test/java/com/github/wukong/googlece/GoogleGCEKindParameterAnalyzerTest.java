package com.github.wukong.googlece;

import com.github.wukong.core.tools.ParametersTool;

public class GoogleGCEKindParameterAnalyzerTest {

	public static void main(String[] args) {
		GoogleGCEKindAnalyzer ka = new GoogleGCEKindAnalyzer();
		GoogleKindParameterAnalyzer mpa = new GoogleKindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
			ParametersTool.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
		}
	}

}
