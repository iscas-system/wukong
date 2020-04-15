/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.nodeless.core;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.nodeless.models.ClassToMethodModel;
import com.github.nodeless.utils.JSONUtils;

/**
 * @author tangting18@otcaix.iscas.ac.cn
 * @author wuheng@otcaix.iscas.ac.cn
 * @since  2020.3.8
 */
public class KubernetesResourceGenerator {

	public final static String NAMESPACE = "{\r\n" + 
			"  \"apiVersion\": \"v1\",\r\n" + 
			"  \"kind\": \"Namespace\",\r\n" + 
			"  \"metadata\": {\r\n" + 
			"    \"name\": \"THISNS\"\r\n" + 
			"  }\r\n" + 
			"}";
	
	public final static String CRD = "{\r\n" + 
			"  \"apiVersion\": \"apiextensions.k8s.io/v1beta1\",\r\n" + 
			"  \"kind\": \"CustomResourceDefinition\",\r\n" + 
			"  \"metadata\": {\r\n" + 
			"    \"name\": \"thiskinds.cloudplus.io\",\r\n" + 
			"    \"namespace\": \"THISNS\"\r\n" + 
			"  },\r\n" + 
			"  \"spec\": {\r\n" + 
			"    \"additionalPrinterColumns\": [\r\n" + 
			"      {\r\n" + 
			"        \"JSONPath\": \".spec.type\",\r\n" + 
			"        \"name\": \"TYPE\",\r\n" + 
			"        \"type\": \"string\"\r\n" + 
			"      },\r\n" + 
			"      {\r\n" + 
			"        \"JSONPath\": \".metadata.creationTimestamp\",\r\n" + 
			"        \"name\": \"AGE\",\r\n" + 
			"        \"type\": \"date\"\r\n" + 
			"      }\r\n" + 
			"    ],\r\n" + 
			"    \"group\": \"cloudplus.io\",\r\n" + 
			"    \"names\": {\r\n" + 
			"      \"kind\": \"THISKIND\",\r\n" + 
			"      \"plural\": \"thiskinds\",\r\n" + 
			"      \"shortNames\": [\r\n" + 
			"        \"thiskind\"\r\n" + 
			"      ],\r\n" + 
			"      \"singular\": \"thiskind\"\r\n" + 
			"    },\r\n" + 
			"    \"scope\": \"Namespaced\",\r\n" + 
			"    \"version\": \"v1alpha3\"\r\n" + 
			"  }\r\n" + 
			"}";
	
	protected final String kind;
	
	
	protected URLClassLoader classloader;
	
	public KubernetesResourceGenerator(String kind, URLClassLoader classloader) {
		super();
		this.kind = kind;
		this.classloader = classloader;
	}
	
	public void generateCRDsBy(CrossCloudAPIAnalyzer analyzer) throws Exception {
		File root = mkdirIfNeed(null, "jsons");
		generateKubeNS(root);
		generateKubeCRD(root);
		generateBackend(root, analyzer.getMethods());
		generateLifecycle(root, analyzer.extraCloudAPIs());
	}

	protected void generateBackend(File root, Map<String, String> map) throws IOException {
		JSONObject jo = new JSONObject();
		jo.put("apiVersion", "cloudplus.io/v1alpha3");
		jo.put("kind", "Backend");
		JSONObject meta = new JSONObject();
		meta.put("name", kind.toLowerCase());
		jo.put("metadata", meta);
		JSONObject spec = new JSONObject();
		List<JSONObject> list = new ArrayList<JSONObject>();
		for (String key : map.keySet()) {
			JSONObject oo = new JSONObject();
			oo.put("name", key);
			oo.put("value", map.get(key));
			list.add(oo);
		}
		spec.put("lifecycle", list);
		jo.put("spec", spec);
		FileWriter kubeNS = new FileWriter(new File(root, kind.toLowerCase() + "-bkd.json"));
		generate(kubeNS, JSON.toJSONString(jo, true));
	}

	protected void generateLifecycle(File root, List list) throws Exception, IOException {
		for (Object obj : list) {
			JSONObject jo = new JSONObject();
			jo.put("apiVersion", "cloudplus.io/v1alpha3");
			jo.put("kind", kind + "Template");

			JSONObject meta = new JSONObject();
			if (obj instanceof ClassToMethodModel) {
				ClassToMethodModel mo = (ClassToMethodModel) obj;
				meta.put("name", mo.getMethod().getName().toLowerCase()
						+ mo.getParent().getSimpleName().toLowerCase());
			} else if (obj instanceof Class) {
				Class<?> clz = (Class<?>) obj;
				meta.put("name", clz.getSimpleName().toLowerCase());
			}
			meta.put("namespace", kind.toLowerCase());
			jo.put("metadata", meta);
			
			JSONObject spec = new JSONObject();
			JSONObject life = new JSONObject();
			
			spec.put("lifecycle", life);
			
			if (obj instanceof ClassToMethodModel) {
				ClassToMethodModel mo = (ClassToMethodModel) obj;
				life.put(mo.getMethod().getName() + mo.getParent().getSimpleName(), JSONUtils.paramInfo(mo.getMethod()));
			} else if (obj instanceof Class) {
				Class<?> clz = (Class<?>) obj;
				String str = clz.getSimpleName().substring(0, 1).toLowerCase() + clz.getSimpleName().substring(1);
				life.put(str, JSONUtils.objInfo(clz));
			}
			
			jo.put("spec", spec);
			generateKubeLifecycle(root, jo);
		}
	}

	protected File mkdirIfNeed(File dir , String name) {
		File root = (dir == null) ? new File(new File(name), kind.toLowerCase())
									: new File(dir, name);
		if (!root.exists()) {
			root.mkdirs();
		}
		return root;
	}

	protected void generateKubeLifecycle(File root, JSONObject jo) throws IOException {
		File newRoot = mkdirIfNeed(new File(root, kind.toLowerCase()), "lifecycle");
		String name = jo.getJSONObject("metadata").getString("name");
		FileWriter life = new FileWriter(new File(newRoot, kind.toLowerCase() + "-" + name +  ".json"));
		System.out.println("generating lifecycle " + name);
		generate(life, JSON.toJSONString(jo, true));
	}
	
	protected void generateKubeNS(File root) throws IOException {
		FileWriter kubeNS = new FileWriter(new File(root, kind.toLowerCase() + "-ans.json"));
		generate(kubeNS, NAMESPACE.replaceAll("THISNS", kind.toLowerCase()));
		System.out.println("generating namespace " + kind.toLowerCase());
	}
	
	protected void generateKubeCRD(File root) throws IOException {
		FileWriter kubeCRD = new FileWriter(new File(root, kind.toLowerCase() + "-crd.json"));
		generate(kubeCRD, CRD.replaceAll("THISNS", kind.toLowerCase())
										.replaceAll("THISKIND", kind)
										.replaceAll("thiskind", kind.toLowerCase()));
		System.out.println("generating crd " + kind);
	}
	
	protected void generate(FileWriter fw, String content) throws IOException {
		fw.write(content);
		fw.close();
	}

}
