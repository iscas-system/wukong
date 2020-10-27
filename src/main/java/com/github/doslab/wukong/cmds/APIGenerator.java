/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong.cmds;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.github.doslab.wukong.analyzer.CrossCloudAPIAnalyzer;
import com.github.doslab.wukong.models.ClassToMethodModel;
import com.github.doslab.wukong.models.CloudMetadataModel;
import com.github.doslab.wukong.utils.JSONUtils;

/**
 * @author tangting18@otcaix.iscas.ac.cn
 * @author wuheng@otcaix.iscas.ac.cn
 * @since 2020.3.8
 */
public class APIGenerator extends AdapterGenerator {

	protected final String kind;

	protected final CrossCloudAPIAnalyzer analyzer;

	public APIGenerator(CloudMetadataModel ccm) {
		super(ccm);
		this.kind = ccm.getKind();
		this.analyzer = getAnalyzer(ccm);
	}

	protected CrossCloudAPIAnalyzer getAnalyzer(CloudMetadataModel ccm) {
		try {
			Class<?> clazz = getClass().getClassLoader().loadClass(ccm.getAnalyzer());
			Constructor<?> cons = clazz.getConstructor(CloudMetadataModel.class);
			return (CrossCloudAPIAnalyzer) cons.newInstance(ccm);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
	

	public APIGenerator(CloudMetadataModel ccm, String kind, CrossCloudAPIAnalyzer analyzer) {
		super(ccm);
		this.kind = kind;
		this.analyzer = analyzer;
	}

	public void exec() throws Exception {
		File root = mkdirIfNeed(null, "jsons");
		File vm = new File(root, kind.toLowerCase());
		if (!vm.exists()) {
			vm.mkdirs();
		}
		generateKubeLifecycle(root, analyzer.extraCloudAPIs());
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

}
