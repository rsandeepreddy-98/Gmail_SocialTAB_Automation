package com.Chezuba.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.Chezuba.Utilities.ReadConfig;

public class BaseClass {

	WebDriver driver;
	ReadConfig readConfig = new ReadConfig();
	String url = readConfig.getApplicationUrl();
	
	@BeforeClass
	public void setUp() throws InterruptedException {
		/* Here I am writing the browser instantiation code only for chrome*/
		System.setProperty("webdriver.chrome.driver", readConfig.getPath());
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}

