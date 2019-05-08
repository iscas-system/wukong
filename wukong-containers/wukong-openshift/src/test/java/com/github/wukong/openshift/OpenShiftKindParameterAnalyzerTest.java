package com.github.wukong.openshift;

import com.github.wukong.core.tools.ParametersTool;
import com.github.wukong.openshift.OpenShiftKindAnalyzer;
import com.github.wukong.openshift.OpenShiftKindParameterAnalyzer;

public class OpenShiftKindParameterAnalyzerTest {

	public static void main(String[] args) {
		OpenShiftKindAnalyzer ka = new OpenShiftKindAnalyzer();
		OpenShiftKindParameterAnalyzer mpa = new OpenShiftKindParameterAnalyzer(ka);
		
		for (String kind : ka.getKinds()) {
			System.out.println(kind);
		}
		
		for (String kind : ka.getKinds()) {
			ParametersTool.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
		}
	}

}
