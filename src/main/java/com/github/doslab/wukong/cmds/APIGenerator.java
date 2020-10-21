/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong.cmds;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.github.doslab.wukong.analyzer.CrossCloudAPIAnalyzer;
import com.github.doslab.wukong.analyzer.RequestWithObjectPatternAnalyzer;
import com.github.doslab.wukong.models.ClassToMethodModel;
import com.github.doslab.wukong.models.CloudControllerModel;
import com.github.doslab.wukong.models.CloudControllerModel.Dependency;
import com.github.doslab.wukong.utils.JSONUtils;

/**
 * @author tangting18@otcaix.iscas.ac.cn
 * @author wuheng@otcaix.iscas.ac.cn
 * @since 2020.3.8
 */
public class APIGenerator extends AdapterGenerator {

	protected final String kind;

	protected final CrossCloudAPIAnalyzer analyzer;

	public APIGenerator(CloudControllerModel ccm) {
		super(ccm);
		this.kind = ccm.getKind();
		this.analyzer = getAnalyzer(ccm);
	}

	protected CrossCloudAPIAnalyzer getAnalyzer(CloudControllerModel ccm) {
		try {
			Class<?> clazz = getClass().getClassLoader().loadClass(ccm.getAnalyzer());
			Constructor<?> cons = clazz.getConstructor(String.class, String.class, ClassLoader.class);
			return (CrossCloudAPIAnalyzer) cons.newInstance(kind, ccm.getClient(),
										new URLClassLoader(toURLs(getUrl())));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public String getUrl() {
		File jarFile = new File(getRootDir(), TARGET_DIR + JAR_NAME_PREFIX + ccm.getKind().toLowerCase() + "-"
				+ ccm.getVersion() + "-" + JAR_NAME_POSTFIX);
		return "file:" + jarFile.getAbsolutePath();
	}

	public void exec() throws Exception {
		File root = mkdirIfNeed(null, "jsons");
		File vm = new File(root, kind.toLowerCase());
		if (!vm.exists()) {
			vm.mkdirs();
		}
		generateKubeLifecycle(root, analyzer.extraCloudAPIs());
	}

	protected static URL[] toURLs(String url) {
		try {
			URL[] urls = new URL[1];
			urls[0] = new URL(url);
			return urls;
		} catch (Exception ex) {
			return null;
		}
	}
	

	protected void generateKubeLifecycle(File root, List<?> list) throws Exception, IOException {
		for (Object obj : list) {
			ObjectNode jo = new ObjectMapper().createObjectNode();
			jo.put("apiVersion", "cloudplus.io/v1alpha3");
			jo.put("kind", kind + "Template");

			ObjectNode meta = new ObjectMapper().createObjectNode();
			if (obj instanceof ClassToMethodModel) {
				ClassToMethodModel mo = (ClassToMethodModel) obj;
				meta.put("name", mo.getMethod().getName().toLowerCase() + mo.getParent().getSimpleName().toLowerCase());
			} else if (obj instanceof Class) {
				Class<?> clz = (Class<?>) obj;
				meta.put("name", clz.getSimpleName().toLowerCase());
			}
			meta.put("namespace", kind.toLowerCase());
			jo.set("metadata", meta);

			ObjectNode spec = new ObjectMapper().createObjectNode();
			ObjectNode life = new ObjectMapper().createObjectNode();

			spec.set("lifecycle", life);

			if (obj instanceof ClassToMethodModel) {
				ClassToMethodModel mo = (ClassToMethodModel) obj;
				life.set(mo.getMethod().getName() + mo.getParent().getSimpleName(),
						JSONUtils.paramInfo(mo.getMethod()));
			} else if (obj instanceof Class) {
				Class<?> clz = (Class<?>) obj;
				String str = clz.getSimpleName().substring(0, 1).toLowerCase() + clz.getSimpleName().substring(1);
				life.set(str, JSONUtils.objInfo(clz));
			}

			jo.set("spec", spec);
			generateKubeLifecycle(new File(root, kind.toLowerCase()), jo);
		}
	}

	protected File mkdirIfNeed(File dir, String name) {
		File root = new File(dir, name);
		if (!root.exists()) {
			root.mkdirs();
		}
		return root;
	}

	protected void generateKubeLifecycle(File root, JsonNode jo) throws IOException {
		File newRoot = mkdirIfNeed(root, "lifecycle");
		String name = jo.get("metadata").get("name").asText();
		FileWriter life = new FileWriter(new File(newRoot, kind.toLowerCase() + "-" + name + ".json"));
		System.out.println("generating lifecycle " + name);
		generate(life, jo.get("spec").toPrettyString());
	}

	protected void generate(FileWriter fw, String content) throws IOException {
		fw.write(content);
		fw.close();
	}

	public void copy(File src, File dst) throws Exception {
		
		{
			String str = "rm -rf " + dst.getAbsolutePath();
			Process p = Runtime.getRuntime().exec(str);
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
		
		{
			String str = "cp -r " + src.getAbsolutePath() + " " + dst.getAbsolutePath();
			Process p = Runtime.getRuntime().exec(str);
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
		
	}

	public static void main(String[] args) throws Exception {
		CloudControllerModel cc = new CloudControllerModel();
		cc.setKind("AmazonEKS");
		cc.setClient("com.amazonaws.services.eks.AmazonEKS");
		cc.setAnalyzer(RequestWithObjectPatternAnalyzer.class.getName());
		cc.setInitClient("com.amazonaws.services.eks.AmazonEKSClientBuilder.standard().withCredentials(new\r\n" + 
				"      com.amazonaws.auth.AWSStaticCredentialsProvider(new com.amazonaws.auth.BasicAWSCredentials(map.get(\"accessKey\"),\r\n" + 
				"      map.get(\"secretKey\")))).withRegion(map.get(\"zone\")).build();");
		List<Dependency> dependencies = new ArrayList<Dependency>();
		Dependency d1 = new Dependency();
		d1.setGroupId("com.amazonaws");
		d1.setArtifactId("aws-java-sdk-eks");
		d1.setVersion("1.11.837");
		dependencies.add(d1);
//		Dependency d2 = new Dependency();
//		d2.setGroupId("com.aliyun");
//		d2.setArtifactId("aliyun-java-sdk-ecs");
//		d2.setVersion("4.19.1");
//		dependencies.add(d2);
		cc.setDependency(dependencies);
		
		APIGenerator cmd = new APIGenerator(cc);
		cmd.exec();
	}

}
