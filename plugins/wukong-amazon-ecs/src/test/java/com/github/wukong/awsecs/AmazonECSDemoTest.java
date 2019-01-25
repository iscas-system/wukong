package com.github.wukong.awsecs;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.services.ecs.AmazonECSClient;
import com.amazonaws.services.ecs.model.CreateClusterRequest;

public class AmazonECSDemoTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		ClientConfiguration config = null;
		AmazonECSClient client = new AmazonECSClient(config);
		CreateClusterRequest request = null;
		client.createCluster(request);
	}

}
