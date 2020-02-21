package io.github.cloudpluslab.wukong.example;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.ecs.model.v20140526.CreateImageRequest;
import com.aliyuncs.ecs.model.v20140526.CreateInstanceRequest;
import com.aliyuncs.ecs.model.v20140526.CreateInstanceRequest.DataDisk;
import com.aliyuncs.ecs.model.v20140526.StartInstanceRequest;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;

/**
 * Hello world!
 *
 */
public class AliyunECS 
{
	
	public static final String DATA = "{\r\n" + 
			"	\"queryParameters\":{\r\n" + 
			"		\"InstanceId\":\"uuid\"\r\n" + 
			"	}\r\n" +
			"}\r\n" + 
			"";
	
    public static void main( String[] args ) throws Exception
    {
    	CreateInstanceRequest req = get();
    	// with version 3.3.0
    	req.setDataDisk1Size(1000);
		// with version 4.17.8
    	List<DataDisk> dataDisks = init();
    	DataDisk disk = new DataDisk();
    	disk.setSize(1000);
    	dataDisks.add(disk);
    	req.setDataDisks(dataDisks);
    	
//    	JSONObject.parseObject(DATA, StartInstanceRequest.class);
//    	example();
    }

	private static void example() throws ServerException, ClientException {
		DefaultAcsClient client = getClient();
		{
	    	StartInstanceRequest request = new StartInstanceRequest();
	    	request.setInstanceId("uuid");
			client.getAcsResponse(request);
		}
		{
			CreateImageRequest request = new CreateImageRequest();
			request.setImageName("image");
			client.getAcsResponse(request);
		}
	}

	private static DefaultAcsClient getClient() {
		return null;
	}
}
