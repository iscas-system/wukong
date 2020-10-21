/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong;

import java.util.ArrayList;
import java.util.List;

import com.github.doslab.wukong.analyzer.RequestWithObjectPatternAnalyzer;
import com.github.doslab.wukong.cmds.AdapterGenerator;
import com.github.doslab.wukong.models.CloudControllerModel;
import com.github.doslab.wukong.models.CloudControllerModel.Dependency;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2020.2.15
 * 
 **/
public class AdapterGeneratorWithHardCodingTest {

	
	/***************************************************************
	 * 
	 *    Getter
	 * 
	 ***************************************************************/
	
	public static void main(String[] args) throws Exception {
		CloudControllerModel cc = new CloudControllerModel();
		cc.setKind("AmazonEKS");
		cc.setClient("com.amazonaws.services.eks.AmazonEKS");
		cc.setAnalyzer(RequestWithObjectPatternAnalyzer.class.getName());
		cc.setInitClient("com.amazonaws.services.eks.AmazonEKSClientBuilder.standard().withCredentials(new\r\n" + 
				"      com.amazonaws.auth.AWSStaticCredentialsProvider(new com.amazonaws.auth.BasicAWSCredentials(map.get(\"accessKey\"),\r\n" + 
				"      map.get(\"secretKey\")))).withRegion(map.get(\"zone\")).build();");
		List<Dependency> dependencies = new ArrayList<Dependency>();
		Dependency d1 = new Dependency();
		d1.setGroupId("com.amazonaws");
		d1.setArtifactId("aws-java-sdk-eks");
		d1.setVersion("1.11.837");
		dependencies.add(d1);
		Dependency d3 = new Dependency();
		d3.setGroupId("com.fasterxml.jackson.core");
		d3.setArtifactId("jackson-databind");
		d3.setVersion("2.11.1");
		dependencies.add(d3);
		cc.setDependency(dependencies);
		AdapterGenerator cmd = new AdapterGenerator(cc);
		cmd.exec();
	}

	
}
