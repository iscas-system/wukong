/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package io.github.cloudpluslab.wukong.analyzer;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.github.cloudpluslab.wukong.Analyzer;
import io.github.cloudpluslab.wukong.models.MethodModel;
import io.github.cloudpluslab.wukong.utils.JavaUtils;

/**
 * @author tangting18@otcaix.iscas.ac.cn
 * @author wuheng@otcaix.iscas.ac.cn
 * @since  2020.3.8
 * 
 * Azure, Google
 */
public class RequestWithParameterPatternAnalyzer extends Analyzer {


	public RequestWithParameterPatternAnalyzer(String kind, Class<?> client) {
		super(kind, client);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public List getRegisterInfos() {
		
		Map<String, List<MethodModel>> map = new HashMap<String, List<MethodModel>>();
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

	protected List<MethodModel> filterInvalidRequests(Map<String, List<MethodModel>> map) {
		List<MethodModel> expected = new ArrayList<MethodModel>();
		int i = 0;
		for (String key : map.keySet()) {
			if (map.get(key).size() > i) {
				expected = map.get(key);
				i = expected.size();
			}
		}
		return expected;
	}

	protected void findAllPossibleRequests(Map<String, List<MethodModel>> map, Method method) {
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
			
			List<MethodModel> ms = map.get(key);
			ms = (ms == null) ? new ArrayList<MethodModel>() : ms;
			ms.add(new MethodModel(method.getReturnType(), m));
			map.put(key, ms);
			
			String infoKey = m.getName() + method.getReturnType().getSimpleName();
			String infoValue = method.getName() + "-" + m.getName();
			infos.put(infoKey, infoValue);
		}
	}

}
