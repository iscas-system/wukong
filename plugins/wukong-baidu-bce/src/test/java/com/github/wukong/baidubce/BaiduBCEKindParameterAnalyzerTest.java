package com.github.wukong.baidubce;

import com.github.wukong.baidubce.BaiduBCEKindAnalyzer;
import com.github.wukong.core.KindParameterAnalyzer;
import com.github.wukong.core.tools.ParametersTool;

public class BaiduBCEKindParameterAnalyzerTest {

	public static void main(String[] args) {
		BaiduBCEKindAnalyzer ka = new BaiduBCEKindAnalyzer();
		KindParameterAnalyzer mpa = new KindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
			ParametersTool.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
		}
	}

}
