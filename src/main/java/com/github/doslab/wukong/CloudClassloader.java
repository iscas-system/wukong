/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @since  2020.10.29
 */
public class CloudClassloader extends URLClassLoader {

	/**
	 * root dir
	 */
	protected final File rootDir;
	
	/***************************************************************
	 * 
	 * Constructors
	 * 
	 ***************************************************************/

	/**
	 * @param ccm                        ccm
	 */
	public CloudClassloader(CloudMetadata ccm) {
		super(toURLs(getUrl(ccm)));
		this.rootDir = getParent(ccm);
	}

	/**
	 * @param ccm                        ccm
	 * @return                           url               
	 */
	public static String getUrl(CloudMetadata ccm) {
		File jarFile = new File(getParent(ccm), CloudConstants.TARGET_DIR + 
				CloudConstants.JAR_NAME_PREFIX + ccm.getKind().toLowerCase() + "-"
				+ ccm.getVersion() + "-" + CloudConstants.JAR_NAME_POSTFIX);
		return "file:" + jarFile.getAbsolutePath();
	}

	/**
	 * @param url                        url
	 * @return                           urls
	 */
	protected static URL[] toURLs(String url) {
		try {
			URL[] urls = new URL[1];
			urls[0] = new URL(url);
			return urls;
		} catch (Exception ex) {
			return null;
		}
	}

	/**
	 * @param ccm                         ccm
	 * @return                            parent
	 */
	public static File getParent(CloudMetadata ccm) {
		
		File rootDir = new File(new File(CloudConstants.LIB_DIR), 
				CloudConstants.JAR_NAME_PREFIX + ccm.getKind().toLowerCase());

		if (!rootDir.exists()) {
			rootDir.mkdirs();
		}

		return rootDir;
	}
	
	/**
	 * @return                            root dir
	 */
	public File getRootDir() {
		return rootDir;
	}


}
