Feature: Rapid api get testing


Scenario: Verify country in get country lisr response
Given I have API headers
Then I get countries
Then I verify India exeists in the response