package com.orangeHrm.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHrm.base.OrangeHrmBaseClass;

public class LoginPage {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	OrangeHrmBaseClass baseMethods = new OrangeHrmBaseClass();

	@FindBy(name = "username")
	WebElement LoginUsername;

	@FindBy(name = "password")
	WebElement LoginPassword;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement SubmitButton;

	public void launchPage() throws Exception {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		baseMethods.maximize();
	}

	public void validateUserOnLoginPage() {
		WebElement title = driver.findElement(By.xpath("//h5[text()='Login']"));
		Assert.assertTrue(title.isDisplayed());
	}

	public void enterCredentials() {
		baseMethods.getElementByName("username").sendKeys("Admin");
		baseMethods.getElementByName("password").sendKeys("admin123");
		baseMethods.getElementByXpath("//button[@type='submit']").click();
	}

	public void enteruserdata(String username, String password) {
		LoginUsername.sendKeys(username);
		LoginPassword.sendKeys(password);
		SubmitButton.click();
	}

}
