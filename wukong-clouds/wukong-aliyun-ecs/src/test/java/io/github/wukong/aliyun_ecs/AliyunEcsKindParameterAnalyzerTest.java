package io.github.wukong.aliyun_ecs;

import com.github.kubesys.tool.generators.ParamterStyleGenerator;

import io.github.wukong.core.KindParameterAnalyzer;

public class AliyunEcsKindParameterAnalyzerTest {

	public static void main(String[] args) {
		AliyunEcsKindAnalyzer ka = new AliyunEcsKindAnalyzer();
		KindParameterAnalyzer mpa = new KindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
			ParamterStyleGenerator.showModelParametersWithJsonStyle(kind, mpa.getParameters(kind));
		}
	}

}
