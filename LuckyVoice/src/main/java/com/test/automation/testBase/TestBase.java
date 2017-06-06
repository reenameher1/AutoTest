package com.test.automation.testBase;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public WebDriver driver;
	String url = "https://www.luckyvoicekaraoke.com";
	String browser = "chrome";

	public void init() {
		selectBrowser(browser);
		getUrl(url);
		// String log4jConfPath = "log4j.properties";
		// PropertyConfigurator.configure(log4jConfPath);
	}

	public void selectBrowser(String Browser) {
		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			driver = new ChromeDriver();

		}
	}

	public void getUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

}
