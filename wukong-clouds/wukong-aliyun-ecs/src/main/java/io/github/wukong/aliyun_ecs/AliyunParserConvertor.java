package io.github.wukong.aliyun_ecs;

import io.github.wukong.core.KindParameterAnalyzer;
import io.github.wukong.core.KindParser;

public class AliyunParserConvertor extends KindParser {

	public AliyunParserConvertor() {
		super();
	}

	public AliyunParserConvertor(String objectRef) {
		super(objectRef);
	}

	@Override
	public KindParameterAnalyzer getModelParameter() {
		return new KindParameterAnalyzer(
				new AliyunEcsKindAnalyzer());
	}

}
