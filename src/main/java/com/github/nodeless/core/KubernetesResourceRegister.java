/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.nodeless.core;

import java.io.File;

import com.github.nodeless.models.CloudControllerModel;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2020.2.15
 * 
 **/
public class KubernetesResourceRegister {

	protected final CloudControllerModel cc;
	
	public KubernetesResourceRegister(CloudControllerModel cc) throws Exception {
		super();
		this.cc = cc;
	}
	
	public void registCRDs() throws Exception {
		
		File crd = new File("jsons", cc.getKind().toLowerCase());
		String cmd1 = "/usr/bin/kubectl apply -f " + crd.getAbsolutePath() + "/";
		System.out.println(cmd1);
		Runtime.getRuntime().exec(cmd1);
//		File lifec = new File(crd, cc.getKind().toLowerCase()+"/lifecycle");
//		String cmd2 = "/usr/bin/kubectl -f " + lifec.getAbsolutePath() + "/";
//		System.out.println(cmd2);
//		Runtime.getRuntime().exec(cmd2);
		
		System.out.println("register successful.");
	}

}
