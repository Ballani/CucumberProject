package com.name.stepDefinitions;

import com.name.pageSteps.JsonAPISteps;

import io.cucumber.java.en.*;

public class JsonAPIDefinitions {

	JsonAPISteps jsonSteps;
	
	@Given("^User is created with user id (.*?) user title (.*?) and user body (.*?)$")
	public void createUserDetails(int userId,String userTitle, String userBody) throws Exception {
		jsonSteps=new JsonAPISteps();
		jsonSteps.postCreateUserDetails(userId,userTitle,userBody);
	}

	@Then("^verify user details (.*?)$")
	public void verify_user_details(int userId) throws Exception {
		jsonSteps=new JsonAPISteps();
		jsonSteps.getUserDetails(userId);
	    
	}

	@And("^delete the user id (.*?)$")
	public void delete_the_user_id(int userId) throws Exception{
	    jsonSteps=new JsonAPISteps();
	    jsonSteps.delUserDetails(userId);
	}
}
