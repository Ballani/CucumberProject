package com.name.utilities;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestAssuredUtilities {
	Map<String, String> defaultHeaders;
	
	public Map<String, String> defaultHeader(){
		defaultHeaders=new HashMap<String, String>();
		defaultHeaders.put("Content-Type","application/json");
		return defaultHeaders;
	}
	
	
	public Map<String, String> rapidApiHeader(){
		defaultHeaders=new HashMap<String, String>();
		defaultHeaders.put("x-rapidapi-key", "66667b29c1mshc442f19c32d2fc2p1c1315jsn69d1df76580c");
		defaultHeaders.put("x-rapidapi-host", "restcountries-v1.p.rapidapi.com");
		return defaultHeaders;
	}

	public Response sendGetRequest(String host,String path, Map<String,String> headers) {		
		return given().baseUri(host).basePath(path).headers(headers).when().get().then().extract().response();	
	}
	
	public Response sendPostRequest(String host,String path, Map<String,String> headers, Map<String,String> body) {		
		return given().baseUri(host).basePath(path).headers(headers).when().body(body).post().then().extract().response();
	}
	
	public Response deletePostRequest(String host,String path, Map<String,String> headers) {		
		return given().baseUri(host).basePath(path).headers(headers).when().delete().then().extract().response();
	}
	
	
	public void verifyJsonResponse(Response response, String jsonKey, String jsonValue) {
		Response jresponse=response.then().contentType(ContentType.JSON).extract().response();
		String jsonres=jresponse.jsonPath().getString(jsonKey);
		System.out.println("json values:"+jsonres);
		Assert.assertEquals(jsonres.contains(jsonValue), true);
	}

}
