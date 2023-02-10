package com.orangeHrm.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.orangeHrm.base.OrangeHrmBaseClass;
import com.orangeHrm.pages.LoginPage;
import com.orangeHrm.utilities.PropertyReader;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStepDfn {
	//WebDriver driver;
	LoginPage lp=new LoginPage(OrangeHrmBaseClass.driver);
	
	
	@Given("user launches OrangeHRM page")
	public void user_launches_orange_hrm_page() throws Exception {
		lp.launchPage();
	}
	
	@Then("validate user is on login page")
	public void validate_user_is_on_login_page() {
		lp.validateUserOnLoginPage();
	}
	
	@When("user enters username and password and clicks on login button")
	public void user_enters_username_and_password_and_clicks_on_login_button() {
		lp.enterCredentials();	    
	}
	
	@When("user enters {string} and {string} and clicks on login button")
	public void user_enters_username_and_password_and_clicks_on_login_button2(String username,String password) {
		lp.enteruserdata(username, password);
	}	
		
//	@Then("user able to see home page of OrangeHRM")
//	public void user_able_to_see_home_page_of_orange_hrm() {
//	    System.out.println("User is on HomePage");
//	}
	

}
