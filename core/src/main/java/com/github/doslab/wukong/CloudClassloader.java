/**
 * Copyright (2021, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @author wuheng@iscas.ac.cn
 * @since  2021.10.30
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
		
		String dir = System.getenv("rootDir") == null ?
				new File(CloudConstants.LIB_DIR).getPath()
				: System.getenv("rootDir");
		
		File rootDir = new File(dir, 
				CloudConstants.JAR_NAME_PREFIX + 
				ccm.getKind().toLowerCase() + "-" + 
				ccm.getVersion());

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
