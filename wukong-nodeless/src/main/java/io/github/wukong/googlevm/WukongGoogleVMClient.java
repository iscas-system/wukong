/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package io.github.wukong.googlevm;

import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.services.compute.Compute;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @since 2019.1
 */
public class WukongGoogleVMClient extends Compute {

	public WukongGoogleVMClient(HttpTransport transport, JsonFactory jsonFactory,
			HttpRequestInitializer httpRequestInitializer) {
		super(transport, jsonFactory, httpRequestInitializer);
	}
	
}
