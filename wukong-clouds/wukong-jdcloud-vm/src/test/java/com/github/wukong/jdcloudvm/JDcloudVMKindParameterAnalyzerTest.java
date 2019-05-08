package com.github.wukong.jdcloudvm;

import com.github.wukong.core.KindParameterAnalyzer;
import com.github.wukong.core.tools.ParametersTool;
import com.github.wukong.jdcloudvm.JDcloudVMEKindAnalyzer;

public class JDcloudVMKindParameterAnalyzerTest {

	public static void main(String[] args) {
		JDcloudVMEKindAnalyzer ka = new JDcloudVMEKindAnalyzer();
		KindParameterAnalyzer mpa = new KindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
			ParametersTool.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
		}
	}

}
