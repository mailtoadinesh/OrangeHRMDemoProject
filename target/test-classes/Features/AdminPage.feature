Feature: This feature is test whether count matches on Admin page
Background: List of steps run before each of the scenarios
  Given user launches OrangeHRM page
    Then validate user is on login page
    When user enters username and password and clicks on login button
    Then user able to see home page of OrangeHRM
    Then user click on "Admin" link

  @AdminPage
  Scenario Outline: Validate OrangeHRM with valid credentials
    Given user click on "Organization " link
    Then user click on hyper "Locations" link
    Then verify the record count
 