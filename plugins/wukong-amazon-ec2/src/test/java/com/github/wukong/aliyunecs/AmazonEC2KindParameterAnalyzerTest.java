package com.github.wukong.aliyunecs;

import com.github.wukong.core.KindParameterAnalyzer;
import com.github.wukong.core.docs.ParametersUtils;

public class AmazonEC2KindParameterAnalyzerTest {

	public static void main(String[] args) {
		AmazonCE2KindAnalyzer ka = new AmazonCE2KindAnalyzer();
		KindParameterAnalyzer mpa = new KindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
			ParametersUtils.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
		}
	}

}
