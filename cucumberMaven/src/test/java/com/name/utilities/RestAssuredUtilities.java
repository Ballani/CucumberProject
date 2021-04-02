package com.name.utilities;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import java.util.Map;

import io.restassured.response.Response;

public class RestAssuredUtilities {

	public Map<String, String> defaultHeader(){
		Map<String, String> defaultHeaders=new HashMap<String, String>();
		defaultHeaders.put("Content-Type","application/json");
		return defaultHeaders;
	}

	public Response sendGetRequest(String host,String path, Map<String,String> headers) {		

		return given().baseUri(host).basePath(path).headers(headers).get().then().extract().response();	

	}

}
