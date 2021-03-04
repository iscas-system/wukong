/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.github.doslab.wukong.utils.SQLUtils;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2021.2.15
 * 
 **/
public abstract class AbstractAnalyzer {

	protected final PreparedStatement ps;
	
	public AbstractAnalyzer() throws Exception {
		this.ps = createStatement(SQLUtils.createConn());
	}

	public PreparedStatement createStatement(Connection conn) throws Exception {
		return conn.prepareStatement(sql());
	}
	
	public abstract String sql(); 
	
	public abstract void analyse() throws Exception;
}
