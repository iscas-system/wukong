package io.github.wukong.baiduvm;

import io.github.wukong.core.KindParameterAnalyzer;
import io.github.wukong.core.gens.ParamterStyleGenerator;

public class BaiduBCEKindParameterAnalyzerTest {

	public static void main(String[] args) {
		BaiduBCEKindAnalyzer ka = new BaiduBCEKindAnalyzer();
		KindParameterAnalyzer mpa = new KindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
			ParamterStyleGenerator.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
		}
	}

}
