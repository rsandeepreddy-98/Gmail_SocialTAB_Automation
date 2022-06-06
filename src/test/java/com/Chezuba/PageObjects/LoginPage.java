package com.Chezuba.PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	public WebDriver driver;
	private WebDriverWait webDriverWait;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*For username element*/
	@FindBy(xpath = "//input[@name='identifier']")
	WebElement usernameElement;

	public void getUsername(String username) {
		usernameElement.sendKeys(username);
	}
	
	@FindBy(xpath = "//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qfvgSe qIypjc TrZEUc lw1w4b']")
	WebElement nextBtnElement;
	
	public void getNextButton() {
		//webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(2));
		//webDriverWait.until(ExpectedConditions.elementToBeClickable(nextBtnElement));

		nextBtnElement.click();
		
	}
	
	/*For password*/
	@FindBy(css = "input.whsOnd.zHQkBf")
	WebElement passwordElement;

	public void getPassword(String password) {
		passwordElement.sendKeys(password);
	}
	
	/*For nextButton*/
	@FindBy(xpath = "//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qfvgSe qIypjc TrZEUc lw1w4b']")
	WebElement nextButtonElement2;
	
	public void getNextButtonElement2() {
		nextButtonElement2.click();
		webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		webDriverWait.until(ExpectedConditions.elementToBeClickable(nextButtonElement2));
	}
	
}

