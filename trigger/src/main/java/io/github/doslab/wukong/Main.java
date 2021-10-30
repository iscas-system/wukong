/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong;

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
			new CloudVersionAnalyzer().analyse();
			break;
		case 2:
			new GenerateConfigAnalyzer().analyse();
			break;
		case 3:
			new GenerateCloudletAnalyzer().analyse();
			break;
		case 4:
			new NewAPIAnalyzer().analyse();
			break;
		default:
			usage();
		}
	}

	private static void usage() {
		System.out.println("Usage: ");
		System.out.println("\t1: analyze cloud version using conf/maven.list, see output results/versions.json" + CloudVersionAnalyzer.class.getSimpleName());
		System.out.println("\t2:" + GenerateConfigAnalyzer.class.getSimpleName());
		System.out.println("\t3:" + GenerateCloudletAnalyzer.class.getSimpleName());
		System.out.println("\t4:" + NewAPIAnalyzer.class.getSimpleName());
	}

}
