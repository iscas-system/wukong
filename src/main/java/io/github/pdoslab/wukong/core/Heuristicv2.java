/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package io.github.pdoslab.wukong.core;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.JSONObject;

import io.github.pdoslab.wukong.utils.ClassUtils;
import io.github.pdoslab.wukong.utils.JavaUtils;

/**
 * @author tangting18@otcaix.iscas.ac.cn
 * @author wuheng@iscas.ac.cn
 * @since 2019.12.10
 */
public class Heuristicv2 {

	protected final Class<?> clientClass;

	protected final Set<String> blacklist;
	
	protected final Map<String, JSONObject> allObjects;
	
	protected final Map<String, Integer> allSuperclasses;
	
	public Heuristicv2(String classname) throws Exception {
		super();
		this.clientClass = Class.forName(classname);
		this.blacklist   = new HashSet<String>();
		this.allObjects  = new HashMap<String, JSONObject>();
		this.allSuperclasses  = new HashMap<String, Integer>();
	}
	
	public Map<String, JSONObject> findAll() throws Exception {
		Set<String> requestSuperclassSet = getRequestSuperclassSet(clientClass);
		System.out.println(requestSuperclassSet);
		System.out.println(getClassWithSuperclass(
				requestSuperclassSet));
		return allObjects;
	}

	@SuppressWarnings("unchecked")
	protected List<Class<?>> getClassWithSuperclass(Set<String> supperclassSet) {
		List<Class<?>> targetClasses = new ArrayList<Class<?>>();
		for (Class<?> targetClass : ClassUtils.scan(clientClass.getPackage().getName())) {
			String typeName = Modifier.isAbstract(targetClass.getSuperclass().getModifiers())
					?  null : targetClass.getSuperclass().getName();
					System.out.println(targetClass + ":" + typeName);
			if (supperclassSet.contains(typeName)) {
				targetClasses.add(targetClass);
			}
		}
		return targetClasses;
	}
	
	protected Set<String> getRequestSuperclassSet(Class<?> clz)  {
		
		for (Method m : clz.getDeclaredMethods()) {
			if (m.getReturnType().isInterface() 
					|| m.getReturnType().getTypeName().startsWith("java")
					|| JavaUtils.isBasic(m.getReturnType())
					|| Modifier.isStatic(m.getModifiers())
					|| Modifier.isPrivate(m.getModifiers())
					|| Modifier.isProtected(m.getModifiers())
					|| m.getReturnType().getTypeName().equals(clz.getName())) {
				continue;
			}
			
			if (m.getParameterCount() == 0 && !blacklist.contains(m.getReturnType().getName()) &&
					!Modifier.isAbstract(m.getReturnType().getModifiers())) {
				blacklist.add(m.getReturnType().getName());
				getRequestSuperclassSet(m.getReturnType());
			} else if (m.getParameterCount() == 1 && !m.getParameterTypes()[0].isInterface()
					&& m.getParameterTypes()[0].getSuperclass() != null) {
				if (!m.getParameterTypes()[0].getName().equals(m.getGenericParameterTypes()[0].getTypeName())) {
					allSuperclasses.put(m.getParameterTypes()[0].getSuperclass().getName(), 100);
				} else  {
					String typeName = m.getParameterTypes()[0].getSuperclass().getName();
					Integer itr = allSuperclasses.get(typeName);
					itr = (itr == null) ? 1 : itr + 1;
					allSuperclasses.put(typeName, itr);
				}
			} 
		}
		
		Set<String> validSuperclass = new HashSet<String>();
		
		for (String name : allSuperclasses.keySet()) {
			if (allSuperclasses.get(name) > 20 && !Object.class.getName().equals(name)) {
				validSuperclass.add(name);
			}
		}
		
		return validSuperclass;
	}
	
	
	public static void main(String[] args) throws Exception {
//		Heuristic h = new Heuristic("com.aliyuncs.DefaultAcsClient");
//		Heuristic h = new Heuristic("com.amazonaws.services.ec2.AmazonEC2Client");
		Heuristicv2 h = new Heuristicv2("com.microsoft.azure.management.compute.implementation.ComputeManagementClientImpl");
		h.findAll();
	}
}
