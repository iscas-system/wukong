/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong.models;

import java.util.List;
import java.util.Map;


/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2020.2.15
 * 
 **/
public class CloudControllerModel {

	protected String owner;
	
	protected String version = "1.0.0";
	
	protected String kind;
	
	protected String client;
	
	protected String analyzer;
	
	protected String initClient;
	
	protected List<Dependency> dependency;
	
	protected Map<String, String> account;
	
	protected Callback callback;
	
	/***************************************************************
	 * 
	 *    Setter and Getter
	 * 
	 ***************************************************************/
	
	/**
	 * @return               owner
	 */
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
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

	public String getAnalyzer() {
		return analyzer;
	}

	public void setAnalyzer(String analyzer) {
		this.analyzer = analyzer;
	}

	public String getInitClient() {
		return initClient;
	}

	public void setInitClient(String initClient) {
		this.initClient = initClient;
	}

	public List<Dependency> getDependency() {
		return dependency;
	}

	public void setDependency(List<Dependency> dependency) {
		this.dependency = dependency;
	}
	

	public Callback getCallback() {
		return callback;
	}

	public void setCallback(Callback callback) {
		this.callback = callback;
	}
	

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}


	public static class Callback {
		
		protected String item;
		
		protected String key;
		
		protected String request;
		
		protected List<KeyValue> parameters;

		/***************************************************************
		 * 
		 *    Setter and Getter
		 * 
		 ***************************************************************/
		/**
		 * @return           item
		 */
		public String getItem() {
			return item;
		}

		public void setItem(String item) {
			this.item = item;
		}

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getRequest() {
			return request;
		}

		public void setRequest(String request) {
			this.request = request;
		}

		public List<KeyValue> getParameters() {
			return parameters;
		}

		public void setParameters(List<KeyValue> parameters) {
			this.parameters = parameters;
		}

		public static class KeyValue {
			
			protected String key;
			
			protected String value;

			public String getKey() {
				return key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return value;
			}

			public void setValue(String value) {
				this.value = value;
			}
			
		}
		
	}

	public static class Dependency {
		
		protected String groupId;
		
		protected String artifactId;
		
		protected String version;

		/***************************************************************
		 * 
		 *    Setter and Getter
		 * 
		 ***************************************************************/
		/**
		 * @return           groupId
		 */
		public String getGroupId() {
			return groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getArtifactId() {
			return artifactId;
		}

		public void setArtifactId(String artifactId) {
			this.artifactId = artifactId;
		}

		public String getVersion() {
			return version;
		}

		public void setVersion(String version) {
			this.version = version;
		}
		
	}
	
	public Map<String, String> getAccount() {
		return account;
	}

	public void setAccount(Map<String, String> account) {
		this.account = account;
	}

}
