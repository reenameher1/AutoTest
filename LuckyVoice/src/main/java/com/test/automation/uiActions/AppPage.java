package com.test.automation.uiActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.automation.testBase.TestBase;

/**
 * 
 * @author Reena Meher
 *
 */
public class AppPage extends TestBase{
	

	WebDriver driver;
	
	@FindBy(css="#nav-account>span")
	WebElement User;
	
	public AppPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnUser(){
		User.click();
	}

}
