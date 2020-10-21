/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong.cmds;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.github.doslab.wukong.models.CloudControllerModel;
import com.github.doslab.wukong.models.CloudControllerModel.Dependency;
import com.github.doslab.wukong.utils.FileUtils;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2020.2.15
 * 
 **/
public class AdapterGenerator {

	/**
	 * pom
	 */
	public static final String POM       = "/POM";
	
	/**
	 * client
	 */
	public static final String CLIENT    = "/CLIENT";
	
	/**
	 * lib dir
	 */
	protected static final String LIB_DIR = "lib";
	
	/**
	 * target dir
	 */
	protected static final String TARGET_DIR = "target/";
	
	/**
	 * file prefix
	 */
	protected static final String JAR_NAME_PREFIX = "crosscloud-";
	
	/**
	 * file postfix
	 */
	protected static final String JAR_NAME_POSTFIX = "jar-with-dependencies.jar";
	
	/**
	 * pom.xml
	 */
	protected static final String FILE_POM = "pom.xml";
	
	/**
	 * key NAME
	 */
	protected static final String KEY_NAME = "NAME";
	
	/**
	 * key NAME
	 */
	protected static final String KEY_VERSION = "VERSION";
	
	/**
	 * key DEP
	 */
	protected static final String KEY_DEP  = "DEP";
	
	/**
	 * key VALUE
	 */
	protected static final String KEY_VALUE  = "VALUE";
	
	/**
	 * code dir
	 */
	protected static final String CODE_DIR  = "src/main/java/com/github/kubesys/crosscloud";
	
	/**
	 * code name
	 */
	protected static final String CLASS_NAME  = "Client.java";
	
	/**
	 * build command
	 */
	protected static final String CMD_PREFIX  = "/usr/bin/docker run -i --rm -v ";
	
	/**
	 * build command
	 */
	protected static final String CMD_POSTFIX  = ":/usr/src/mymaven -w /usr/src/mymaven maven:3.6.3-jdk-8 mvn clean install -DskipTests";
	
	/**
	 * model
	 */
	protected final CloudControllerModel ccm;
	
	

	/***************************************************************
	 * 
	 *    Constructors
	 * @throws Exception 
	 * @throws JsonProcessingException 
	 * @throws JsonMappingException 
	 * 
	 ***************************************************************/
	
	public AdapterGenerator(CloudControllerModel ccm) {
		this.ccm = ccm;
	}

	/***************************************************************
	 * 
	 *    Core
	 * 
	 ***************************************************************/
	public void exec() throws Exception {
		File rootDir = getRootDir();
		generatePomForMavenProject(rootDir);
		generateCodesForMavenProject(rootDir);
		String os = System.getProperty("os.name");
		if (os.toLowerCase().trim().startsWith("win")) {
			buildMavenProjectLocal(rootDir);
		} else {
			buildMavenProjectUsingDocker(rootDir);
		}
	}

	protected void buildMavenProjectLocal(File rootDir) throws IOException {
		Process p = Runtime.getRuntime().exec("cmd /c cd " + rootDir.getAbsolutePath() + " && mvn clean install");
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void buildMavenProjectUsingDocker(File rootDir) throws Exception {
		File jarFile = new File(rootDir, TARGET_DIR + JAR_NAME_PREFIX
				+ ccm.getKind().toLowerCase() +"-" + ccm.getVersion() + "-" + JAR_NAME_POSTFIX);
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
		String content = FileUtils.read(CLIENT)
				.replace(KEY_VALUE, ccm.getInitClient());
		fw.write(content);
		fw.close();
	}

	protected void generatePomForMavenProject(File rootDir) throws Exception {
		FileWriter fw = new FileWriter(new File(rootDir, FILE_POM));
		String content = FileUtils.read(POM)
				.replace(KEY_NAME, JAR_NAME_PREFIX + ccm.getKind().toLowerCase())
				.replace(KEY_VERSION, ccm.getVersion())
				.replace(KEY_DEP, toDependencies(ccm.getDependency()));
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
	
}
