package com.orangeHrm.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangeHrm.utilities.PropertyReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmBaseClass {
	
	public static WebDriver driver;

	public static void launchbrowser() throws Exception 
	{
//		if(driver==null)
//		{
			PropertyReader prop = new PropertyReader();
			String browserName = prop.readBrowserName("browser");
			if (browserName.equalsIgnoreCase("Chrome")) 
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			} 
			else if (browserName.equalsIgnoreCase("firefox")) 
			{
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} 
			else if (browserName.equalsIgnoreCase("Edge")) 
			{
				WebDriverManager.iedriver().setup();
				driver = new EdgeDriver();
			} else 
			{
				System.out.println("Browser value not found");
			}
			
//			driver.manage().window().maximize();
////			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		}
		
	}
	
	public void maximize()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public void titleOfThePage() {
		driver.getTitle();
	}
	


	public void ClickElementWait(WebElement clickElement) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(clickElement));
	}
	
	public WebElement getElementByName(String value) {
		return driver.findElement(By.name(value));
	}
	
	public WebElement getElementByXpath(String value) {
		return driver.findElement(By.xpath(value));
	}

	public WebElement getElementById(String value) {
		return driver.findElement(By.id(value));
	}

	public WebElement getElementByClassName(String value) {
		return driver.findElement(By.className(value));
	}

	public WebElement getElementByTagName(String value) {
		return driver.findElement(By.tagName(value));
	}

	public WebElement getElementByLinkText(String value) {
		return driver.findElement(By.linkText(value));
	}

	public WebElement getElementByPartialLinkText(String value) {
		return driver.findElement(By.partialLinkText(value));
	}
	
	public void takeScreenshot() throws IOException{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dst=new File("/Users/mailt/Desktop/Sample_Code/OrangeHRMPractiseCucumber/Screenshot/screenshotfile.jpg");
		FileHandler.copy(src, dst);
			
	}
	
	public static void closeBrowser()
	{
		driver.quit();
	}

}
