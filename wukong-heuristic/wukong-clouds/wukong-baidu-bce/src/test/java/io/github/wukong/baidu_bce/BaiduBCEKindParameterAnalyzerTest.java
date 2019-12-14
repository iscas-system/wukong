package io.github.wukong.baidu_bce;

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
