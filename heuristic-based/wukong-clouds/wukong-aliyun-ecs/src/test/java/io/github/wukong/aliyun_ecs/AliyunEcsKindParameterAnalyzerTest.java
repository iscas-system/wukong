/**
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.wukong.aliyun_ecs;


import io.github.wukong.core.KindParameterAnalyzer;
import io.github.wukong.core.gens.ParamterStyleGenerator;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @since 2019/5/8
 * 
 */
public class AliyunEcsKindParameterAnalyzerTest {

	public static void main(String[] args) {
		AliyunEcsKindAnalyzer ka = new AliyunEcsKindAnalyzer();
		KindParameterAnalyzer mpa = new KindParameterAnalyzer(ka);
		for (String kind : ka.getKinds()) {
			ParamterStyleGenerator.showModelParametersWithJsonStyle(
					kind, mpa.getParameters(kind));
		}
	}

}
