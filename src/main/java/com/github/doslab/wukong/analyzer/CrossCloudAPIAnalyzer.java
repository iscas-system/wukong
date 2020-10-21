/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong.analyzer;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
	protected final ClassLoader loader;
	
	/***************************************************************
	 * 
	 *    Constructors
	 * 
	 ***************************************************************/
	
	public CrossCloudAPIAnalyzer(String kind, String client) throws Exception {
		this(kind, client, CrossCloudAPIAnalyzer.class.getClassLoader());
	}
	
	public CrossCloudAPIAnalyzer(String kind, String client, ClassLoader loader) throws Exception {
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
	
	public static void main(String[] args) throws Exception {
		Class<?> aClass =  Class.forName(RequestWithObjectPatternAnalyzer.class.getName());
		for (Constructor<?> c : aClass.getConstructors()) {
			System.out.println(c.getName());
			for (Class<?> clz :  c.getParameterTypes()) {
				System.out.println(clz.getTypeName());
			}
		}
	}
}
