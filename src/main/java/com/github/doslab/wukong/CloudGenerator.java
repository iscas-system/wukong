/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import com.github.doslab.wukong.CloudMetadata.Dependency;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2020.10.29
 * 
 **/
public class CloudGenerator {

	
	/**
	 * model
	 */
	protected final CloudMetadata ccm;
	
	/**
	 * classloader
	 */
	protected final CloudClassloader loader;

	/***************************************************************
	 * 
	 *    Constructors
	 * @throws Exception 
	 * @throws JsonProcessingException 
	 * @throws JsonMappingException 
	 * 
	 ***************************************************************/
	
	/**
	 * @param ccm                    ccm
	 */
	public CloudGenerator(CloudMetadata ccm, CloudClassloader loader) {
		this.ccm = ccm;
		this.loader = loader;
	}

	/***************************************************************
	 * 
	 *    Core
	 * 
	 ***************************************************************/
	/**
	 * @throws Exception           exception
	 */
	public void exec() throws Exception {
		File rootDir = this.loader.getRootDir();
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
		File jarFile = new File(rootDir, CloudConstants.TARGET_DIR + CloudConstants.JAR_NAME_PREFIX
				+ ccm.getKind().toLowerCase() +"-" + ccm.getVersion() + "-" + CloudConstants.JAR_NAME_POSTFIX);
		if (!jarFile.exists()) {
			String command = CloudConstants.CMD_PREFIX + rootDir.getAbsolutePath() + CloudConstants.CMD_POSTFIX;
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
		File pkg = new File(rootDir, CloudConstants.CODE_DIR);
		if (!pkg.exists()) {
			pkg.mkdirs();
		}
		
		FileWriter fw = new FileWriter(new File(pkg, CloudConstants.CLASS_NAME));
		String content = read(CloudConstants.CLIENT)
				.replace(CloudConstants.KEY_VALUE, ccm.getInitClient());
		fw.write(content);
		fw.close();
	}

	protected void generatePomForMavenProject(File rootDir) throws Exception {
		FileWriter fw = new FileWriter(new File(rootDir, CloudConstants.FILE_POM));
		String content = read(CloudConstants.POM)
				.replace(CloudConstants.KEY_NAME, CloudConstants.JAR_NAME_PREFIX + ccm.getKind().toLowerCase())
				.replace(CloudConstants.KEY_VERSION, ccm.getVersion())
				.replace(CloudConstants.KEY_DEP, toDependencies(ccm.getDependency()));
		fw.write(content);
		fw.close();
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
	
	public static String read(String filename) throws Exception {
		return read(CloudGenerator.class.getResourceAsStream(filename));
	}

	public static String read(InputStream fis) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		while ((line = br.readLine()) != null) {
			sb.append(line).append("\n");
		}
		br.close();
		return sb.toString();
	}
}
