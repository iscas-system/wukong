/**
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.wukong.qingcloud_vm;


/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @since 2019/5/8
 * 
 */
public class QingcloudVMAnalyzerTest {

	public static void main(String[] args) {
		QingcloudVMKindAnalyzer ka = new QingcloudVMKindAnalyzer();
		System.out.println(ka.getKinds().size());
		for (String kind : ka.getKinds()) {
			System.out.println(kind + ":<" + ka.getDesc(kind)
					+ "," + ka.getModel(kind) + ">");
		}
	}

}
