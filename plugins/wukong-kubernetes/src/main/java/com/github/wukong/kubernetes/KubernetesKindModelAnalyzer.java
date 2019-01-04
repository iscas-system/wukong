/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.wukong.kubernetes;

import java.lang.reflect.Method;

import com.github.wukong.core.KindAnalyzer;
import com.github.wukong.core.KindModelAnalyzer;


/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月2日
 */
public class KubernetesKindModelAnalyzer extends KindModelAnalyzer {

	private static final KubernetesKindAnalyzer analyzer = new KubernetesKindAnalyzer();

	/**
	 * 
	 */
	public KubernetesKindModelAnalyzer() {
		super();
	}

	@Override
	protected Class<?> toKindModel(String kind) throws Exception {
		Class<?> clazz = Class.forName(getKindAnalyzer().getClient());
		for (String name : getKindAnalyzer().getKindDesc(kind).split("-")) {
			Method method = clazz.getMethod(name);
			String typename = method.getGenericReturnType().getTypeName();
			// for example:
			// here is a Typename : io.fabric8.kubernetes.client.dsl.MixedOperation<io.fabric8.kubernetes.api.model.ServiceAccount, io.fabric8.kubernetes.api.model.ServiceAccountList, io.fabric8.kubernetes.api.model.DoneableServiceAccount, io.fabric8.kubernetes.client.dsl.Resource<io.fabric8.kubernetes.api.model.ServiceAccount, io.fabric8.kubernetes.api.model.DoneableServiceAccount>>
			// and io.fabric8.kubernetes.api.model.ServiceAccount is we need
			int start = typename.indexOf("<");
			int end = (typename.indexOf(",") == -1) ? typename.indexOf(">") : typename.indexOf(",");
			String classname = (start == -1) ? typename : typename.substring(start + 1, end);
			clazz = Class.forName(classname);
		}
		return clazz;
	}

	@Override
	protected KindAnalyzer getKindAnalyzer() {
		return analyzer;
	}

}
