/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong.analyzer;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.doslab.wukong.models.CloudMetadataModel;


/**
 * @author tangting18@otcaix.iscas.ac.cn
 * @author wuheng@otcaix.iscas.ac.cn
 * @since  2020.3.8
 */
public abstract class CrossCloudAPIAnalyzer {

	/**
	 * target dir
	 */
	protected static final String TARGET_DIR = "target/";
	
	/**
	 * lib dir
	 */
	protected static final String LIB_DIR = "lib";
	
	/**
	 * file prefix
	 */
	protected static final String JAR_NAME_PREFIX = "crosscloud-";
	
	/**
	 * file postfix
	 */
	protected static final String JAR_NAME_POSTFIX = "jar-with-dependencies.jar";
	
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
	
	/**
	 * @param kind                      kind
	 * @param client                    client
	 * @throws Exception                exception
	 */
	public CrossCloudAPIAnalyzer(String kind, String client) throws Exception {
		this(kind, client, CrossCloudAPIAnalyzer.class.getClassLoader());
	}
	
	public CrossCloudAPIAnalyzer(CloudMetadataModel ccm) throws Exception {
		this(ccm.getKind(), ccm.getClient(), new URLClassLoader(toURLs(getUrl(ccm))));
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
	/**
	 * @return                 list
	 */ 
	public abstract List<Object> extraCloudAPIs();
	
	protected static String getUrl(CloudMetadataModel ccm) {
		File jarFile = new File(getRootDir(ccm), TARGET_DIR + JAR_NAME_PREFIX 
				+ ccm.getKind().toLowerCase() + "-"
				+ ccm.getVersion() + "-" + JAR_NAME_POSTFIX);
		return "file:" + jarFile.getAbsolutePath();
	}
	
	protected static URL[] toURLs(String url) {
		try {
			URL[] urls = new URL[1];
			urls[0] = new URL(url);
			return urls;
		} catch (Exception ex) {
			return null;
		}
	}
	
	public static File getRootDir(CloudMetadataModel ccm) {
		File rootDir = new File(new File(LIB_DIR),
			JAR_NAME_PREFIX + ccm.getKind().toLowerCase());

		if (!rootDir.exists()) {
			rootDir.mkdirs();
		}
		
		return rootDir;
	}
	/***************************************************************
	 * 
	 *    Getters
	 * 
	 ***************************************************************/
	/**
	 * @return               kind
	 */
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
	
}
