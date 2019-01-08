/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package com.github.wukong.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.github.wukong.core.utils.StringUtils;

public abstract class KindModelAnalyzer {

	/************************************************************************************
	 * 
	 *                              Cores
	 * 
	 ************************************************************************************/
	
	/**
	 * 记录kind和model的对应关系，比如：
	 * Deployment=io.fabric8.kubernetes.api.model.extensions.Deployment
	 */
	protected final Map<String, String> models = new HashMap<String, String>();
	
	public KindModelAnalyzer() {
		super();
		analyseModels();
	}

	/**
	 * 分析kind对应的model
	 */
	protected void analyseModels() {
		for (String kind : getKindAnalyzer().getKinds()) {
			try {
				models.put(kind, toKindModel(kind).getName());
			} catch (Exception e) {
				// ignore here
			}
		}
	}
	
	/**
	 * @return 获取所有的kind对应的fabric8模型
	 */
	public Map<String, String> getKindModels() {
		return models;
	}
	
	/**
	 * @return 获取所有的kind
	 */
	protected Set<String> getKinds() {
		return models.keySet();
	}
	
	/**
	 * @param kind 具体的kind
	 * @return 获取指定kind对应的fabric8模型
	 */
	public String getKindModel(String kind) {
		return StringUtils.isNull(kind) ? null : models.get(kind);
	}
	
	
	/************************************************************************************
	 * 
	 *                       You should implement it by yourself
	 * 
	 ************************************************************************************/
	
	/**
	 * @param kind kind
	 * @return class
	 * @throws Exception fail reason
	 */
	protected abstract Class<?> toKindModel(String kind) throws Exception;
	
	/**
	 * @return KindAnalyzer
	 */
	protected abstract KindAnalyzer getKindAnalyzer();
	
	
	
}
