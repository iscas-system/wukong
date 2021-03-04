/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 
 * @author tangting18@otcaix.iscas.ac.cn
 * @since 2019.12.10
 * 
 * This code comes from Internet, it works well in our case.
 */
public class FileUtils {

	public static BufferedReader read(String file) throws Exception {
		return new BufferedReader(new FileReader(new File(file)));
	}

	public static void write(File file, String content) throws Exception {
		FileWriter fw = new FileWriter(file);
		fw.write(content);
		fw.close();
	}
	
}
