/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package com.github.wukong.core;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import com.github.wukong.core.utils.JavaUtils;
import com.github.wukong.core.utils.ObjectUtils;

/**
 * @author wuheng@(otcaix.iscas.ac.cn)
 *
 * 2018年3月6日
 */
public abstract class ModelGenerator {

	/************************************************************************************
	 * 
	 *                                Cores
	 * 
	 ************************************************************************************/
	
	/**
	 * 
	 */
	public final static String GET_METHOD = "get";
	
	/**
	 * 
	 */
	public final static String SET_METHOD = "set";
	
	
	/**
	 * 
	 */
	public final static String DEFAULT_PARENT = "default";
	
	/**
	 * 
	 */
	public final static String DEFAULT_TYPE = "default";
	
	/**
	 * 
	 */
	public final Map<String, Object> objCache = new HashMap<String, Object>();
	
	/**
	 * @return ModelParameter
	 */
	public abstract ModelParameterAnalyzer getModelParameter();
	
	
	/**
	 * 
	 */
	public Map<String, String> params = null;

	/**
	 * 
	 */
	protected final String objectRef;
	
	/**
	 * 
	 */
	public ModelGenerator() {
		this(ModelParameterGenerator.JOINTWARE);
	}
	
	/**
	 * @param objectRef ref
	 */
	public ModelGenerator(String objectRef) {
		super();
		this.objectRef = objectRef;
	}

	/**
	 * @param inputValues values
	 * @param kind kind
	 * @return Object
	 * @throws Exception fail reason 
	 */
	public Object toObject(Map<String, Map<String, Object>> inputValues, 
									String kind) throws Exception {
		
		if (ObjectUtils.isNull(inputValues) || ObjectUtils.isNull(kind)) {
			return null;
		}
		
		params = getModelParameter().getModelParameters(kind);
		objCache.put(DEFAULT_TYPE, getKindObject(kind));
		_toObject(inputValues, 
				objCache.get(DEFAULT_TYPE), 
				DEFAULT_PARENT, 
				ModelParameterGenerator.DEFAULT_TYPE);
		return objCache.get(DEFAULT_TYPE);
	}

	/**
	 * @param inputValues values
	 * @param object object
	 * @param parent parent
	 * @param type type
	 * @throws Exception what you fail
	 */
	@SuppressWarnings("unchecked")
	protected void _toObject(Map<String, Map<String, Object>> inputValues, 
			Object object, String parent, String type) throws Exception {
		
		Map<String, Object> typeValues = inputValues.get(type);
		
		
		for (String key : typeValues.keySet()) {
			
			boolean ignore = false;
			
			Stack<String> stack = getStack(key);
			
			if (stack.size() <= 1 && key.indexOf("-") == -1) {
				ignore = true;
			}
			
			while (stack.size() > 1) {
				String fullname = stack.pop();
				int idx = fullname.lastIndexOf("-");
				String mname = (idx == -1) ? fullname : fullname.substring(idx + 1);
				if (objCache.get(getRealFullname(parent, fullname)) == null) {
					Class<?> clazz = objCache.get(getParent(type, 
							getRealFullname(parent, fullname))).getClass();
					Method method = clazz.getMethod(mname, Class.forName(
							params.get(getRealFullname(parent, fullname))));
					Object newInstance = Class.forName(params.get(
							getRealFullname(parent, fullname))).newInstance();
					method.invoke(objCache.get(getParent(type, 
							getRealFullname(parent, fullname))), 
									newInstance);
					objCache.put(getRealFullname(parent, fullname), newInstance);
				}
			}
			
			String fullname = stack.pop();
			int idx = fullname.lastIndexOf("-");
			String thisKey = ignore ? getParent(getRealKey(parent, fullname, idx)) : getRealKey(parent, fullname, idx);
			String thisMethod = (idx == -1) ? fullname : fullname.substring(idx + 1);
			if (JavaUtils.isPrimitive(params.get(getRealFullname(parent, fullname)))) {
				Object obj = objCache.get(thisKey);
				Method method = obj.getClass().getMethod(
						thisMethod, Class.forName(params.get(getRealFullname(parent, fullname))));
				
				if (!(typeValues.get(fullname) instanceof String)) {
					typeValues.put(fullname, String.valueOf(typeValues.get(fullname)));
				}
				Class<?> clazz = Class.forName(params.get(getRealFullname(parent, fullname)));
				Constructor<?> c = clazz.getConstructor(String.class);
				method.invoke(obj, c.newInstance(typeValues.get(fullname)));
				
			} else if (JavaUtils.isList(params.get(getRealFullname(parent, fullname)))) {
				
				Collection<String> thisValues = (Collection<String>)typeValues.get(fullname);
				if (thisValues == null || thisValues.isEmpty()) {
					continue;
				}

				Object obj = objCache.get(thisKey);
				Method method = obj.getClass().getMethod(thisMethod, List.class);
				if (thisValues.iterator().next()
						.startsWith(objectRef)) {
					List<Object> list = new ArrayList<Object>();
					for (String str : thisValues) {
						Object newInstance = Class.forName(getClassForCollectionStyle(str)).newInstance();
						objCache.put(getRealFullname(parent, key), newInstance);
						_toObject(inputValues, newInstance, getRealFullname(parent, key), str);
						objCache.remove(getRealFullname(parent, key));
						list.add(newInstance);
					}
					method.invoke(obj, list);
				} else {
					thisValues.addAll((Collection<String>)typeValues.get(fullname));
					method.invoke(obj, thisValues);
				}
				System.out.println(objCache.get(DEFAULT_PARENT));
			} else if (JavaUtils.isStringObjectMap(params.get(getRealFullname(parent, fullname)))) {
				
				Collection<String> thisValues = (Collection<String>)typeValues.get(fullname);
				if (thisValues == null || thisValues.isEmpty()) {
					continue;
				}
				
				Object obj = objCache.get(thisKey);
				Method method = obj.getClass().getMethod(thisMethod, Map.class);
				
				if (thisValues.iterator().next()
						.startsWith(ModelParameterGenerator.JOINTWARE)) {
					Map<String, Object> list = new HashMap<String, Object>();
					for (String str : thisValues) {
						Object newInstance = Class.forName(getClassForMapStyle(str)).newInstance();
						objCache.put(getRealFullname(parent, key), newInstance);
						_toObject(inputValues, newInstance, getRealFullname(parent, key), str);
						objCache.remove(getRealFullname(parent, key));
						list.put(getKeyForMapStyle(str), newInstance);
					}
					method.invoke(obj, list);
				} else {
					thisValues.addAll((Collection<String>)typeValues.get(fullname));
					method.invoke(obj, thisValues);
				}
				
			} else if (JavaUtils.isStringStringMap(params.get(getRealFullname(parent, fullname)))) {
				
				Map<String, String> thisValues = (Map<String, String>)typeValues.get(fullname);
				if (thisValues == null || thisValues.isEmpty()) {
					continue;
				}
				
				Object obj = objCache.get(thisKey);
				Method method = obj.getClass().getMethod(thisMethod, Map.class);
				
				if (thisValues.keySet().iterator().next()
						.startsWith(ModelParameterGenerator.JOINTWARE)) {
					Map<String, Object> list = new HashMap<String, Object>();
					for (String str : thisValues.keySet()) {
						Object newInstance = Class.forName(getClassForMapStyle(str)).newInstance();
						objCache.put(getRealFullname(parent, key), newInstance);
						_toObject(inputValues, newInstance, getRealFullname(parent, key), str);
						objCache.remove(getRealFullname(parent, key));
						list.put(getKeyForMapStyle(str), newInstance);
					}
					method.invoke(obj, list);
				} else {
					thisValues.putAll((Map<String, String>)typeValues.get(fullname));
					method.invoke(obj, thisValues);
				}
				
			} else {
				System.out.println(key);
			}
		}
	}

