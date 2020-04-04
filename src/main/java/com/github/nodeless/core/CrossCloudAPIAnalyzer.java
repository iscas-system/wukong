/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.nodeless.core;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.nodeless.analyzer.RequestWithObjectPatternAnalyzer;
import com.github.nodeless.models.CloudControllerModel;

/**
 * @author tangting18@otcaix.iscas.ac.cn
 * @author wuheng@otcaix.iscas.ac.cn
 * @since  2020.3.8
 */
public abstract class CrossCloudAPIAnalyzer {

	/**
	 * Method mapper
	 */
	protected final Map<String, String>   methodMappers = new HashMap<String, String>();
	
	/**
	 * parameter mapper
	 */
	protected final Map<String, Class<?>> paramMappers  = new HashMap<String, Class<?>>();
	
	/**
	 * kind
	 */
	protected final String kind;
	
	/**
	 * client instance
	 */
	protected final Class<?> client;
	
	/**
	 * classloader
	 */
	protected final CrossCloudAPIClassLoader loader;
	
	/***************************************************************
	 * 
	 *    Constructors
	 * 
	 ***************************************************************/
	public CrossCloudAPIAnalyzer(String kind, String client, CrossCloudAPIClassLoader loader) throws Exception {
		super();
		this.kind = kind;
		this.loader = loader;
		this.client = loader.loadClass(client);
	}

	/***************************************************************
	 * 
	 *    Core
	 * 
	 ***************************************************************/
	@SuppressWarnings("rawtypes")
	public abstract List extraCloudAPIs();
	
	/***************************************************************
	 * 
	 *    Getters
	 * 
	 ***************************************************************/
	public String getKind() {
		return kind;
	}

	public Class<?> getClient() {
		return client;
	}
	
	public Map<String, Class<?>> getParams() {
		return paramMappers;
	}

	public Map<String, String> getMethods() {
		return methodMappers;
	}
	
	
	/***************************************************************
	 * 
	 *    Utils
	 * 
	 ***************************************************************/
	public static CrossCloudAPIAnalyzer createCrossCloudAPIAnalyzerBy(
			CloudControllerModel ccm, CrossCloudAPIClassLoader loader) throws Exception {
		Class<?> aClass =  loader.loadClass(ccm.getAnalyzer());
		Constructor<?> aCtr = aClass.getConstructor(String.class, String.class, CrossCloudAPIClassLoader.class);
		return (CrossCloudAPIAnalyzer) aCtr.newInstance(ccm.getKind(), ccm.getClient(), loader);
	}
	
	public static void main(String[] args) throws Exception {
		Class<?> aClass =  Class.forName(RequestWithObjectPatternAnalyzer.class.getName());
		for (Constructor<?> c : aClass.getConstructors()) {
			System.out.println(c.getName());
			for (Class<?> clz :  c.getParameterTypes()) {
				System.out.println(clz.getTypeName());
			}
		}
		Constructor<?> aCtr = aClass.getConstructor(String.class, String.class, CrossCloudAPIClassLoader.class);
	}
}
