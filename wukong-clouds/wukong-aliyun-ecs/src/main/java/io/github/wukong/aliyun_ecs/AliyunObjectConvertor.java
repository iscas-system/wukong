package com.github.wukong.aliyunecs;

import com.github.wukong.core.KindParameterAnalyzer;
import com.github.wukong.core.ObjectConvertor;

public class AliyunObjectConvertor extends ObjectConvertor {

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
