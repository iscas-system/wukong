/**
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.wukong.core.anas;

import java.io.File;
import java.io.IOException;
import java.net.JarURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @since 2019/5/6
 * 
 * This code comes from Internet
 */
public class ClassesInPackageAnalyzer {

	private static final String CLASS_SUFFIX = ".class";
	
	private static final String CLASS_FILE_PREFIX = File.separator + "classes" + File.separator;
	
	private static final String PACKAGE_SEPARATOR = ".";

	public static List<String> getAllClasses(String packageName, boolean showChildPackageFlag) {
		List<String> result = new ArrayList<String>();
		String suffixPath = packageName.replaceAll("\\.", "/");
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		try {
			Enumeration<URL> urls = loader.getResources(suffixPath);
			while (urls.hasMoreElements()) {
				URL url = urls.nextElement();
				if (url != null) {
					String protocol = url.getProtocol();
					if ("file".equals(protocol)) {
						String path = url.getPath();
						System.out.println(path);
						result.addAll(getAllClassNameByFile(new File(path), showChildPackageFlag));
					} else if ("jar".equals(protocol)) {
						JarFile jarFile = null;
						try {
							jarFile = ((JarURLConnection) url.openConnection()).getJarFile();
						} catch (Exception e) {
							e.printStackTrace();
						}
						if (jarFile != null) {
							result.addAll(getAllClassNameByJar(jarFile, packageName, showChildPackageFlag));
						}
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	private static List<String> getAllClassNameByFile(File file, boolean showChildPackageFlag) {
		List<String> result = new ArrayList<String>();
		if (!file.exists()) {
			return result;
		}
		if (file.isFile()) {
			String path = file.getPath();
			// 注意：这里替换文件分割符要用replace。因为replaceAll里面的参数是正则表达式,而windows环境中File.separator="\\"的,因此会有问题
			if (path.endsWith(CLASS_SUFFIX)) {
				path = path.replace(CLASS_SUFFIX, "");
				// 从"/classes/"后面开始截取
				String clazzName = path.substring(path.indexOf(CLASS_FILE_PREFIX) + CLASS_FILE_PREFIX.length())
						.replace(File.separator, PACKAGE_SEPARATOR);
				if (-1 == clazzName.indexOf("$")) {
					result.add(clazzName);
				}
			}
			return result;
		} else {
			File[] listFiles = file.listFiles();
			if (listFiles != null && listFiles.length > 0) {
				for (File f : listFiles) {
					if (showChildPackageFlag) {
						result.addAll(getAllClassNameByFile(f, showChildPackageFlag));
					} else {
						if (f.isFile()) {
							String path = f.getPath();
							if (path.endsWith(CLASS_SUFFIX)) {
								path = path.replace(CLASS_SUFFIX, "");
								// 从"/classes/"后面开始截取
								String clazzName = path
										.substring(path.indexOf(CLASS_FILE_PREFIX) + CLASS_FILE_PREFIX.length())
										.replace(File.separator, PACKAGE_SEPARATOR);
								if (-1 == clazzName.indexOf("$")) {
									result.add(clazzName);
								}
							}
						}
					}
				}
			}
			return result;
		}
	}

	private static List<String> getAllClassNameByJar(JarFile jarFile, String packageName, boolean showChildPackageFlag) {
		List<String> result = new ArrayList<String>();
		Enumeration<JarEntry> entries = jarFile.entries();
		while (entries.hasMoreElements()) {
			JarEntry jarEntry = entries.nextElement();
			String name = jarEntry.getName();
			// 判断是不是class文件
			if (name.endsWith(CLASS_SUFFIX)) {
				name = name.replace(CLASS_SUFFIX, "").replace("/", ".");
				if (showChildPackageFlag) {
					// 如果要子包的文件,那么就只要开头相同且不是内部类就ok
					if (name.startsWith(packageName) && -1 == name.indexOf("$")) {
						result.add(name);
					}
				} else {
					// 如果不要子包的文件,那么就必须保证最后一个"."之前的字符串和包名一样且不是内部类
					if (packageName.equals(name.substring(0, name.lastIndexOf("."))) && -1 == name.indexOf("$")) {
						result.add(name);
					}
				}
			}
		}
		return result;
	}

}
