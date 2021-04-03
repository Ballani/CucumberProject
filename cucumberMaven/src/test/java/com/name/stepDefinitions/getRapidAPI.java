package com.name.stepDefinitions;



import java.util.Map;
import com.name.config.Configs;
import com.name.pageSteps.RapidApiSteps;
import com.name.utilities.RestAssuredUtilities;
import io.cucumber.java.en.*;
import io.restassured.response.Response;

public class getRapidAPI {
	Map<String, String> defaultHeaders;
	RestAssuredUtilities apiCalls;
	Configs configPro ;
	Response response;
	RapidApiSteps rapidSteps;

	@Given("^api to get countries to verify (.*?) exists in the response$")
	public void i_have_api_headers(String country) throws Exception {
		rapidSteps=new RapidApiSteps();
		String jsonField="name";
		rapidSteps.verifyGetCountriesResponse(country,jsonField);
	}
}
