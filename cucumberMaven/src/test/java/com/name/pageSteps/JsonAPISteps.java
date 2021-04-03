package com.name.pageSteps;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import com.fasterxml.jackson.databind.json.JsonMapper;
import com.name.config.Configs;
import com.name.utilities.RestAssuredUtilities;

import io.restassured.response.Response;

public class JsonAPISteps {
	
	Map<String, String> defaultHeaders;
	RestAssuredUtilities apiCalls;
	Configs configPro ;
	Response response;
	Map<String,String> variables;
	
	public void postCreateUserDetails(int userId, String userTitle, String userBody) throws Exception 
	{
		apiCalls= new RestAssuredUtilities(); 
		configPro= new Configs();
		System.out.println("postCreateUserDetails");
		variables=new HashMap<String,String>();
		variables.put("userId",String.valueOf(userId));
		variables.put("title",userTitle);
		variables.put("body",userBody);
		response=apiCalls.sendPostRequest(configPro.getJsonAPIhost(), configPro.getJsonPostPath(),apiCalls.defaultHeader(),variables);
		System.out.println(response.getBody().prettyPrint());
		Assert.assertEquals(response.getStatusCode(), 201);
		//return response;
		//.body(new File(./Payload.json)
	}
	
	public void getUserDetails(int userId) throws Exception {
		apiCalls= new RestAssuredUtilities(); 
		configPro= new Configs();
		System.out.println("getUserDetails");
		response=apiCalls.sendGetRequest(configPro.getJsonAPIhost(), configPro.getJsonPostPath()+"/"+userId, apiCalls.defaultHeader());
		System.out.println(response.getBody().prettyPrint());
		Assert.assertEquals(response.getStatusCode(), 200);
		//return response;
		//.body(new File(./Payload.json)
		
	}
	
	
	public void delUserDetails(int userId) throws Exception {
		apiCalls= new RestAssuredUtilities(); 
		configPro= new Configs();
		System.out.println("delUserDetails");
		Response response=apiCalls.deletePostRequest(configPro.getJsonAPIhost(), configPro.getJsonPostPath()+"/"+userId, apiCalls.defaultHeader());
		Assert.assertEquals(response.getStatusCode(), 200);
		//return response;
		//.body(new File(./Payload.json)
		
	}

}
