package com.test.automation.settingsPage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.automation.testBase.TestBase;
import com.test.automation.uiActions.AppPage;
import com.test.automation.uiActions.HomePage;
import com.test.automation.uiActions.SettingsPage;
import com.test.automation.uiActions.SingPage;

public class VerifyPostCodePresent extends TestBase {
	
	HomePage homePage;
	AppPage appPage;
	SingPage singPage;
	SettingsPage settingsPage;
	
	@BeforeClass
	public void setUp(){
		init();
	}
	
	@Test
	public void verifyPostCodePresent(){
		homePage = new HomePage(driver);
		appPage = new AppPage(driver);
		singPage = new SingPage(driver);
		settingsPage = new SettingsPage(driver);
		
		homePage.clickOnLogin();
		homePage.loginToApp("test@test.luckyvoice.com", "Abcd1234");
		singPage.clickOnAppTab();
		appPage.clickOnUser();
		String postcode;
		Assert.assertEquals(settingsPage.getPostcode(postcode), "W1W 8DH");
				
	}
	
	
	

}