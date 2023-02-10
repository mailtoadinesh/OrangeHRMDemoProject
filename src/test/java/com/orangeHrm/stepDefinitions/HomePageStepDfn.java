package com.orangeHrm.stepDefinitions;



import java.util.List;

import org.openqa.selenium.WebDriver;

import com.orangeHrm.base.OrangeHrmBaseClass;
import com.orangeHrm.pages.HomePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageStepDfn {
	WebDriver driver;
	HomePage homePage = new HomePage(OrangeHrmBaseClass.driver);
	
	@Given("user able to see home page of OrangeHRM")
	public void user_able_to_see_home_page_of_orange_hrm() {
		homePage.validateHomePage();
	}
	
	@Then("user click on {string} link")
	public void user_click_on_admin_link(String value) throws InterruptedException   {
		homePage.clickElement(value);
		Thread.sleep(3000);
	}
	
	@Then("user click on hyper {string} link")
	public void user_click_on_hyper_link(String value) throws InterruptedException   {
		homePage.clickHyperlinkElement(value);
		Thread.sleep(3000);
	}
	
	
	
	@Then("user click on Left Panel link")
	public void user_click_on_Left_Panel_link(DataTable datatable) throws InterruptedException   {
		List<List<String>> data= datatable.asLists();
		for (int i=0;i<data.size();i++)
		{
			homePage.ClickPanelLink(data.get(i).get(0));
			Thread.sleep(3000);
		}
	}

}
