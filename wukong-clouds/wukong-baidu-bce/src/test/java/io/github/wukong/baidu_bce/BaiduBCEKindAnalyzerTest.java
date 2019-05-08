package io.github.wukong.baidu_bce;

import io.github.wukong.baidu_bce.BaiduBCEKindAnalyzer;

public class BaiduBCEKindAnalyzerTest {

	public static void main(String[] args) {
		BaiduBCEKindAnalyzer ka = new BaiduBCEKindAnalyzer();
		System.out.println(ka.getKinds().size());
		for (String kind : ka.getKinds()) {
			System.out.println(kind + ":<" + ka.getDesc(kind)
					+ "," + ka.getModel(kind) + ">");
		}
	}

}
