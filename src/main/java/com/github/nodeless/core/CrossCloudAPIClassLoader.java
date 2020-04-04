/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.nodeless.core;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2020.2.15
 * 
 **/
public class CrossCloudAPIClassLoader extends URLClassLoader {

	/***************************************************************
	 * 
	 *    Constructors
	 * 
	 ***************************************************************/
	public CrossCloudAPIClassLoader(String url) {
		super(toURLs(url));
	}
	
	/***************************************************************
	 * 
	 *    Utils
	 * 
	 ***************************************************************/
	protected static URL[] toURLs(String url) {
		try {
			URL[] urls = new URL[1];
			urls[0] = new URL(url);
			return urls;
		} catch (Exception ex) {
			return null;
		}
	}
	
}
