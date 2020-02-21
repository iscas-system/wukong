package io.github.cloudpluslab.wukong.example;


import java.util.ArrayList;

import com.amazonaws.services.ec2.AmazonEC2Client;
import com.amazonaws.services.ec2.model.CreateFpgaImageRequest;
import com.amazonaws.services.ec2.model.StartInstancesRequest;

/**
 * Hello world!
 *
 */
public class AmazonEC2 
{
    public static void main( String[] args ) throws Exception
    {
    	AmazonEC2Client client = getClient();
		StartInstancesRequest request = new StartInstancesRequest();
		request.setAdditionalInfo("USA");
		ArrayList<String> instanceIds = new ArrayList<String>();
		instanceIds.add("vm001");
		request.setInstanceIds(instanceIds);
		client.startInstances(request );
    }
    
	private static AmazonEC2Client getClient() {
		return null;
	}
}
