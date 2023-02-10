package com.orangeHrm.stepDefinitions;

import com.orangeHrm.base.OrangeHrmBaseClass;
import com.orangeHrm.pages.AdminPage;

import io.cucumber.java.en.Then;

public class AdminPageStepDfn {
	
	AdminPage Adpage=new AdminPage(OrangeHrmBaseClass.driver);
	
	
	@Then("verify the record count")
	public void validatecount()
	{
		Adpage.countVerify();
	}

}
