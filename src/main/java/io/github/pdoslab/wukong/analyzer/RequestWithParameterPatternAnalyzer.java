/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package io.github.pdoslab.wukong.analyzer;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

import io.github.pdoslab.wukong.Analyzer;
import io.github.pdoslab.wukong.utils.JavaUtils;

/**
 * @author tangting18@otcaix.iscas.ac.cn
 * @author wuheng@otcaix.iscas.ac.cn
 * @since  2020.3.8
 * 
 * Aliyun, Amazon, Baidu, Tencent, JD
 */
public class RequestWithParameterPatternAnalyzer extends Analyzer {


	public RequestWithParameterPatternAnalyzer(String kind, Class<?> client) {
		super(kind, client);
	}

	@Override
	public List<JSONObject> getLifecycles() {
		
		Map<String, List<Method>> map = new HashMap<String, List<Method>>();
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
		
		List<Method> expected = filterInvalidRequests(map);
		
		System.out.println(expected.size());
		System.out.println(expected);
		return null;
	}

	protected List<Method> filterInvalidRequests(Map<String, List<Method>> map) {
		List<Method> expected = new ArrayList<Method>();
		int i = 0;
		for (String key : map.keySet()) {
			if (map.get(key).size() > i) {
				expected = map.get(key);
				i = expected.size();
			}
		}
		return expected;
	}

	protected void findAllPossibleRequests(Map<String, List<Method>> map, Method method) {
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
			
			List<Method> ms = map.get(key);
			ms = (ms == null) ? new ArrayList<Method>() : ms;
			ms.add(m);
			map.put(key, ms);
		}
	}

}
