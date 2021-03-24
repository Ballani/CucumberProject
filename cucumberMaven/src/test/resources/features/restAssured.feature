Feature: Test rest api


  Scenario: Verify user api
    Given user details using get api
    
  Scenario Outline: Verify post api to create user
  	Given post api to create user <user> and job <job>
  	And verify the response

    Examples:
    |user|job|
    |morpheus|leader|
    |kesava|leader|
