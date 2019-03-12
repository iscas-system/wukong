/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package com.github.wukong.core;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import com.alibaba.fastjson.JSON;
import com.github.wukong.core.utils.JavaUtils;
import com.github.wukong.core.utils.ObjectUtils;

/**
 * @author wuheng@(otcaix.iscas.ac.cn)
 *
 */
public abstract class ObjectConvertor {

	/************************************************************************************
	 *
	 * Cores
	 *
	 ************************************************************************************/

	/**
	*
	*/
	public final static String GET_METHOD = "get";

	/**
	*
	*/
	public final static String WITH_METHOD = "with";

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
	public final static String DEFAULT_ENTRANCE = "main";

	/**
	 * 
	 */
	public final static String JOINTWARE = "ref";

	/**
	*
	*/
	public final Map<String, Object> objCache = new HashMap<String, Object>();

	/**
	 * @return ModelParameter
	 */
	public abstract KindParameterAnalyzer getModelParameter();

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
	public ObjectConvertor() {
		this(JOINTWARE);
	}

	/**
	 * @param objectRef ref
	 */
	public ObjectConvertor(String objectRef) {
		super();
		this.objectRef = objectRef;
	}

	
	public Object toObject(String json, String kind) throws Exception {
		@SuppressWarnings("unchecked")
		Map<String, Map<String, Object>> javaObject = (Map<String, Map<String, Object>>) 
														JSON.parseObject(json, Map.class);
		return toObject(javaObject, kind);
	}
	
	/**
	 * @param inputValues values
	 * @param kind        kind
	 * @return Object
	 * @throws Exception fail reason
	 */
	public Object toObject(Map<String, Map<String, Object>> inputValues, String kind) throws Exception {

		if (ObjectUtils.isNull(inputValues) || ObjectUtils.isNull(kind)) {
			return null;
		}

		params = getModelParameter().getParameters(kind);
		objCache.put(DEFAULT_TYPE, getKindObject(kind));
		_toObject(inputValues, DEFAULT_PARENT, DEFAULT_ENTRANCE);
		return objCache.get(DEFAULT_TYPE);
	}

