/**
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.wukong.aliyun_ecs;

import io.github.wukong.aliyun_ecs.AliyunEcsKindAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @since 2019/5/8
 * 
 */
public class AliyunEcsAnalyzerTest {

	public static void main(String[] args) {
		AliyunEcsKindAnalyzer ka = new AliyunEcsKindAnalyzer();
		System.out.println(ka.getKinds().size());
		for (String kind : ka.getKinds()) {
			System.out.println(kind + ":<" + ka.getDesc(kind)
					+ "," + ka.getModel(kind) + ">");
		}
	}

}
