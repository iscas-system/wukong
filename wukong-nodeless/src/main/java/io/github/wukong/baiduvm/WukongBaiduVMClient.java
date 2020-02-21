/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package io.github.wukong.baiduvm;

import com.baidubce.BceClientConfiguration;
import com.baidubce.services.bcc.BccClient;

/**
 * https://cloud.baidu.com/doc/BCC/API.html
 * 
 * @author wuheng@iscas.ac.cn
 * @since  2019.1
 */
public class WukongBaiduVMClient extends BccClient {

	public WukongBaiduVMClient() {
		super();
	}

	public WukongBaiduVMClient(BceClientConfiguration clientConfiguration) {
		super(clientConfiguration);
	}

}
