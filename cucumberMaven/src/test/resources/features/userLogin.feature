Feature: Test user login


  Scenario Outline: Verify user login with valid credentials
    Given user on login page
    When user enters username <username> and password <password>
    And clicks on the login button
    Then user navigates to homescreen
    
    Examples:
    |username|password|
    |Kesava|12345|
    |Akhila|12345|
    
