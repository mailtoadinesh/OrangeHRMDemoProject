Feature: This feature is test whether user can click on links in the Home Page Successfully
Background: List of steps run before each of the scenarios
  Given user launches OrangeHRM page
    Then validate user is on login page
    When user enters username and password and clicks on login button

  @HomepageLogin
  Scenario Outline: Validate OrangeHRM with valid credentials
    Given user able to see home page of OrangeHRM
    Then user click on "<LeftPanel>" link
    
 Examples:
      | LeftPanel 		| 
      | PIM    				| 
      | Leave   		  | 
      | Time    			| 
      | Recruitment   | 
      |My Info  			| 
      | Performance		| 
      |Directory  		| 
      |Maintenance  	| 
      |Buzz  					| 
      |Dashboard  		| 
      
      
    @HomepageLogin2
  Scenario: Validate OrangeHRM with valid credentials
    Given user able to see home page of OrangeHRM
    Then user click on Left Panel link
      | Admin 				| 
      | PIM    				| 
      | Leave   		  | 
      | Time    			| 
      | Recruitment   | 
      |My Info  			| 
      | Performance		| 
      |Directory  		| 
      |Buzz  					| 
      |Dashboard  		| 
      
    
