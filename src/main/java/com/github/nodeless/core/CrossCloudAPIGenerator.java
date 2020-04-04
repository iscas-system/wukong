/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.nodeless.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.github.nodeless.NodelessConstants;
import com.github.nodeless.models.CloudControllerModel;
import com.github.nodeless.models.CloudControllerModel.Dependency;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2020.2.15
 * 
 **/
public class CrossCloudAPIGenerator {

	
	/**
	 * lib dir
	 */
	protected final static String LIB_DIR = "lib";
	
	/**
	 * target dir
	 */
	protected final static String TARGET_DIR = "target/";
	
	/**
	 * file prefix
	 */
	protected final static String JAR_NAME_PREFIX = "wukong-";
	
	/**
	 * file postfix
	 */
	protected final static String JAR_NAME_POSTFIX = "-1.0.0-jar-with-dependencies.jar";
	
	/**
	 * pom.xml
	 */
	protected final static String FILE_POM = "pom.xml";
	
	/**
	 * key NAME
	 */
	protected final static String KEY_NAME = "NAME";
	
	/**
	 * key DEP
	 */
	protected final static String KEY_DEP  = "DEP";
	
	/**
	 * key VALUE
	 */
	protected final static String KEY_VALUE  = "VALUE";
	
	/**
	 * code dir
	 */
	protected final static String CODE_DIR  = "src/main/java/com/github/nodeless";
	
	/**
	 * code name
	 */
	protected final static String CLASS_NAME  = "NodelessClient.java";
	
	/**
	 * build command
	 */
	protected final static String CMD_PREFIX  = "/usr/bin/docker run -i --rm -v ";
	
	/**
	 * build command
	 */
	protected final static String CMD_POSTFIX  = ":/usr/src/mymaven -w /usr/src/mymaven maven:3.6.3-jdk-8 mvn clean install -DskipTests";
	
	

	/**
	 * model
	 */
	protected final CloudControllerModel ccm;
	
	/**
	 * generated API jar
	 */
	protected String jar;

	/***************************************************************
	 * 
	 *    Constructors
	 * 
	 ***************************************************************/
	
	public CrossCloudAPIGenerator(CloudControllerModel ccm) {
		super();
		this.ccm = ccm;
	}

	/***************************************************************
	 * 
	 *    Core
	 * 
	 ***************************************************************/
	public void generateAndBuild() throws Exception {
		File rootDir = getRootDir();
		generatePomForMavenProject(rootDir);
		generateCodesForMavenProject(rootDir);
		buildMavenProjectUsingDocker(rootDir);
	}

	protected void buildMavenProjectUsingDocker(File rootDir) throws Exception {
		File jarFile = new File(rootDir, TARGET_DIR + JAR_NAME_PREFIX
				+ ccm.getKind().toLowerCase() + JAR_NAME_POSTFIX);
		this.jar = "file://" + jarFile.getAbsolutePath();
		if (!jarFile.exists()) {
			String command = CMD_PREFIX + rootDir.getAbsolutePath() + CMD_POSTFIX;
			Process child =Runtime.getRuntime().exec(command);
			doBuldingWithLogs(child);
			checkBuildStatus(jarFile);
		} else {
			System.out.println("build cloud API successfully.");
		}
		
	}

	protected void checkBuildStatus(File jarFile) {
		if (!jarFile.exists()) {
			System.out.println("fail to build cloud API.");
		}
	}

	protected void doBuldingWithLogs(Process child) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(child.getInputStream()));
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}

	protected void generateCodesForMavenProject(File rootDir) throws Exception {
		File pkg = new File(rootDir, CODE_DIR);
		if (!pkg.exists()) {
			pkg.mkdirs();
		}
		
		FileWriter fw = new FileWriter(new File(pkg, CLASS_NAME));
		String content = NodelessConstants.CLIENT.replaceAll(KEY_VALUE, ccm.getInitClient());
		fw.write(content);
		fw.close();
	}

	protected void generatePomForMavenProject(File rootDir) throws Exception {
		FileWriter fw = new FileWriter(new File(rootDir, FILE_POM));
		String content = NodelessConstants.POM.replaceAll(KEY_NAME, JAR_NAME_PREFIX + ccm.getKind().toLowerCase())
				.replaceAll(KEY_DEP, toDependencies(ccm.getDependency()));
		fw.write(content);
		fw.close();
	}

	protected File getRootDir() {
		File rootDir = new File(new File(LIB_DIR),
			JAR_NAME_PREFIX + ccm.getKind().toLowerCase());

		if (!rootDir.exists()) {
			rootDir.mkdirs();
		}
		
		return rootDir;
	}

	protected String toDependencies(List<Dependency> deps) {
		StringBuffer sb = new StringBuffer();
		for (Dependency dep : deps) {
			sb.append("<dependency>\n").append("<groupId>").append(dep.getGroupId()).append("</groupId>\n")
					.append("<artifactId>").append(dep.getArtifactId()).append("</artifactId>\n").append("<version>")
					.append(dep.getVersion()).append("</version>\n").append("</dependency>\n\n");
		}
		return sb.toString();
	}
	
	/***************************************************************
	 * 
	 *    Getter
	 * 
	 ***************************************************************/

	public String getJar() {
		return jar;
	}

}
