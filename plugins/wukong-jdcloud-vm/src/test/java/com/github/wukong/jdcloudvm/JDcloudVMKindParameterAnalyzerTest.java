package com.github.wukong.jdcloudvm;

import com.github.wukong.core.KindParameterAnalyzer;
import com.github.wukong.core.docs.ParametersUtils;
import com.github.wukong.jdcloudvm.JDcloudVMEKindAnalyzer;

public class JDcloudVMKindParameterAnalyzerTest {

	public static void main(String[] args) {
		JDcloudVMEKindAnalyzer ka = new JDcloudVMEKindAnalyzer();
		KindParameterAnalyzer mpa = new KindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
			ParametersUtils.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
		}
	}

}
