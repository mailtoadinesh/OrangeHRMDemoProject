package com.orangeHrm.pages;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	
	private WebDriver driver;

	public AdminPage(WebDriver driver )
	{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	public void countVerify()
	{
		List<WebElement> count=driver.findElements(By.xpath("oxd-table-card"));
		ArrayList actcount=new ArrayList();
		for(WebElement ele:count)
		{
			actcount.add(ele.getText());
		}
		System.out.println(actcount.size());
		
		String expcount =driver.findElement(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//span[@class='oxd-text oxd-text--span']")).getText();
		System.out.println(expcount.replaceAll("[^ 0-9]", ""));
		Assert.assertEquals(expcount, actcount);
	}

}
