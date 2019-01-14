package com.github.wukong.googlece;

import com.google.api.services.compute.Compute;

public class GoogleGCEDemoTest {

	@SuppressWarnings("null")
	public static void main(String[] args) throws Exception {
		Compute client = null;
		client.instances().start(null, null, null);
		client.instanceGroups().addInstances(null, null, null, null);
	}

}
