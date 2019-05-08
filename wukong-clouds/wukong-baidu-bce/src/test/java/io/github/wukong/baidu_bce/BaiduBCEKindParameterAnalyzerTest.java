package io.github.wukong.baidu_bce;

import com.github.kubesys.tool.generators.ParamterStyleGenerator;

import io.github.wukong.core.KindParameterAnalyzer;

public class BaiduBCEKindParameterAnalyzerTest {

	public static void main(String[] args) {
		BaiduBCEKindAnalyzer ka = new BaiduBCEKindAnalyzer();
		KindParameterAnalyzer mpa = new KindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
			ParamterStyleGenerator.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
		}
	}

}
