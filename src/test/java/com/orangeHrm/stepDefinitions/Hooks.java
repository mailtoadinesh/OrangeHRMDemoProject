package com.orangeHrm.stepDefinitions;

import com.orangeHrm.base.OrangeHrmBaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before()
	public void preMethod() throws Exception {
		OrangeHrmBaseClass.launchbrowser();
	}

	@After()
	public  void postMethod()
	{
		OrangeHrmBaseClass.closeBrowser();
	}

}
