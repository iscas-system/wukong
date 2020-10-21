/**
 * Copyrigt (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;


/**
 * @author tangting18@otcaix.iscas.ac.cn
 * @author wuheng@iscas.ac.cn
 * @since 2019.12.10
 */
public class JSONUtils {
	

	public static ObjectNode paramInfo(Method method) throws Exception {
		ObjectNode obj = new ObjectMapper().createObjectNode();
		for (Parameter p : method.getParameters()) {
//			obj.put("_" + p.getName(), objInfo(p.getType()));
			toJSON(obj, p.getType().getName(), "_" + p.getName());
		}
		return obj;
	}
	

	public static ObjectNode objInfo(Class<?> cls) throws Exception {

		ObjectNode obj = new ObjectMapper().createObjectNode();

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


	protected static void toJSON(ObjectNode obj, String type, String key) {
		if (JavaUtils.isPrimitive(type)) {
			if (type.equals(Boolean.class.getName()) || type.equals("boolean")) {
				obj.put(key, true);
			} else if (type.equals(String.class.getName()) || type.equals("String")) {
				obj.put(key, "String");
			} else {
				obj.put(key, 1);
			}
		} else if (JavaUtils.isStringList(type) || JavaUtils.isStringSet(type)) {
			ArrayNode list = new ObjectMapper().createArrayNode();
			list.add(String.class.getSimpleName());
			list.add(String.class.getSimpleName());
			obj.set(key, list);
		} else if (JavaUtils.isStringStringMap(type)) {
			ObjectNode map = new ObjectMapper().createObjectNode();
			map.put(String.class.getName() + "0", String.class.getSimpleName());
			map.put(String.class.getName() + "1", String.class.getSimpleName());
			obj.set(key, map);
		} else if (JavaUtils.isObjectList(type) || JavaUtils.isObjectSet(type)) {

			int sidx = type.indexOf("<");
			int eidx = type.indexOf(">");

			try {
				String newObjClass = type.substring(sidx + 1, eidx);
				ArrayNode list = new ObjectMapper().createArrayNode();
				list.add(objInfo(Class.forName(newObjClass)));
				list.add(objInfo(Class.forName(newObjClass)));
				obj.set(key, list);
			} catch (Exception ex) {
				return;
			}

		} else if (JavaUtils.isStringObjectMap(type)) {

			int sidx = type.indexOf("<");
			int eidx = type.indexOf(",");

			try {
				String newObjClass = type.substring(sidx + 1, eidx);
				ObjectNode map = new ObjectMapper().createObjectNode();
				map.set(String.class.getName() + "0", objInfo(Class.forName(newObjClass)));
				map.set(String.class.getName() + "1", objInfo(Class.forName(newObjClass)));
				obj.set(key, map);
			} catch (Exception ex) {
				return;
			}

		} else {
			
			if (type.contains("java.lang")) {
				return;
			}
			
			try {
				obj.set(key, objInfo(Class.forName(type)));
			} catch (Exception ex) {
				// ignore here
			}
		}
	}

}
