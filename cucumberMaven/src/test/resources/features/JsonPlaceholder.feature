Feature: Json Place holder API testing

  Scenario Outline: User Creation and Deletion
    Given User is created with user id <userId> user title <userTitle> and user body <userBody>
    Then verify user details <userId>
    And delete the user id <userId>

    Examples: 
      | userId | userTitle    | userBody          |
      |      1 | Author one   | Author body one   |
      |      3 | Author two   | Author body two   |
      |      3 | Author three | Author body three |
