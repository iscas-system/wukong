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

import com.alibaba.fastjson.JSONObject;

import io.github.cloudpluslab.wukong.Analyzer;
import io.github.cloudpluslab.wukong.utils.JavaUtils;

/**
 * @author tangting18@otcaix.iscas.ac.cn
 * @author wuheng@otcaix.iscas.ac.cn
 * @since  2020.3.8
 * 
 * Aliyun, Amazon, Baidu, Tencent, JD
 */
public class RequestResponsePatternAnalyzer extends Analyzer {


	public RequestResponsePatternAnalyzer(String kind, Class<?> client) {
		super(kind, client);
	}

	@Override
	public List<JSONObject> getLifecycles() {
		List<JSONObject> list = new ArrayList<JSONObject>();
		
		Map<String, Integer> superClasses = new HashMap<String, Integer>();
		for (Method method : client.getDeclaredMethods()) {
			if (method.getModifiers() != Modifier.PUBLIC 
					|| method.getParameters().length != 1
					|| method.getParameterTypes()[0].isInterface()
					|| method.getParameterTypes()[0].getSuperclass() == null
					|| method.getParameterTypes()[0].getSuperclass().getName().equals(Object.class.getName())
					|| JavaUtils.isBasic(method.getReturnType())
					|| method.getReturnType().isInterface() 
					|| method.getReturnType().getTypeName().startsWith("java")
					|| method.getReturnType().getTypeName().equals(client.getName())) {
				continue;
			}
			
			if (!method.getParameterTypes()[0].getName().equals(
					method.getGenericParameterTypes()[0].getTypeName())) {
				superClasses.put(method.getParameterTypes()[0].getTypeName(), 100);
			} else  {
				String typeName = method.getParameterTypes()[0].getSuperclass().getName();
				Integer itr = superClasses.get(typeName);
				itr = (itr == null) ? 1 : itr + 1;
				superClasses.put(typeName, itr);
			}
			
		}
		
		System.out.println(findRequestClasses(superClasses.keySet()).size());
		
		return list;
	}

}
