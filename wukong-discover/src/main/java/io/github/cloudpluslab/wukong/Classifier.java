/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package io.github.cloudpluslab.wukong;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @author tangting18@otcaix.iscas.ac.cn
 * @author wuheng@otcaix.iscas.ac.cn
 * @since  2020.3.8
 */
public class Classifier {

//	public final static String CONFIG = "conf/jdkinfo.conf-aliyunecs";
	
//	public final static String CONFIG = "conf/jdkinfo.conf-amazonec2";
	
//	public final static String CONFIG = "conf/jdkinfo.conf-baiduvm";
	
//	public final static String CONFIG = "conf/jdkinfo.conf-tencentVM";
	
	public final static String CONFIG = "conf/jdkinfo.conf-JDVM";
	
	public static void main(String[] args) throws Exception {
		JSONObject jo = JSON.parseObject(new FileInputStream(new File(CONFIG)), JSONObject.class);
		
		try {
			Class<?> aClass =  Class.forName(jo.getString("analyzer"));
			Constructor<?> aCtr = aClass.getConstructor(String.class, Class.class);
			Analyzer analyzer = (Analyzer) aCtr.newInstance(jo.getString("kind")
									, Class.forName(jo.getString("client")));
			analyzer.getLifecycles();
		} catch (Exception ex) {
			ex.printStackTrace();
			return;
		}
	}

}
