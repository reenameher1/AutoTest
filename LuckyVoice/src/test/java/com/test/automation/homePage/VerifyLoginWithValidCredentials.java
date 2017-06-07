package com.test.automation.homePage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.automation.testBase.TestBase;
import com.test.automation.uiActions.HomePage;

public class VerifyLoginWithValidCredentials extends TestBase{
	
	HomePage homePage;
	
	@BeforeClass
	public void setUp(){
		init();
	}
	
	@Test
	public void verifyLoginWithValidCredentials(){
		homePage = new HomePage(driver);
		homePage.clickOnLogin();
		homePage.loginToApp("test@test.luckyvoice.com", "Abcd1234");
		
		Assert.assertTrue(homePage.getValidLoginText().contains("Playlists"));	
	}
	
	@AfterClass
	public void endTest(){
		driver.close();
	}
}
