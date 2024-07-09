Feature: Register Functionality

  Scenario: Verify that user can register successfully
    Given user navigate to register page
    When  user enters first name
    And   user enters last name
    And   user enters email
    And   user enters password
    And   user enters confirm password
    And   user clicks on register button
    Then  user should register successfully
