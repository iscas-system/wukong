package com.github.wukong.googlece;

import com.github.wukong.core.KindParameterAnalyzer;
import com.github.wukong.core.tools.ParametersTool;
import com.github.wukong.googlece.GoogleGCEKindAnalyzer;

public class GoogleGCEKindParameterAnalyzerTest {

	public static void main(String[] args) {
		GoogleGCEKindAnalyzer ka = new GoogleGCEKindAnalyzer();
		KindParameterAnalyzer mpa = new KindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
			ParametersTool.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
		}
	}

}
