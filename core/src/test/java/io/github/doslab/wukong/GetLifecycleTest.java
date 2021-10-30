/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.doslab.wukong;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2020.2.15
 * 
 **/
public class GetLifecycleTest {

	static final String JSON = "{\r\n" + 
			"  \"lifecycle\" : {\r\n" + 
			"    \"createCapacityReservationRequest\" : {\r\n" + 
			"      \"resourceOwnerId\" : 1,\r\n" + 
			"      \"clientToken\" : \"String\",\r\n" + 
			"      \"description\" : \"String\",\r\n" + 
			"      \"startTime\" : \"String\",\r\n" + 
			"      \"platform\" : \"String\",\r\n" + 
			"      \"privatePoolOptionsMatchCriteria\" : \"String\",\r\n" + 
			"      \"instanceType\" : \"String\",\r\n" + 
			"      \"endTimeType\" : \"String\",\r\n" + 
			"      \"resourceOwnerAccount\" : \"String\",\r\n" + 
			"      \"privatePoolOptionsName\" : \"String\",\r\n" + 
			"      \"ownerAccount\" : \"String\",\r\n" + 
			"      \"endTime\" : \"String\",\r\n" + 
			"      \"ownerId\" : 1,\r\n" + 
			"      \"instanceAmount\" : 1\r\n" + 
			"    }\r\n" + 
			"  }\r\n" + 
			"}\r\n" + 
			"";
	
	public static void main(String[] args) throws Exception {
		JsonNode json = new ObjectMapper().readTree(JSON);
		System.out.println(json.get("lifecycle").fields().next().getKey());
		
	}

	
}
