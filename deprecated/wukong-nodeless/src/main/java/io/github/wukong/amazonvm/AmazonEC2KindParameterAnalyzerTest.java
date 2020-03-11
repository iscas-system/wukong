package io.github.wukong.amazonvm;


import com.alibaba.fastjson.JSON;

import io.github.wukong.core.KindParameterAnalyzer;

public class AmazonEC2KindParameterAnalyzerTest {

	public static void main(String[] args) {
		AmazonCE2KindAnalyzer ka = new AmazonCE2KindAnalyzer();
		KindParameterAnalyzer mpa = new KindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
//			ParamterStyleGenerator.showModelParametersWithNetstedStyle(kind, mpa.getParameters(kind));
			System.out.println(JSON.toJSONString(mpa.getParameters(kind), true));
		}
	}

}
