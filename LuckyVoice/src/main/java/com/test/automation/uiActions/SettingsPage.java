/**
 * 
 */
package com.test.automation.uiActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.automation.testBase.TestBase;

/**
 * @author reenameher
 *
 */
public class SettingsPage extends TestBase{
	

	WebDriver driver;
	
	@FindBy(css="#id_postcode")
	WebElement postCode;

	@FindBy(css=".btn.btn-salmon")
	WebElement logOut;
	
	public SettingsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public String getPostcode(String postcode){
		return postcode=postCode.getText();
		
		}

	}
