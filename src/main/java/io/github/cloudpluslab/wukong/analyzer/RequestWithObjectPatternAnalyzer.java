/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package io.github.cloudpluslab.wukong.analyzer;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.github.cloudpluslab.wukong.Analyzer;
import io.github.cloudpluslab.wukong.utils.ClassUtils;
import io.github.cloudpluslab.wukong.utils.JavaUtils;

/**
 * @author tangting18@otcaix.iscas.ac.cn
 * @author wuheng@otcaix.iscas.ac.cn
 * @since  2020.3.8
 * 
 * Aliyun, Amazon, Baidu, Tencent, JD
 */
public class RequestWithObjectPatternAnalyzer extends Analyzer {


	public RequestWithObjectPatternAnalyzer(String kind, Class<?> client) {
		super(kind, client);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public List getRegisterInfos() {
		Map<String, Integer> superClasses = new HashMap<String, Integer>();
		Map<String, Integer> useMethods = new HashMap<String, Integer>();
		boolean generic = false;
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
				// Generic type
				superClasses.put(method.getParameterTypes()[0].getTypeName(), 100);
				useMethods.put(method.getName(), 100);
				generic = true;
			} else  {
				// Direct request
				String typeName = method.getParameterTypes()[0].getSuperclass().getName();
				Integer itr = superClasses.get(typeName);
				itr = (itr == null) ? 1 : itr + 1;
				superClasses.put(typeName, itr);
			}
			
		}
		
		List<Class<?>> findAllRequestsBySuperClasses = findAllRequestsBySuperClasses(superClasses.keySet());
		
		doAnalysisUseRegisterInfos(useMethods, generic, findAllRequestsBySuperClasses);
		
		return findAllRequestsBySuperClasses;
	}

	protected void doAnalysisUseRegisterInfos(Map<String, Integer> useMethods, boolean generic,
			List<Class<?>> findAllRequestsBySuperClasses) {
		Set<String> paramType = new HashSet<String>();
		
		for (Class<?> clz : findAllRequestsBySuperClasses) {
			paramType.add(clz.getSimpleName());
		}
		
	    if (generic) {
	    	String value = null;
	    	for (String str : useMethods.keySet()) {
	    		if (str.toLowerCase().contains("response")) {
	    			value = str;
	    			break;
	    		}
	    	}
	    	
	    	for (String param : paramType) {
	    		String newkey = param.substring(0, 1).toLowerCase() + param.substring(1);
	    		infos.put(newkey, value);
	    	}
	    } else {
	    	for (Method mm : client.getDeclaredMethods()) {
	    		if (mm.getParameterCount() != 1) {
	    			continue;
	    		}
	    		
	    		String param = mm.getParameterTypes()[0].getSimpleName();
				if (paramType.contains(param)) {
	    			String newkey = param.substring(0, 1).toLowerCase() + param.substring(1);
	    			infos.put(newkey, mm.getName());
	    		}
	    	}
	    }
	}
	
	public List<Class<?>> findAllRequestsBySuperClasses(Set<String> superClasses) {
		System.out.println("super:" + superClasses);
		List<Class<?>> list = new ArrayList<Class<?>>();
		String pkgName = client.getPackage().getName();
		searchingAllPossiblePackages(superClasses, list, pkgName);
		if (list.size() == 0) {
			int idx = pkgName.lastIndexOf(".");
			String basename = pkgName.substring(0, idx);
			searchingAllPossiblePackages(superClasses, list, basename);
		}
		return list;
	}
	
	protected void searchingAllPossiblePackages(Set<String> superClasses, List<Class<?>> list, String pkgname) {
		System.err.println(pkgname);
		for (Class<?> clz : ClassUtils.scan(pkgname, null)) {
			if (clz.getModifiers() == Modifier.PUBLIC 
					&& clz.getModifiers() != Modifier.ABSTRACT
					&& clz.getAnnotation(Deprecated.class) == null) {
				Class<?> sc = clz.getSuperclass();
				while (!sc.getName().equals(Object.class.getName())) {
					if (superClasses.contains(sc.getName())
							&& !clz.getPackage().getName().equals(
									client.getPackage().getName())) {
						list.add(clz);
						break;
					}
					sc = sc.getSuperclass();
				}
			}
		}
	}

}
