package com.test.automation.uiActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	@FindBy(css="#nav-account")
	WebElement logIn;
	
	@FindBy(css="#id_email")
	WebElement emailId;
	
	@FindBy(css="#id_password")
	WebElement loginPassword;
	
	@FindBy(css=".btn")
	WebElement submitButton;
	
	@FindBy(css=".playlist-selector>label>em")
	WebElement playlistSelector;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLogin()
	{
		logIn.click();
		
	}
	
	public void loginToApp(String email, String password){
		
		
		emailId.sendKeys(email);
		loginPassword.sendKeys(password);
		submitButton.click();
	} 
	
	public String getValidLoginText(){
		return playlistSelector.getText();
	}
}
