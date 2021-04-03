Feature: Rapid api get testing

  Scenario Outline: Verify country in get country list response
    Given api to get countries to verify <country> exists in the response 

    Examples:
    	|country| 
      |India|
      |Sri Lanka|
      |Germany|