	/**
	 * @param inputValues values
	 * @param object      object
	 * @param parent      parent
	 * @param type        type
	 * @throws Exception what you fail
	 */
	@SuppressWarnings("unchecked")
	protected void _toObject(Map<String, Map<String, Object>> inputValues, String parent, String type)
			throws Exception {

		Map<String, Object> typeValues = inputValues.get(type);

		for (String key : typeValues.keySet()) {

			Stack<String> stack = getStack(key);

			while (stack.size() > 1) {
				String fullname = stack.pop();
				int idx = fullname.lastIndexOf("-");
				String mname = (idx == -1) ? fullname : fullname.substring(idx + 1);
				if (objCache.get(getRealFullname(parent, fullname)) == null) {
					Class<?> clazz = objCache.get(getParent(type, getRealFullname(parent, fullname))).getClass();
					Method method = clazz.getMethod(mname,
							Class.forName(params.get(getRealFullname(parent, fullname))));
					Object newInstance = Class.forName(params.get(getRealFullname(parent, fullname))).newInstance();
					method.invoke(objCache.get(getParent(type, getRealFullname(parent, fullname))), newInstance);
					objCache.put(getRealFullname(parent, fullname), newInstance);
				}
			}

			String fullname = stack.pop();
			int idx = fullname.lastIndexOf("-");
			String thisMethod = (idx == -1) ? fullname : fullname.substring(idx + 1);
			Object obj = objCache.get(parent);
			if (JavaUtils.isPrimitive(params.get(getRealFullname(parent, fullname)))) {
				Method method = obj.getClass().getMethod(thisMethod,
						Class.forName(params.get(getRealFullname(parent, fullname))));

				if (!(typeValues.get(fullname) instanceof String)) {
					typeValues.put(fullname, String.valueOf(typeValues.get(fullname)));
				}
				Class<?> clazz = Class.forName(params.get(getRealFullname(parent, fullname)));
				Constructor<?> c = clazz.getConstructor(String.class);
				method.invoke(obj, c.newInstance(typeValues.get(fullname)));

			} else if (JavaUtils.isList(params.get(getRealFullname(parent, fullname)))) {

				Collection<String> thisValues = (Collection<String>) typeValues.get(fullname);
				if (thisValues == null || thisValues.isEmpty()) {
					continue;
				}

				Method method = obj.getClass().getMethod(thisMethod, List.class);
				if (thisValues.iterator().next().startsWith(objectRef)) {
					List<Object> list = new ArrayList<Object>();
					for (String str : thisValues) {
						Object newInstance = Class.forName(getClassForCollectionStyle(str)).newInstance();
						objCache.put(getRealFullname(parent, key), newInstance);
						_toObject(inputValues, getRealFullname(parent, key), str);
						remove(getRealFullname(parent, key));
						list.add(newInstance);
					}
					method.invoke(obj, list);
				} else {
					method.invoke(obj, thisValues);
				}
			} else if (JavaUtils.isStringObjectMap(params.get(getRealFullname(parent, fullname)))) {

				Collection<String> thisValues = (Collection<String>) typeValues.get(fullname);
				if (thisValues == null || thisValues.isEmpty()) {
					continue;
				}

				Method method = obj.getClass().getMethod(thisMethod, Map.class);

				if (thisValues.iterator().next().startsWith(JOINTWARE)) {
					Map<String, Object> list = new HashMap<String, Object>();
					for (String str : thisValues) {
						Object newInstance = Class.forName(getClassForMapStyle(str)).newInstance();
						objCache.put(getRealFullname(parent, key), newInstance);
						_toObject(inputValues, getRealFullname(parent, key), str);
						remove(getRealFullname(parent, key));
						list.put(getKeyForMapStyle(str), newInstance);
					}
					method.invoke(obj, list);
				} else {
					method.invoke(obj, thisValues);
				}

			} else if (JavaUtils.isStringStringMap(params.get(getRealFullname(parent, fullname)))) {

				Map<String, String> thisValues = (Map<String, String>) typeValues.get(fullname);
				if (thisValues == null || thisValues.isEmpty()) {
					continue;
				}

				Method method = obj.getClass().getMethod(thisMethod, Map.class);

				if (thisValues.keySet().iterator().next().startsWith(JOINTWARE)) {
					Map<String, Object> list = new HashMap<String, Object>();
					for (String str : thisValues.keySet()) {
						Object newInstance = Class.forName(getClassForMapStyle(str)).newInstance();
						objCache.put(getRealFullname(parent, key), newInstance);
						_toObject(inputValues, getRealFullname(parent, key), str);
						remove(getRealFullname(parent, key));
						list.put(getKeyForMapStyle(str), newInstance);
					}
					method.invoke(obj, list);
				} else {
					method.invoke(obj, thisValues);
				}

			}
		}
	}

	protected void remove(String removeKey) {
		List<String> keys = new LinkedList<String>();
		for (String key : objCache.keySet()) {
			if (key.startsWith(removeKey)) {
				keys.add(key);
			}
		}

		for (String key : keys) {
			objCache.remove(key);
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
	 * @param parent   parent
	 * @param fullname fullname
	 * @param idx      idx
	 * @return real key
	 */
	protected String getRealKey(String parent, String fullname, int idx) {
		String realKey = (idx == -1) ? fullname : fullname.substring(0, idx);
		return parent.equals(DEFAULT_PARENT) ? realKey : parent + "-" + realKey;
	}

	/**
	 * @param parent   parent
	 * @param fullname fullname
	 * @return real fullname
	 */
	protected String getRealFullname(String parent, String fullname) {
		return (parent.equals(DEFAULT_PARENT)) ? fullname : parent + "-" + fullname;
	}

	/**
	 * @param type     type
	 * @param fullname fullname
	 * @return parent
	 */
	protected String getParent(String type, String fullname) {
		int idx = fullname.lastIndexOf("-");
		return (idx == -1) ? (type.equals("main")) ? DEFAULT_TYPE : fullname : fullname.substring(0, idx);
	}

	/**
	 * @param fullname fullname
	 * @return parent
	 */
	protected String getParent(String fullname) {
		int idx = fullname.lastIndexOf("-");
		return (idx == -1) ? fullname : fullname.substring(0, idx);
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
    * Aliyun的kind与K8s在此处有所不同，因为Aliyun的kind在此处没有toString方法。
    */
   protected Object getKindObject(String kind) {
       try {
           return Class.forName(
                   getModelParameter()
                   .getAllKinds()
                   .get(kind)).newInstance();
       } catch (Exception e) {
           return new Object();
       }
   }

}
