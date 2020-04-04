/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.nodeless.models;

import java.util.Map;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2020.2.15
 * 
 **/
public class CloudRequestModel {

	/**
	 * 
	 */
	protected Map<String, String> cloudApi;
	
	/**
	 * 
	 */
	protected Map<String, Class<?>> apiParams;
	
	/***************************************************************
	 * 
	 *    Constructor
	 * 
	 ***************************************************************/
	
	public CloudRequestModel(Map<String, String> cloudApi, Map<String, Class<?>> apiParams) {
		super();
		this.cloudApi = cloudApi;
		this.apiParams = apiParams;
	}
	
	/***************************************************************
	 * 
	 *    Setter and Getter
	 * 
	 ***************************************************************/


	public Map<String, Class<?>> getApiParams() {
		return apiParams;
	}

	public void setApiParams(Map<String, Class<?>> apiParams) {
		this.apiParams = apiParams;
	}

	public Map<String, String> getCloudApi() {
		return cloudApi;
	}

	public void setCloudApi(Map<String, String> cloudApi) {
		this.cloudApi = cloudApi;
	}
	
}
