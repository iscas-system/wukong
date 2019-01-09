/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.wukong.openshift;

import java.util.HashSet;
import java.util.Set;

import com.github.wukong.core.ModelParameterGenerator;
import com.github.wukong.core.utils.StringUtils;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月6日
 */
public class OpenShiftModelParameterGenerator extends ModelParameterGenerator {

	protected final static Set<String> ignoreMethods = new HashSet<String>();
	
	protected final static String GET = "get";
	
	/**
	 * 
	 */
	public OpenShiftModelParameterGenerator() {
		super();
	}

	/**
	 * @param objectRef
	 */
	public OpenShiftModelParameterGenerator(String objectRef) {
		super(objectRef);
	}
	
	static {
		ignoreMethods.add("setApiVersion");
		ignoreMethods.add("setKind");
		ignoreMethods.add("setResult");
		ignoreMethods.add("setPaused");
		ignoreMethods.add("setInitContainers");
		ignoreMethods.add("setUid");
		ignoreMethods.add("setSelfLink");
		ignoreMethods.add("setFinalizers");
		ignoreMethods.add("setCreationTimestamp");
		ignoreMethods.add("setMetadatasetClasssetModifiers");
		ignoreMethods.add("setAdditionalProperties");
		
		
		ignoreMethods.add("getApiVersion");
		ignoreMethods.add("getKind");
		ignoreMethods.add("getResult");
		ignoreMethods.add("getPaused");
		ignoreMethods.add("getInitContainers");
		ignoreMethods.add("getUid");
		ignoreMethods.add("getSelfLink");
		ignoreMethods.add("getFinalizers");
		ignoreMethods.add("getCreationTimestamp");
		ignoreMethods.add("getMetadatasetClasssetModifiers");
		ignoreMethods.add("getAdditionalProperties");
	}
	
	@Override
	public boolean ignoreMethod(String name) {
		return StringUtils.isNull(name) ? true : 
			(name.startsWith(GET) 
					&& !ignoreMethods.contains(name)) 
							? false : true;
	}


}
