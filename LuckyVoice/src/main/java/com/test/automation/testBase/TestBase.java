package com.test.automation.testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

/**
 * 
 * @author Reena Meher
 *
 */

public class TestBase {

	public WebDriver driver;
	public Properties OR = new Properties();
	

	public void init() {
		//selectBrowser(browser);
		//getUrl(url);
		System.out.println(OR.getProperty("browser"));
		selectBrowser(OR.getProperty("browser"));
		getUrl(OR.getProperty("url"));
		// String log4jConfPath = "log4j.properties";
		// PropertyConfigurator.configure(log4jConfPath);
	}
	
	public void loadData() throws IOException {
		File file = new File(System.getProperty("user.dir") + "/src/main/java/com/test/automation/uiAutomation/config/config.properties");
		FileInputStream f = new FileInputStream(file);
		OR.load(f);

	}
	public WebDriver getDriver() {
		return driver;
	}
	
	public void setDriver(EventFiringWebDriver driver) {
		this.driver = driver;
	}

	public void selectBrowser(String browser) {
		
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			}

	public void getUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

}
