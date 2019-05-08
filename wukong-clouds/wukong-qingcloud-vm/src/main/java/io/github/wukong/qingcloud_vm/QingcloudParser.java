package io.github.wukong.qingcloud_vm;

import io.github.wukong.core.KindParameterAnalyzer;
import io.github.wukong.core.KindParser;

public class QingcloudParser extends KindParser {

	public QingcloudParser() {
		super();
	}

	public QingcloudParser(String objectRef) {
		super(objectRef);
	}

	@Override
	public KindParameterAnalyzer getModelParameter() {
		return new KindParameterAnalyzer(
				new QingcloudVMKindAnalyzer());
	}

}
