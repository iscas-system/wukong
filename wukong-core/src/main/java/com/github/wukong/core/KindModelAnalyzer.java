/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package com.github.wukong.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.github.wukong.core.utils.StringUtils;

/**
 * 发现kind对应fabric8的对象。
 * models是由key, value组成的Map <br>
 * 
 * 比如： <br> <br>
 * 
 * 对于ServiceAccount的kind，是通过如下方式实例化的：  <br>
 * io.fabric8.kubernetes.api.model.ServiceAccount <br>
 * 
 * @author wuheng@(otcaix.iscas.ac.cn)
 *
 * 2018年3月2日
 */
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
