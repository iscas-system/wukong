/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package io.github.wukong.tencentvm;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.cvm.v20170312.CvmClient;

/**
 * https://cloud.tencent.com/document/api/213/15730
 * 
 * @author wuheng@iscas.ac.cn
 * @since  2019.1
 */
public class WukongTencentVMClient extends CvmClient {

	public WukongTencentVMClient(Credential credential, String region) {
		super(credential, region);
	}

	public WukongTencentVMClient(Credential credential, String region, ClientProfile profile) {
		super(credential, region, profile);
	}

}
