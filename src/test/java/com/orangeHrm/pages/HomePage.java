package com.orangeHrm.pages;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangeHrm.base.OrangeHrmBaseClass;

public class HomePage {
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	OrangeHrmBaseClass commonmethods =new OrangeHrmBaseClass();

	@FindBy(xpath = "//h6[text() = 'Dashboard']")
	WebElement dashboardText;
	
	@FindBy(xpath = "//span[text()='Admin']")
	WebElement adminLink;

	public void validateHomePage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(dashboardText));
		Assert.assertEquals(dashboardText.getText(), "Dashboard");
	}
	
	public void clickElement(String value)  
	{
		commonmethods.getElementByXpath("//span[text()='"+value+"']").click();

	}
	
	public void clickHyperlinkElement(String value)  
	{
		commonmethods.getElementByXpath("//a[text()='"+value+"']").click();

	}
	
	public void ClickPanelLink(String value)  
	{
		commonmethods.getElementByXpath("//span[text()='"+value+"']").click();

	}

}
