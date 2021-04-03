package com.name.pageSteps;

import java.sql.Time;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import com.name.config.Configs;
import com.name.utilities.RestAssuredUtilities;
import io.restassured.response.Response;

public class RapidApiSteps {

	Map<String, String> defaultHeaders;
	RestAssuredUtilities apiCalls;
	Configs configPro ;
	Response response;

	// to Get countries list
	public Response getCoutriesList() throws Exception {
		apiCalls= new RestAssuredUtilities(); 
		configPro= new Configs();
		System.out.println("getCoutriesList");
		response=apiCalls.sendGetRequest(configPro.getHost(), configPro.getPath(), apiCalls.rapidApiHeader());
		System.out.println(response.getBody().prettyPrint());
		Assert.assertEquals(response.getStatusCode(), 200);
		return response;
	}
	
	//Verify Countries from response
	public void verifyGetCountriesResponse(String Country, String jsonField) throws Exception {
		System.out.println("verifyGetCountriesResponse");
		Response response=getCoutriesList();
		apiCalls.verifyJsonResponse(response, jsonField, Country);
	}

}
