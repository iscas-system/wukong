package com.github.wukong.tencentvm;

import com.github.wukong.core.KindParameterAnalyzer;
import com.github.wukong.core.tools.ParametersTool;
import com.github.wukong.tencentvm.TencnetVMKindAnalyzer;

public class TencentVMKindParameterAnalyzerTest {
	

	public static void main(String[] args) {
		TencnetVMKindAnalyzer ka = new TencnetVMKindAnalyzer();
		KindParameterAnalyzer mpa = new KindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
			ParametersTool.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
		}
	}

}
