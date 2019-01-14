package com.github.wukong.azurevm;

import org.joda.time.DateTimeZone;

import com.github.wukong.core.KindAnalyzer;
import com.github.wukong.core.KindParameterAnalyzer;

public class AzureVMKindParameterAnalyzer extends KindParameterAnalyzer {

	public AzureVMKindParameterAnalyzer(KindAnalyzer analyzer) {
		super(analyzer);
	}

	static {
		blacklist.add(DateTimeZone.class.getName());
	}
}
