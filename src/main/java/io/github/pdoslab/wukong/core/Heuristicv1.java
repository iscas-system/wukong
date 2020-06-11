/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package io.github.pdoslab.wukong.core;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aliyuncs.AcsRequest;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.amazonaws.services.ec2.model.CreateClientVpnEndpointRequest;
import com.amazonaws.services.ec2.model.CreateClientVpnEndpointResult;

import io.github.pdoslab.wukong.model.JDKInfo;
import io.github.pdoslab.wukong.utils.ClassUtils;
import io.github.pdoslab.wukong.utils.JSONUtils;
import io.github.pdoslab.wukong.utils.JavaUtils;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * @author tangting18@otcaix.iscas.ac.cn
 * @author wuheng@iscas.ac.cn
 * @since 2019.12.10
 */
public class Heuristicv1 {
	
	
	private Heuristicv1() {
		
	}

	/*************************************************************
	 * 
	 * Find JSONs
	 * 
	 *************************************************************/

	public static List<String> findObjectJSON(JDKInfo info, Method[] methods) throws Exception {
		List<String> json = new ArrayList<>();
		// Aliyun: public <T extends AcsResponse> T getAcsResponse(AcsRequest<T> request) throws ServerException, ClientException {
		json.addAll(findGenericStyleObjectJSON(info, methods));
		// Amazon:  public CreateClientVpnEndpointResult createClientVpnEndpoint(CreateClientVpnEndpointRequest request) {
		json.addAll(findDirectStyleObjectJSON(info, methods));
		// Azure: ComputeManagementClientImpl.virtualMachineScaleSetRollingUpgradesInner();
		//        VirtualMachineScaleSetRollingUpgradesInner. beginStartOSUpgrade(String resourceGroupName, String vmScaleSetName, String subscriptionId);
		json.addAll(findPostCatalogStyleObjectJSON(info, methods));
		//
		json.addAll(findPreCatalogStyleObjectJSON(info, methods));
		return json;
	}

	protected static List<String> findGenericStyleObjectJSON(JDKInfo info, Method[] methods) throws Exception {
		String superclass = getGenericStyleSuperclass(methods);
		return superclass == null ? new ArrayList<>()
				: getGenericStyleJSON(info.getKind(), superclass, ClassUtils.scan(getPackage(superclass)));
	}

	protected static List<String> findDirectStyleObjectJSON(JDKInfo info, Method[] methods) throws Exception {
		String superclass = getDirectStyleSuperclass(methods);
		return superclass == null ? new ArrayList<>() 
				: getDirectStyleJSON(info.getKind(), superclass, methods);
	}
	
	protected static List<String> findPostCatalogStyleObjectJSON(JDKInfo info, Method[] methods) throws Exception {
		String superclass = getPostCatalogStyleSuperclass(methods);
		return superclass == null ? new ArrayList<>() 
				: getPostCatalogStyleJSON(info.getKind(), superclass, methods);
	}
	
	protected static List<String> findPreCatalogStyleObjectJSON(JDKInfo info, Method[] methods) throws Exception {
		try {
		String superclass = getPreCatalogStyleSuperclass(methods);
		return superclass == null ? new ArrayList<>() 
				: getPreCatalogStyleJSON(info.getKind(), superclass, methods);
		} catch (Exception ex) {
			return new ArrayList<>();
		}
	}
	

	/*************************************************************
	 *
	 * Generic Style
	 * 
	 *************************************************************/

	protected static String getGenericStyleSuperclass(Method[] methods) {
		for (Method method : methods) {
			if (method.getParameterCount() == 1 && method
					.getGenericParameterTypes()[0].getTypeName().contains("<")) {
				return method.getParameterTypes()[0].getName();
			}
		}
		return null;
	}

	private static List<String> getGenericStyleJSON(String kind, String superclass, List<Class<?>> classes)
			throws Exception {

		List<String> targetObjects = new ArrayList<>();
		for (Class<?> targetClass : getGenericStyleClasses(superclass, classes)) {
			targetObjects.add(JSONUtils.objInfo(kind, targetClass));
		}

		return targetObjects;
	}

	private static List<Class<?>> getGenericStyleClasses(String superclass, List<Class<?>> classes) {
		List<Class<?>> targetClasses = new ArrayList<>();
		for (Class<?> clz : classes) {
			String typename = Modifier.isAbstract(clz.getSuperclass().getModifiers())
					? (clz.getSuperclass().getSuperclass() == null ? null
							: clz.getSuperclass().getSuperclass().getName())
					: clz.getSuperclass().getName();
			if (superclass.equals(typename)) {
				targetClasses.add(clz);
			}
		}
		return targetClasses;
	}

	/*************************************************************
	 *
	 * Direct Style
	 * 
	 *************************************************************/

	private static String getDirectStyleSuperclass(Method[] methods) {
		int max = 0;
		String superclass = null;
		Map<String, Integer> cached = new HashMap<String, Integer>();
		for (Method method : methods) {
			if (method.getParameterCount() == 1 && !method.getParameterTypes()[0].isInterface() 
					&& !JavaUtils.isBasic(method.getParameterTypes()[0].getName())) {
				String typeName = method.getParameterTypes()[0].getSuperclass().getName();
				Integer itr = cached.get(typeName);
				itr = (itr == null) ? 1 : itr + 1;
				cached.put(typeName, itr);
				superclass = (itr > max) ? typeName : superclass;
				max = (itr > max) ? itr : max;
			}
		}
		return superclass;
	}
	
