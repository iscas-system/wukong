package com.github.wukong.googlece;

import com.github.wukong.googlece.GoogleGCEKindAnalyzer;

public class GoogleGCEAnalyzerTest {

	public static void main(String[] args) {
		GoogleGCEKindAnalyzer ka = new GoogleGCEKindAnalyzer();
		System.out.println(ka.getKinds().size());
		for (String kind : ka.getKinds()) {
			System.out.println(kind + ":<" + ka.getDesc(kind)
					+ "," + ka.getModel(kind) + ">");
		}
	}

}
