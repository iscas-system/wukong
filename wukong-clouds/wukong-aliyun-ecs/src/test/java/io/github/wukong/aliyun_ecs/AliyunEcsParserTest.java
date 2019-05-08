/**
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.wukong.aliyun_ecs;

import com.aliyuncs.ecs.model.v20140526.CreateImageRequest;

import io.github.wukong.aliyun_ecs.AliyunParserConvertor;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @since 2019/5/8
 * 
 */
public class AliyunEcsParserTest {

	
	static final String JSON = "{\n" + 
			"	\"main\":{\n" + 
			"		\"setTags\":[\n" + 
			"			\"ref1-com.aliyuncs.ecs.model.v20140526.CreateImageRequest$Tag\"\n" + 
			"		],\n" + 
			"		\"setResourceOwnerId\":\"12345\",\n" + 
			"		\"setResourceOwnerAccount\":\"owneraccount\",\n" + 
			"		\"setClientToken\":\"token\",\n" + 
			"		\"setOwnerAccount\":\"account\",\n" + 
			"		\"setDescription\":\"desc\",\n" + 
			"		\"setOwnerId\":\"12345\",\n" + 
			"		\"setResourceGroupId\":\"demo\",\n" + 
			"		\"setInstanceId\":\"ins001\",\n" + 
			"		\"setSnapshotId\":\"sna001\",\n" + 
			"		\"setImageName\":\"img001\",\n" + 
			"		\"setArchitecture\":\"x86\",\n" + 
			"		\"setDiskDeviceMappings\":[\n" + 
			"			\"ref2-com.aliyuncs.ecs.model.v20140526.CreateImageRequest$DiskDeviceMapping\"\n" + 
			"		],\n" + 
			"		\"setPlatform\":\"x86\",\n" + 
			"		\"setImageVersion\":\"7.x\",\n" + 
			"		\"setSecurityToken\":\"st\",\n" + 
			"		\"setVersion\":\"2\",\n" + 
			"		\"setActionName\":\"hello\",\n" + 
			"		\"setLocationProduct\":\"hello\",\n" + 
			"		\"setEndpointType\":\"hello\",\n" + 
			"		\"setEndpoint\":\"cn-hangzhou\",\n" + 
			"		\"setRegionId\":\"cn-hangzhou\",\n" + 
			"		\"setConnectTimeout\":\"30\",\n" + 
			"		\"setReadTimeout\":\"30\",\n" + 
			"		\"setEncoding\":\"utf8\"\n" + 
			"	},\n" + 
			"	\"ref1-com.aliyuncs.ecs.model.v20140526.CreateImageRequest$Tag\":{\n" + 
			"		\"setKey\":\"hello\",\n" + 
			"		\"setValue\":\"hello\"\n" + 
			"	},\n" + 
			"	\"ref2-com.aliyuncs.ecs.model.v20140526.CreateImageRequest$DiskDeviceMapping\":{\n" + 
			"		\"setSnapshotId\":\"snapshotid\",\n" + 
			"		\"setDiskType\":\"disktype\",\n" + 
			"		\"setDevice\":\"device\",\n" + 
			"		\"setSize\":\"20\"\n" + 
			"	}\n" + 
			"}";
	
	public static void main(String[] args) throws Exception {
		AliyunParserConvertor aoc = new AliyunParserConvertor();
		CreateImageRequest cir = (CreateImageRequest) aoc.mapToKind(JSON, "CreateImage");
		System.out.println(cir.getClientToken());
		System.out.println(cir.getArchitecture());
		System.out.println(cir.getOwnerId());
		System.out.println(cir);
		System.out.println(cir);
		System.out.println(cir);
	}

}
