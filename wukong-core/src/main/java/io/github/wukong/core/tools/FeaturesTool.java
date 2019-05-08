/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.wukong.core.tools;

import java.util.Set;


public class FeaturesTool {

	/**
	 * @param name name
	 * @param kinds kinds
	 */
	public static void showAllFeatures(String name, Set<String> kinds) {
		System.out.println("## " + name + " features:");
		System.out.println();
		System.out.println("```");
		for (String kind : kinds) {
			System.out.println("- " + kind);
		}
		System.out.println("```");
	}
	
	/**
	 * @param kinds kinds
	 */
	public static void testFeaturesWithTrueResults(Set<String> kinds) {
		for (String kind : kinds) {
			System.out.println("Assert.assertEquals(kinds.contains(\"" + kind
					+ "\"), true);");
		}
		
	}
	
	/**
	 * @param kinds kinds
	 */
	public static void testFeaturesWithFalseResults(Set<String> kinds) {
		for (String kind : kinds) {
			System.out.println("Assert.assertEquals(kinds.contains(\"" + kind
					+ "False\"), false);");
		}
		
	}
}
