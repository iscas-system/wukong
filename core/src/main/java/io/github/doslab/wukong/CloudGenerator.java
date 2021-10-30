/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.doslab.wukong;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.logging.Logger;

import io.github.doslab.wukong.CloudMetadata.Dependency;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2020.10.29
 * 
 **/
public class CloudGenerator {

	
	/**
	 * m_logger
	 */
	protected static final Logger m_logger = Logger.getLogger(CloudGenerator.class.getName());
	
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
	 * @param ccm                     ccm
	 * @param loader                  loader
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
	 * @throws Exception             exception
	 */
	public void generateJar() throws Exception {
		File rootDir = this.loader.getRootDir();
		generatePom(rootDir);
		generateCodes(rootDir);
		buildCodes(rootDir);
	}

	/**
	 * @param rootDir                rootDir
	 * @throws Exception             exception
	 */
	protected void generatePom(File rootDir) throws Exception {
		File file = new File(rootDir, CloudConstants.FILE_POM);
		String content = read(CloudGenerator.class.getResourceAsStream(CloudConstants.POM))
				.replace(CloudConstants.KEY_NAME, CloudConstants.JAR_NAME_PREFIX + ccm.getKind().toLowerCase())
				.replace(CloudConstants.KEY_VERSION, ccm.getVersion())
				.replace(CloudConstants.KEY_DEP, toDependencies(ccm.getDependencies()));
		
		write(file, content);
	}
	
	/**
	 * @param rootDir                rootDir
	 * @throws Exception             exception
	 */
	protected void generateCodes(File rootDir) throws Exception {
		
		File pkg = new File(rootDir, CloudConstants.CODE_DIR);
		if (!pkg.exists()) {
			pkg.mkdirs();
		}
		
		File file = new File(pkg, CloudConstants.CLASS_NAME);
		String content = read(CloudGenerator.class.getResourceAsStream(CloudConstants.CLIENT))
				.replace(CloudConstants.KEY_VALUE, ccm.getInitClient());
		
		write(file, content);
	}
	
	/**
	 * @param rootDir                rootDir
	 * @throws Exception             exception
	 */
	protected void buildCodes(File rootDir) throws Exception {
		String os = System.getProperty("os.name");
		if (os.toLowerCase().trim().startsWith("win")) {
			buildWinLocal(rootDir);
		} else {
			builUNIXLocal(rootDir);
		}
	}

	/**
	 * @param rootDir                rootDir
	 * @throws Exception             exception
	 */
	protected void buildWinLocal(File rootDir) throws Exception {
		String cmd = "cmd /c cd " + rootDir.getAbsolutePath() + " && mvn clean install";
		m_logger.info(cmd);
		Process p = Runtime.getRuntime().exec(cmd);
		print(p.getInputStream());
		print(p.getErrorStream());
	}
	
	/**
	 * @param rootDir                rootDir
	 * @throws Exception             exception
	 */
	protected void builUNIXLocal(File rootDir) throws Exception {
		String cmd = "bash /usr/bin/build.sh " + rootDir.getAbsolutePath();
		m_logger.info(cmd);
		Process p = Runtime.getRuntime().exec(cmd);
		print(p.getInputStream());
		print(p.getErrorStream());
	}

	protected String toDependencies(List<Dependency> deps) {
		StringBuilder sb = new StringBuilder();
		for (Dependency dep : deps) {
			sb.append("<dependency>\n").append("<groupId>").append(dep.getGroupId()).append("</groupId>\n")
					.append("<artifactId>").append(dep.getArtifactId()).append("</artifactId>\n").append("<version>")
					.append(dep.getVersion()).append("</version>\n").append("</dependency>\n\n");
		}
		return sb.toString();
	}

	/**************************************************
	 * 
	 *               utils
	 * 
	 **************************************************/
	/**
	 * @param is                     is
	 */
	public static void print(InputStream is) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String line = null;
			while ((line = br.readLine()) != null) {
				m_logger.info(line);
			}
		} catch (Exception e) {
			m_logger.severe(e.toString());
		}
	}
	
	/**
	 * @param is                    is
	 * @return                      string
	 * @throws Exception            exception
	 */
	public static String read(InputStream is) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String line = null;
		while ((line = br.readLine()) != null) {
			sb.append(line).append("\n");
		}
		br.close();
		return sb.toString();
	}
	
	
	/**
	 * @param file                  file
	 * @param content               content 
	 * @throws Exception            exception
	 */
	public static void write(File file, String content) throws Exception {
		FileWriter fw = new FileWriter(file);
		fw.write(content);
		fw.close();
	}

}
