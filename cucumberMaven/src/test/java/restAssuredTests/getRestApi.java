package restAssuredTests;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import restUtilites.apiConfigs;

import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import static io.restassured.RestAssured.*;
import io.restassured.response.*;

public class getRestApi {

	apiConfigs headerConfigs = new apiConfigs();
	Map<String, String> variables = new HashMap();
	Response response;

	@Given("^user details using get api$")
	public void user_details_using_get_api() {
		given().when().get("https://reqres.in/api/users?page=2").then().log().body().assertThat()
				.body("page", equalTo(2)).statusCode(200).statusLine("HTTP/1.1 200 OK")
				.header("content-type", "application/json; charset=utf-8");
	}

	@Given("^post api to create user (.*?) and job (.*?)$")
	public void post_api_to_create_user(String user, String job) {

		variables.put("name", user);
		variables.put("job", job);

		 response = RestAssured.given().when().headers(headerConfigs.defaultHeader()).body(variables)
				.post("https://reqres.in/api/users");

				//.then().log().body().log().status().statusCode(201).body("name", equalTo(user)).and()
				//.body("job", equalTo(job));

	}

	@And("^verify the response$")
	public void verify_the_response() {
		
		Assert.assertEquals(response.getStatusCode(), 201);		
	}
	
	//.body("jsonpath", hasItems(2,2,4,5,6)) -- to verify multiple values in the response.
	//customer.text() used in body to get the text in xml to verify in single go
	//containsString used inside the body to check the test of the value using xpath.
	//hasxpath 
	
}