	private static List<String> getDirectStyleJSON(String kind, String superclass, Method[] methods) throws Exception {
		List<String> targetObjects = new ArrayList<String>();
		for (Class<?> targetClass : getDirectStyleClasses(superclass, methods)) {
			targetObjects.add(JSONUtils.objInfo(kind, targetClass));
		}
		return targetObjects;

	}

	private static List<Class<?>> getDirectStyleClasses(String superclass, Method[] methods) {
		List<Class<?>> targetClasses = new ArrayList<Class<?>>();
		for (Method method : methods) {
			if (method.getParameterCount() == 1 && !JavaUtils.isBasic(method.getParameterTypes()[0].getName()) 
					&& !method.isAnnotationPresent(Deprecated.class) && !method.getParameterTypes()[0].isInterface()
					&& superclass.equals(method.getParameterTypes()[0].getSuperclass().getName())) {
				targetClasses.add(method.getParameterTypes()[0]);
			}
		}
		return targetClasses;
	}
	
	/*************************************************************
	 *
	 * PostCatalog Style
	 * 
	 *************************************************************/

	private static String getPostCatalogStyleSuperclass(Method[] methods) {
		int max = 0;
		String superclass = null;
		Map<String, Integer> cached = new HashMap<String, Integer>();
		for (Method m1 : methods) {
			try {
				for (Method m2 : m1.getReturnType().getDeclaredMethods()) {
					if (!m2.getReturnType().isInterface() 
							&& !JavaUtils.isBasic(m2.getReturnType())
							&& !m2.getReturnType().getName().equals("void")) {
						String typeName = m2.getReturnType().getName();
						Integer itr = cached.get(typeName);
						itr = (itr == null) ? 1 : itr + 1;
						cached.put(typeName, itr);
						superclass = (itr > max) ? typeName : superclass;
						max = (itr > max) ? itr : max;
					}
				} 
			} catch (Exception ex) {
				// ignore here
			}
		}
		return (cached.get(superclass) < 20) ?  null : superclass;
	}
	
	private static List<String> getPostCatalogStyleJSON(String kind, String superclass, Method[] methods) throws Exception {
		List<String> targetObjects = new ArrayList<String>();
		for (Method targetMethod : getPostCatalogStyleClasses(superclass, methods)) {
			targetObjects.add(JSONUtils.paramInfo(kind, targetMethod));
		}
		return targetObjects;

	}

	private static List<Method> getPostCatalogStyleClasses(String superclass, Method[] methods) {
		List<Method> targetClasses = new ArrayList<Method>();
		for (Method m1 : methods) {
			for (Method m2 : m1.getReturnType().getDeclaredMethods()) {
				if (m2.getReturnType().getName().equals(superclass)) {
					targetClasses.add(m2);
				}
			}
		}
		return targetClasses;
	}
	
	/*************************************************************
	 *
	 * PreCatalog Style
	 * 
	 *************************************************************/

	private static String getPreCatalogStyleSuperclass(Method[] methods) {
		int max = 0;
		String superclass = null;
		Map<String, Integer> cached = new HashMap<String, Integer>();
		for (Method m1 : methods) {
			try {
				for (Method m2 : m1.getReturnType().getDeclaredMethods()) {
					if (!m2.getReturnType().isInterface() 
							&& !JavaUtils.isBasic(m2.getReturnType())
							&& !m2.getReturnType().getName().equals("void")) {
						String typeName = m2.getReturnType().getSuperclass().getName();
						Integer itr = cached.get(typeName);
						itr = (itr == null) ? 1 : itr + 1;
						cached.put(typeName, itr);
						superclass = (itr > max) ? typeName : superclass;
						max = (itr > max) ? itr : max;
					}
				} 
			} catch (Exception ex) {
				// ignore here
			}
		}
		return (cached.get(superclass) < 20) ?  null : superclass;
	}
	
	private static List<String> getPreCatalogStyleJSON(String kind, String superclass, Method[] methods) throws Exception {
		List<String> targetObjects = new ArrayList<>();
		for (Method targetMethod : getPreCatalogStyleClasses(superclass, methods)) {
			targetObjects.add(JSONUtils.paramInfo(kind, targetMethod));
		}
		return targetObjects;

	}

	private static List<Method> getPreCatalogStyleClasses(String superclass, Method[] methods) {
		List<Method> targetClasses = new ArrayList<>();
		for (Method m1 : methods) {
			for (Method m2 : m1.getReturnType().getDeclaredMethods()) {
				if (m2.getReturnType().getSuperclass().getName().equals(superclass)) {
					targetClasses.add(m2);
				}
			}
		}
		return targetClasses;
	}
	
	private static String getPackage(String fullname) {
		int pos = fullname.lastIndexOf(".");
		return fullname.substring(0, pos);
	}
}
