package com.test.automation.settingsPage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
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
import com.test.automation.uiActions.AppPage;
import com.test.automation.uiActions.HomePage;
import com.test.automation.uiActions.SettingsPage;
import com.test.automation.uiActions.SingPage;

public class VerifyPostCodePresent extends TestBase {
	
	HomePage homePage;
	AppPage appPage;
	SingPage singPage;
	SettingsPage settingsPage;
	
	
	@BeforeMethod
	@BeforeClass
	public void setUp(){
		init();
	}
	
	@Test
	public void verifyPostCodePresent_Test(){
		homePage = new HomePage(driver);
		appPage = new AppPage(driver);
		singPage = new SingPage(driver);
		settingsPage = new SettingsPage(driver);
		
		homePage.clickOnLogin();
		homePage.loginToApp("test@test.luckyvoice.com", "Abcd1234");
		singPage.clickOnAppTab();
		appPage.clickOnUser();
		String postcode = null;
		AssertJUnit.assertEquals(settingsPage.getPostcode(postcode), "W1W 8DH");
				
	}
	
	@AfterClass
	public void endTest(){
		driver.close();
	}

}
