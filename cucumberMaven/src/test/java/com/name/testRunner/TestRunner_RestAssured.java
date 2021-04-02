package com.name.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/features/restAssured.feature",
	glue="com.name.stepDefinitions",
	plugin= {"pretty","html:target/HtmlReports/reports"})
	public class TestRunner_RestAssured{

	}
