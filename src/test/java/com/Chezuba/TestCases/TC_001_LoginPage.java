package com.Chezuba.TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.Chezuba.PageObjects.GmailHomePage;
import com.Chezuba.PageObjects.LoginPage;

public class TC_001_LoginPage extends BaseClass {
	LoginPage loginPage;
	GmailHomePage gmailHomePage;
	
	
	@Test
	public void gmailLoginCheck() throws Exception {
		loginPage = new LoginPage(driver);
		loginPage.getUsername(readConfig.getUsername());
		Thread.sleep(3000);
		loginPage.getNextButton();
		Thread.sleep(3000);
		loginPage.getPassword(readConfig.getPassword());
		loginPage.getNextButtonElement2();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		gmailHomePage = new GmailHomePage(driver);
		gmailHomePage.getComposeElement();
		gmailHomePage.getToElement(readConfig.getToAddress());
		Thread.sleep(2000);
		gmailHomePage.getsubject(readConfig.getSubjectText());
		Thread.sleep(2000);
		gmailHomePage.getBodyElement(readConfig.getBody());
		gmailHomePage.getThreeDots();
		Thread.sleep(2000);
		gmailHomePage.getLabelElement();
		Thread.sleep(2000);
		gmailHomePage.getSocialElement();
		Thread.sleep(2000);
		gmailHomePage.getDirectStarelement();
		Thread.sleep(2000);
		gmailHomePage.getClickonAplyElement();
		Thread.sleep(2000);
		gmailHomePage.getSendButtonElement();
		Thread.sleep(2000);
		gmailHomePage.getSocialElementTab();
		Thread.sleep(2000);
		gmailHomePage.getEmailClickElement();
		
		if(driver.findElement(By.xpath("//h2[@class='hP']")).getText().equalsIgnoreCase(readConfig.getSubjectText())) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
	}
}
	