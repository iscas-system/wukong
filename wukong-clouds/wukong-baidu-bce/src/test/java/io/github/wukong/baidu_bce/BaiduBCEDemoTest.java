package com.github.wukong.baidubce;

import com.baidubce.services.bcc.BccClient;
import com.baidubce.services.bcc.model.volume.AttachVolumeRequest;
import com.baidubce.services.bcc.model.volume.AttachVolumeResponse;

public class BaiduBCEDemoTest {

	@SuppressWarnings("null")
	public static void main(String[] args) throws Exception {
		BccClient client = null;
		AttachVolumeRequest request = new AttachVolumeRequest();
		@SuppressWarnings("unused")
		AttachVolumeResponse resp = client.attachVolume(request );
	}

}
