/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong.analyzer;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.doslab.wukong.models.ClassToMethodModel;
import com.github.doslab.wukong.models.CloudControllerModel;
import com.github.doslab.wukong.utils.JavaUtils;

/**
 * @author tangting18@otcaix.iscas.ac.cn
 * @author wuheng@otcaix.iscas.ac.cn
 * @since  2020.3.8
 * 
 * Azure, Google
 */
public class RequestWithParameterPatternAnalyzer extends CrossCloudAPIAnalyzer {

	public RequestWithParameterPatternAnalyzer(CloudControllerModel ccm) throws Exception {
		super(ccm);
	}

	public RequestWithParameterPatternAnalyzer(String kind, String client) throws Exception {
		super(kind, client);
	}

	public RequestWithParameterPatternAnalyzer(String kind, String client, ClassLoader loader) throws Exception {
		super(kind, client, loader);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public List extraCloudAPIs() {
		Map<String, List<ClassToMethodModel>> map = new HashMap<String, List<ClassToMethodModel>>();
		for (Method method : client.getDeclaredMethods()) {
			if (method.getModifiers() != Modifier.PUBLIC
					|| method.getModifiers() == Modifier.STATIC
					|| method.getParameters().length != 0
					|| JavaUtils.isBasic(method.getReturnType())
					|| method.getReturnType().isInterface() 
					|| method.getReturnType().getTypeName().startsWith("java")
					|| method.getReturnType().getTypeName().equals(client.getName())) {
				continue;
			}
			
			findAllPossibleRequests(map, method);
		}
		
		return filterInvalidRequests(map);
		
	}

	protected List<ClassToMethodModel> filterInvalidRequests(Map<String, List<ClassToMethodModel>> map) {
		List<ClassToMethodModel> expected = new ArrayList<ClassToMethodModel>();
		int i = 0;
		for (String key : map.keySet()) {
			if (map.get(key).size() > i) {
				expected = map.get(key);
				i = expected.size();
			}
		}
		return expected;
	}

	protected void findAllPossibleRequests(Map<String, List<ClassToMethodModel>> map, Method method) {
		for (Method m : method.getReturnType().getMethods()) {
			
			if (m.getReturnType().getName().equals("void") 
					|| m.getReturnType().getName().startsWith("java")
					|| JavaUtils.isPrimitive(m.getReturnType())
					|| m.getReturnType().isInterface()) {
				continue;
			}
			
			String key = null;
			if (m.getReturnType().getSuperclass().getName().equals(Object.class.getName())) {
				key = m.getReturnType().getName();
			} else {
				key = m.getReturnType().getSuperclass().getName();
			}
			
			List<ClassToMethodModel> ms = map.get(key);
			ms = (ms == null) ? new ArrayList<ClassToMethodModel>() : ms;
			ms.add(new ClassToMethodModel(method.getReturnType(), m));
			map.put(key, ms);
			
			String infoKey = m.getName() + method.getReturnType().getSimpleName();
			String infoValue = method.getName() + "-" + m.getName();
			methodMappers.put(infoKey, infoValue);
		}
	}

}
