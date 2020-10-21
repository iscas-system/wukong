/**
 * Copyrigt (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;


/**
 * @author wuheng@iscas.ac.cn
 * @since  2019.12.19
 * 
 */

public class FileUtils {
	
	public static String read(String filename) throws Exception {
		return read(FileUtils.class.getResourceAsStream(filename));
	}

	public static String read(InputStream fis) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		while ((line = br.readLine()) != null) {
			sb.append(line).append("\n");
		}
		br.close();
		return sb.toString();
	}
}
