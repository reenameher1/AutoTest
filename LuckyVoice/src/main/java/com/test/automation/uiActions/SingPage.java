package com.test.automation.uiActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.automation.testBase.TestBase;

/**
 * @author reena meher
 *
 */

public class SingPage extends TestBase {
	
	WebDriver driver;
	
	@FindBy(css="#navigation>nav>ul>li:nth-of-type(2)>a")
	WebElement appTab;

	public SingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
public void clickOnAppTab(){
		appTab.click();

}

}