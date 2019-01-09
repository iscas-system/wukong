package com.github.wukong.aliyunecs;

import com.github.wukong.core.KindParameterAnalyzer;
import com.github.wukong.core.docs.ParametersUtils;

public class AliyunEcsKindParameterAnalyzerTest {

	public static void main(String[] args) {
		AliyunEcsKindAnalyzer ka = new AliyunEcsKindAnalyzer();
		KindParameterAnalyzer mpa = new KindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
			ParametersUtils.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
		}
	}

}
