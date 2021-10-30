/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.doslab.wukong;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2021.2.15
 * 
 **/
public class Main {

	public static void main(String[] args) throws Exception {
		if (args.length == 0) {
			usage();
			System.exit(1);
		}

		int num = Integer.parseInt(args[0]);
		switch (num) {
		case 1:
			new CloudVersionGenerator().generate();
			break;
		case 2:
			new CloudDescGenerator().generate();
			break;
		case 3:
			new CloudletGenerator().generate();
			break;
		case 4:
			new CloudAPIGenerator().generate();
			break;
		default:
			usage();
		}
	}

	private static void usage() {
		System.out.println("Usage: ");
		System.out.println("\t1: analyze cloud version using conf/maven.list, see output results/versions.json" + CloudVersionGenerator.class.getSimpleName());
		System.out.println("\t2: generate cloud desc using conf/client.list and results/versions.json, see output jsons/" + CloudDescGenerator.class.getSimpleName());
		System.out.println("\t3: generate cloudlet using jsons/, see output libs/" + CloudletGenerator.class.getSimpleName());
		System.out.println("\t4: generate cloudlet using jsons/ and libs/, see output apis/" + CloudAPIGenerator.class.getSimpleName());
	}

}
