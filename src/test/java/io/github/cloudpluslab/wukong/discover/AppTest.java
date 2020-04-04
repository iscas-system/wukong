package io.github.cloudpluslab.wukong.discover;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jdcloud.sdk.service.vm.model.DescribeInstanceRequest;
import com.jdcloud.sdk.service.vm.model.DescribeInstanceResponse;
import com.jdcloud.sdk.service.vm.model.DescribeInstanceTypesRequest;
import com.jdcloud.sdk.service.vm.model.InstanceType;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case @throws Exception @throws
	 */
	public static void main(String[] args) throws Exception {
		com.jdcloud.sdk.service.vm.client.VmClient client = com.jdcloud.sdk.service.vm.client.VmClient.builder()
				.credentialsProvider(new com.jdcloud.sdk.auth.StaticCredentialsProvider(
						"94A7BCBB899B6FB7DFEE55C8CDE7FB85", "8F9E4018575B265E9ED13F4DAFCE95CB "))
				.build();
//    	System.out.println(client);
//    	DescribeImagesRequest request = new DescribeImagesRequest();
//    	request.setRegionId("cn-east-2");
//    	request.setImageSource("public");
//		DescribeImagesResponse describeImages = client.describeImages(request);
//		DescribeImagesResult result = describeImages.getResult();
//		System.out.println(result);
//		for (Image image : result.getImages()) {
//			System.out.println(image.getImageId() + ":" + image.getDesc());
//		}

//    	CreateInstancesRequest request = new CreateInstancesRequest();
//    	request.setRegionId("cn-east-2");
//    	request.setMaxCount(1);
//    	InstanceSpec instanceSpec = new InstanceSpec();
//    	instanceSpec.setInstanceType("g.n2.medium");
//    	instanceSpec.setName("instance");
//    	instanceSpec.setImageId("img-kxs3xhhwy6");
//    	instanceSpec.setAz("cn-east-2a");
//    	InstanceNetworkInterfaceAttachmentSpec pmi = new InstanceNetworkInterfaceAttachmentSpec();
//    	NetworkInterfaceSpec ni = new NetworkInterfaceSpec();
//    	ni.setSubnetId("subnet-rgcovslx4i");
//		pmi.setNetworkInterface(ni );
//		instanceSpec.setPrimaryNetworkInterface(pmi );
//		request.setInstanceSpec(instanceSpec);
//		System.out.println(new ObjectMapper().writeValueAsString(request));
//		CreateInstancesResponse  resp = client.createInstances(request);
//		System.out.println(new ObjectMapper().writeValueAsString(resp));

		DescribeInstanceRequest request = new DescribeInstanceRequest();
		request.setInstanceId("i-qvy8rmsuww");
		request.setRegionId("cn-east-2");
		System.out.println(new ObjectMapper().writeValueAsString(request));
		DescribeInstanceResponse resp = client.describeInstance(request);
		System.out.println(new ObjectMapper().writeValueAsString(resp));

		DescribeInstanceTypesRequest request2 = new DescribeInstanceTypesRequest();
		request2.setRegionId("cn-north-1");
		for (InstanceType it : client.describeInstanceTypes(request2).getResult().getInstanceTypes()) {
			System.out.println(it.getInstanceType() + ":" + it.getDesc());
		}

	}

	public static void baidu() {
//		com.baidubce.services.bcc.BccClient client = new com.baidubce.services.bcc.BccClient(new com.baidubce.BceClientConfiguration().withCredentials(new com.baidubce.auth.DefaultBceCredentials("3eab6ea0d5a546efbe483fdb83529021", "f981f9acea0a488896442c6dbb800477")));
//		for (ImageModel im : client.listImages(new ListImagesRequest()).getImages()) {
//			System.out.println(im.getId() + ":" + im.getName());
//		}
//		
//		for (InstanceTypeModel obj : client.listInstanceSpecs(new ListInstanceSpecsRequest()).getInstanceTypes()) {
//			System.out.println(obj.getName() + ":" + obj.getType() + ":" + obj.getCpuCount() + ":" + obj.getMemorySizeInGB());
//		}
//		
//		for (ZoneModel zm : client.listZones().getZones()) {
//			System.out.println(zm.getZoneName());
//		}
//		
//		CreateInstanceRequest request = new CreateInstanceRequest();
//		request.setImageId("m-IKAqTyxx");
//		request.setZoneName("cn-bj-a");
//		request.setBilling(new Billing().withPaymentTiming("Postpaid"));
//		request.setCpuCount(1);
//		request.setMemoryCapacityInGB(1);
//		request.setSpec("bcc.ic3.c1m1");
//		request.setAdminPass("onceas123!@#");
//		request.setInstanceType("bcc.ic3.c1m1");
//		client.createInstance(request ).getInstanceIds();
	}

}
