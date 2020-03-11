/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package io.github.cloudpluslab.wukong;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.alibaba.fastjson.JSONObject;

import io.github.cloudpluslab.wukong.utils.ClassUtils;

/**
 * @author tangting18@otcaix.iscas.ac.cn
 * @author wuheng@otcaix.iscas.ac.cn
 * @since  2020.3.8
 */
public abstract class Analyzer {

	protected final String kind;
	
	protected final Class<?> client;
	
	public Analyzer(String kind, Class<?> client) {
		super();
		this.kind = kind;
		this.client = client;
	}

	public String getKind() {
		return kind;
	}

	public Class<?> getClient() {
		return client;
	}

	public List<Class<?>> findRequestClasses(Set<String> superClasses) {
		List<Class<?>> list = new ArrayList<Class<?>>();
		
		String pkgname = client.getPackage().getName();
		doFind(superClasses, list, pkgname);
		if (list.size() == 0) {
			int idx = pkgname.lastIndexOf(".");
			String basename = pkgname.substring(0, idx);
			doFind(superClasses, list, basename);
		}
		return list;
	}

	protected void doFind(Set<String> superClasses, List<Class<?>> list, String pkgname) {
		for (Class<?> clz : ClassUtils.scan(pkgname, null)) {
			if (clz.getModifiers() == Modifier.PUBLIC 
					&& clz.getModifiers() != Modifier.ABSTRACT
					&& clz.getAnnotation(Deprecated.class) == null) {
				Class<?> sc = clz.getSuperclass();
				while (!sc.getName().equals(Object.class.getName())) {
					if (superClasses.contains(sc.getName())
							&& !clz.getPackage().getName().equals(
									client.getPackage().getName())) {
						System.out.println(clz);
						list.add(clz);
						break;
					}
					sc = sc.getSuperclass();
				}
			}
		}
	}
	
	public abstract List<JSONObject> getLifecycles();
	
}
