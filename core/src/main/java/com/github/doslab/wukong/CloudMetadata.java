/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong;

import java.util.List;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2020.10.15
 * 
 **/
public class CloudMetadata {

	/**
	 * kind
	 */
	protected String kind;
	
	/**
	 * version
	 */
	protected String version = "1.2.0";
	
	/**
	 * client
	 */
	protected String client;
	
	/**
	 * initClient
	 */
	protected String initClient;
	
	/**
	 * dependency
	 */
	protected List<Dependency> dependency;
	
	/**
	 * analyzer
	 */
	protected String analyzer = CloudAPIAnalyzer.class.getName();
	
	/***************************************************************
	 * 
	 *    Setter and Getter
	 * 
	 ***************************************************************/
	
	/**
	 * @return                kind
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * @param kind            kind
	 */
	public void setKind(String kind) {
		this.kind = kind;
	}

	/**
	 * @return                client
	 */
	public String getClient() {
		return client;
	}

	/**
	 * @param client          client
	 */
	public void setClient(String client) {
		this.client = client;
	}

	/**
	 * @return               analyzer
	 */
	public String getAnalyzer() {
		return analyzer;
	}

	/**
	 * @param analyzer       analyzer
	 */
	public void setAnalyzer(String analyzer) {
		this.analyzer = analyzer;
	}

	/**
	 * @return              initClient
	 */
	public String getInitClient() {
		return initClient;
	}

	/**
	 * @param initClient   initClient
	 */
	public void setInitClient(String initClient) {
		this.initClient = initClient;
	}

	/**
	 * @return             dependency
	 */
	public List<Dependency> getDependency() {
		return dependency;
	}

	/**
	 * @param dependency   dependency
	 */
	public void setDependency(List<Dependency> dependency) {
		this.dependency = dependency;
	}
	

	/**
	 * @return             version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version       version
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @author wuheng@iscas.ac.cn
	 *
	 */
	public static class Dependency {
		
		/**
		 *  groupId
		 */
		protected String groupId;
		
		/**
		 *  artifactId
		 */
		protected String artifactId;
		
		/**
		 *  version
		 */
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

		/**
		 * @param groupId     groupId
		 */
		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		/**
		 * @return           artifactId
		 */
		public String getArtifactId() {
			return artifactId;
		}

		/**
		 * @param artifactId artifactId
		 */
		public void setArtifactId(String artifactId) {
			this.artifactId = artifactId;
		}

		/**
		 * @return           version
		 */
		public String getVersion() {
			return version;
		}

		/**
		 * @param version    version
		 */
		public void setVersion(String version) {
			this.version = version;
		}
		
	}

}
