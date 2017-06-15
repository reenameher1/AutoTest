package com.test.automation.homePage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.automation.testBase.TestBase;
import com.test.automation.uiActions.HomePage;

public class VerifyLoginWithValidCredentials extends TestBase{
	
	HomePage homePage;
	
	
	@BeforeMethod
	@BeforeClass
	public void setUp(){
		init();
	}
	
	@Test(priority = 1, description="This test case will verify login functionality")
	public void verifyLoginWithValidCredentials(){
		homePage = new HomePage(driver);
		homePage.clickOnLogin();
		homePage.loginToApp("test@test.luckyvoice.com", "********");
		
		Assert.assertTrue(homePage.getValidLoginText().contains("Playlists"));	
	}
	
	@AfterClass
	public void endTest(){
		driver.close();
	}
}
