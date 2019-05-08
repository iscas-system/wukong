package io.github.wukong.aliyun_ecs;

import io.github.wukong.aliyun_ecs.AliyunEcsKindAnalyzer;

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
