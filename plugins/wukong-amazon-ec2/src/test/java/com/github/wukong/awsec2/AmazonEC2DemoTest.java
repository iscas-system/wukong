package com.github.wukong.awsec2;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.services.ec2.AmazonEC2Client;
import com.amazonaws.services.ec2.model.CreateVpcRequest;

public class AmazonEC2DemoTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		ClientConfiguration config = null;
		AmazonEC2Client client = new AmazonEC2Client(config);
		CreateVpcRequest request = null;
		client.createVpc(request );
	}

}