	/**
	 * @param str str
	 * @return style
	 */
	protected String getClassForCollectionStyle(String str) {
		int idx = str.indexOf("-");
		return str.substring(idx + 1).trim();
	}
	
	/**
	 * @param str str
	 * @return style
	 */
	protected String getClassForMapStyle(String str) {
		int idx = str.lastIndexOf("-");
		return str.substring(idx + 1).trim();
	}
	
	/**
	 * @param str str
	 * @return style
	 */
	protected String getKeyForMapStyle(String str) {
		int sidx = str.indexOf("-");
		int eidx = str.lastIndexOf("-");
		return str.substring(sidx + 1, eidx).trim();
	}
	
	/**
	 * @param name name
	 * @return real name
	 */
	protected String getName(String name) {
		return GET_METHOD + name.substring(SET_METHOD.length());
	}

	/**
	 * @param parent parent
	 * @param fullname fullname
	 * @param idx idx
	 * @return real key
	 */
	protected String getRealKey(String parent, String fullname, int idx) {
		String realKey = (idx == -1) ? fullname : fullname.substring(0, idx);
		return parent.equals(DEFAULT_PARENT) ? realKey : parent + "-" + realKey;
	}

	
	/**
	 * @param parent parent
	 * @param fullname fullname
	 * @return real fullname
	 */
	protected String getRealFullname(String parent, String fullname) {
		return (parent.equals(DEFAULT_PARENT)) ? fullname : parent + "-" + fullname;
	}
	
	/**
	 * @param type type
	 * @param fullname fullname
	 * @return parent
	 */
	protected String getParent(String type, String fullname) {
		int idx = fullname.lastIndexOf("-");
		return (idx == -1) 
				? (type.equals("main")) ? 
						DEFAULT_TYPE : fullname 
							: fullname.substring(0, idx);
	}
	
	/**
	 * @param fullname fullname
	 * @return parent
	 */
	protected String getParent(String fullname) {
		int idx = fullname.lastIndexOf("-");
		return (idx == -1) ?  fullname 
							: fullname.substring(0, idx);
	}
	
	/**
	 * @param key key
	 * @return stack
	 */
	protected Stack<String> getStack(String key) {
		String elem = key;
		Stack<String> stack = new Stack<String>();
		stack.push(elem);
		int idx = elem.lastIndexOf("-");
		while (idx != -1) {
			elem = elem.substring(0, idx);
			stack.push(elem);
			idx = elem.lastIndexOf("-");
		}
		return stack;
	}

	/**
	 * @param kind kind
	 * @return Object
	 */
	protected Object getKindObject(String kind) {
		try {
			return Class.forName(
					getModelParameter()
							.getKindModels().get(kind))
									.newInstance();
		} catch (Exception e) {
			return new Object();
		}
	}
	
}
