/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package io.github.cloudpluslab.wukong;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author tangting18@otcaix.iscas.ac.cn
 * @author wuheng@otcaix.iscas.ac.cn
 * @since  2020.3.8
 */
public abstract class Analyzer {

	protected final Map<String, String> infos = new HashMap<String, String>();
	
	protected final String kind;
	
	protected final Class<?> client;
	
	public Analyzer(String kind, Class<?> client) {
		super();
		this.kind = kind;
		this.client = client;
	}

	public String getKind() {
		return kind;
	}

	public Class<?> getClient() {
		return client;
	}

	@SuppressWarnings("rawtypes")
	public abstract List getRegisterInfos();
	
	public Map<String, String> useRegisterInfos() {
		return infos;
	}
	
}
