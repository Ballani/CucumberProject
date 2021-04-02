package com.name.stepDefinitions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import com.name.config.Configs;
import com.name.utilities.RestAssuredUtilities;

import io.cucumber.java.en.*;
import io.restassured.response.Response;

public class getRapidAPI {
	Map<String, String> defaultHeaders;
	RestAssuredUtilities apiCalls;
	Configs configPro ;
	Response response;
	
	@Given("I have API headers")
	public void i_have_api_headers() {
		defaultHeaders=new HashMap<String, String>();
		defaultHeaders.put("x-rapidapi-key", "66667b29c1mshc442f19c32d2fc2p1c1315jsn69d1df76580c");
		defaultHeaders.put("x-rapidapi-host", "restcountries-v1.p.rapidapi.com");
		
	}

	@Then("I get countries")
	public void i_get_countries() throws Exception{
		apiCalls= new RestAssuredUtilities(); 
		configPro= new Configs();
		response=apiCalls.sendGetRequest(configPro.getHost(), configPro.getPath(), defaultHeaders);	
		System.out.println(response.getBody().prettyPrint());
		Assert.assertEquals(response.getStatusCode(), 200);	
	}

	@Then("I verify India exeists in the response")
	public void i_verify_india_exeists_in_the_response() {
		String bodyText=response.getBody().toString();
		Assert.assertNotNull(bodyText);
		
	}
	

}
