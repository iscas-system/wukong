/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong.utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 
 * @author tangting18@otcaix.iscas.ac.cn
 * @since 2019.12.10
 * 
 * This code comes from Internet, it works well in our case.
 */
public class SQLUtils {

	@SuppressWarnings("deprecation")
	public static Connection createConn() throws Exception {
		Class.forName("org.postgresql.Driver").newInstance();
		String url = System.getenv("jdbc") != null ? System.getenv("jdbc") 
					: "jdbc:postgresql://124.70.64.232:30306/knowledge";
		return DriverManager.getConnection(url, "postgres", 
					System.getenv("password") == null ? 
						"onceas" : System.getenv("password"));
	}
	
}
