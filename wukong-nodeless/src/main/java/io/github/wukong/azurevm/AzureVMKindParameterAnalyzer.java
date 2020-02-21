package io.github.wukong.azurevm;

import org.joda.time.DateTimeZone;

import io.github.wukong.core.KindAnalyzer;
import io.github.wukong.core.KindParameterAnalyzer;

public class AzureVMKindParameterAnalyzer extends KindParameterAnalyzer {

	public AzureVMKindParameterAnalyzer(KindAnalyzer analyzer) {
		super(analyzer);
	}

	static {
		blacklist.add(DateTimeZone.class.getName());
	}
}
