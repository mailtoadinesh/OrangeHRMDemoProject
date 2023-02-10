package com.orangeHrm.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\features"
		,glue = {"com.orangeHrm.stepDefinitions"}
//		,tags = "@AdminPage"
		,plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		,monochrome = true
//	    ,dryRun = true
		)	

public class TestRunner {

}
