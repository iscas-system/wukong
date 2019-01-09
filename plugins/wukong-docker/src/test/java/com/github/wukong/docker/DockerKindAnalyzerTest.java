/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.wukong.docker;

import com.github.wukong.docker.DockerKindAnalyzer;

public class DockerKindAnalyzerTest {

	public static void main(String[] args) {
		DockerKindAnalyzer ka = new DockerKindAnalyzer();
		System.out.println(ka.getKinds().size());
		for (String kind : ka.getKinds()) {
			System.out.println(kind + ":<" + ka.getDesc(kind)
					+ "," + ka.getModel(kind) + ">");
		}
	}

}
