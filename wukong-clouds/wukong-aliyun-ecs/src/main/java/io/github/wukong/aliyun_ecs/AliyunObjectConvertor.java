package io.github.wukong.aliyun_ecs;

import io.github.wukong.core.KindParameterAnalyzer;
import io.github.wukong.core.KindParser;

public class AliyunObjectConvertor extends KindParser {

	public AliyunObjectConvertor() {
		super();
	}

	public AliyunObjectConvertor(String objectRef) {
		super(objectRef);
	}

	@Override
	public KindParameterAnalyzer getModelParameter() {
		return new KindParameterAnalyzer(
				new AliyunEcsKindAnalyzer());
	}

}
