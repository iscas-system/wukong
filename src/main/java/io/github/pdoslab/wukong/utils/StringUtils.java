/**
 * Copyrigt (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.pdoslab.wukong.utils;

import java.util.HashSet;
import java.util.Set;


/**
 * @author wuheng@iscas.ac.cn
 * @since  2019.12.19
 * 
 */

public class StringUtils {

	public static Set<String> toSet(String blacklist) {
		Set<String> set = new HashSet<String>();
		for (String name : blacklist.split(",")) {
			set.add(name.trim());
		}
		return set;
	}
}
