package com.name.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/features/rapidApi.feature",
	glue="com.name.stepDefinitions",
	plugin= {"pretty","json:target/Jsonreports/cucumber.json"})
	public class TestRunner_RestAssured{

	}
