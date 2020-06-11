/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.pdoslab.wukong.model;

/**
 * @author tangting18@otcaix.iscas.ac.cn
 * @author wuheng@iscas.ac.cn
 * @since  2019.12.19
 */

public class JDKInfo 
{
    protected String group = "cloudplus.io";
    
    protected String version = "v1alpha3";
    
    protected String kind;
    
    protected String client;
    
    protected String blacklist;

	public String getBlacklist() {
		return blacklist;
	}

	public void setBlacklist(String blacklist) {
		this.blacklist = blacklist;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}
    
}
