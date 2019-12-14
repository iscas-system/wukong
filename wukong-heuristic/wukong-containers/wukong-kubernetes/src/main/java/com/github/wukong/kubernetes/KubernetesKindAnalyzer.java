/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.wukong.kubernetes;

import java.lang.reflect.Method;

import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.NonNamespaceOperation;
import io.github.wukong.core.KindAnalyzer;
import io.github.wukong.core.utils.ObjectUtils;

/**
 * @author wuheng@iscas.ac.cn
 * @since  2019.1
 */
public class KubernetesKindAnalyzer extends KindAnalyzer {

	protected static final String KIND_BASIC_TAG = NonNamespaceOperation.class.getName();

	protected static final String KIND_MIXED_TAG = MixedOperation.class.getName();

	protected static final String KIND_GROUP_TAG = "GroupDSL";
	
	/**
	 * 
	 */
	public KubernetesKindAnalyzer() {
		super();
	}
	
	/**
	 * for fabric8, the return value either 
	 * io.fabric8.kubernetes.client.dsl.NonNamespaceOperation 
	 * or io.fabric8.kubernetes.client.dsl.MixedOperation. <br>
	 * <br>
	 * 
	 */
	@Override
	protected boolean isKind(Method method) {
		return ObjectUtils.isNullObject(method) ? false
				: ((KIND_MIXED_TAG.equals(method.getReturnType().getName())
							|| KIND_BASIC_TAG.equals(method.getReturnType().getName())) 
						&& (method.getParameterCount() == 0)
					&& (!method.isAnnotationPresent(Deprecated.class)));
	}

	@Override
	protected boolean isKindGroup(Method method) {
		return ObjectUtils.isNullObject(method) ? false
				: ((method.getReturnType().getName().endsWith(KIND_GROUP_TAG))
						&& (!method.isAnnotationPresent(Deprecated.class)));
	}

	@Override
	protected String toKind(Method method) {
		String fullname = getFullname(method);
		int idx = fullname.lastIndexOf(".");
		return fullname.substring(idx + 1);
		
	}

	@Override
	protected String toParamDesc(Method method) {
		return getFullname(method);
	}

	@Override
	public String getClient() {
		return DefaultKubernetesClient.class.getName();
	}

	/**
	 * for example, the GenericReturnType would be
	 * MixedOperation<Event, EventList, DoneableEvent, Resource<Event, DoneableEvent>>
	 * and fullname means the classname of object Event
	 * @param method method
	 * @return return typeName
	 */
	private String getFullname(Method method) {
		String typeName = method.getGenericReturnType().getTypeName();
		int sIdx = typeName.indexOf("<");
		int eIdx = typeName.indexOf(",");
		return typeName.substring(sIdx + 1, eIdx).trim();
	}
}
