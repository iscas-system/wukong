/**
 * Copyrigt (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.nodeless.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;


/**
 * @author tangting18@otcaix.iscas.ac.cn
 * @author wuheng@iscas.ac.cn
 * @since 2019.12.10
 */
public class JSONUtils {
	

	public static JSONObject paramInfo(Method method) throws Exception {
		JSONObject obj = new JSONObject();
		for (Parameter p : method.getParameters()) {
//			obj.put("_" + p.getName(), objInfo(p.getType()));
			toJSON(obj, p.getType().getName(), "_" + p.getName());
		}
		return obj;
	}
	

	public static JSONObject objInfo(Class<?> cls) throws Exception {

		JSONObject obj = new JSONObject();

		for (Field field : cls.getDeclaredFields()) {

			if ((!Modifier.isPrivate(field.getModifiers()) && !Modifier.isProtected(field.getModifiers()))
					|| Modifier.isFinal(field.getModifiers()) || Modifier.isStatic(field.getModifiers())) {
				continue;
			}

			String type = field.getType().getTypeName();
			String key = field.getName();

			toJSON(obj, type, key);
		}

		return obj;
	}


	protected static void toJSON(JSONObject obj, String type, String key) {
		if (JavaUtils.isPrimitive(type)) {
			if (type.equals(Boolean.class.getName()) || type.equals("boolean")) {
				obj.put(key, true);
			} else if (type.equals(String.class.getName()) || type.equals("String")) {
				obj.put(key, "String");
			} else {
				obj.put(key, 1);
			}
		} else if (JavaUtils.isStringList(type) || JavaUtils.isStringSet(type)) {
			List<String> list = new ArrayList<String>();
			list.add(String.class.getSimpleName());
			list.add(String.class.getSimpleName());
			obj.put(key, list);
		} else if (JavaUtils.isStringStringMap(type)) {
			Map<String, String> map = new HashMap<String, String>();
			map.put(String.class.getName() + "0", String.class.getSimpleName());
			map.put(String.class.getName() + "1", String.class.getSimpleName());
			obj.put(key, map);
		} else if (JavaUtils.isObjectList(type) || JavaUtils.isObjectSet(type)) {

			int sidx = type.indexOf("<");
			int eidx = type.indexOf(">");

			try {
				String newObjClass = type.substring(sidx + 1, eidx);
				List<Object> list = new ArrayList<Object>();
				list.add(objInfo(Class.forName(newObjClass)));
				list.add(objInfo(Class.forName(newObjClass)));
				obj.put(key, list);
			} catch (Exception ex) {
				return;
			}

		} else if (JavaUtils.isStringObjectMap(type)) {

			int sidx = type.indexOf("<");
			int eidx = type.indexOf(",");

			try {
				String newObjClass = type.substring(sidx + 1, eidx);
				Map<String, Object> map = new HashMap<String, Object>();
				map.put(String.class.getName() + "0", objInfo(Class.forName(newObjClass)));
				map.put(String.class.getName() + "1", objInfo(Class.forName(newObjClass)));
				obj.put(key, map);
			} catch (Exception ex) {
				return;
			}

		} else {
			
			if (type.contains("java.lang")) {
				return;
			}
			
			try {
				obj.put(key, objInfo(Class.forName(type)));
			} catch (Exception ex) {
				// ignore here
			}
		}
	}

}
