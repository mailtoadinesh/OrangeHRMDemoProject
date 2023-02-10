Feature: This feature is to test login functionality of OrangeHRM page

  #Background: List of steps run before each of the scenarios
  #Given user launch the browser
  @LoginWithValidCredentials
  Scenario: Validate OrangeHRM with valid credentials
    Given user launches OrangeHRM page
    Then validate user is on login page
    When user enters username and password and clicks on login button
    Then user able to see home page of OrangeHRM


  @loginWithDifferentCredentials
  Scenario Outline: Validate OrangeHRM with different valid inputs
    Given user launches OrangeHRM page
    Then validate user is on login page
    When user enters "<username>" and "<password>" and clicks on login button
    Then user able to see home page of OrangeHRM

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Admin    | admin123 |
      | Admin    | admin123 |
      | Admin    | admin123 |


