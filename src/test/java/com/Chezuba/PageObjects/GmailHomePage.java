package com.Chezuba.PageObjects;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class GmailHomePage {

	public WebDriver driver;
	Actions actions;
	public GmailHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "input[name='q']")
	WebElement mailSearchElement;
	public void wantedElement() throws InterruptedException {
		
		mailSearchElement.sendKeys("hello");
		
		
	}
	
	/*For identifying compose button*/
	@FindBy(xpath = "//div[@class='T-I T-I-KE L3']")
					
	WebElement composeElement;
	public void getComposeElement() {
		composeElement.click();
	}
	
	/*To addrress*/
	@FindBy(xpath = "//textarea[@name='to']")
	WebElement toElement;
	
	public void getToElement(String toAddress) {
		toElement.sendKeys(toAddress);
	}
	
	/*For subjectText box*/
	@FindBy(xpath = "//input[@name='subjectbox']")
	WebElement subjectElement;
	
	public void getsubject(String subject) {
		subjectElement.sendKeys(subject);
	}
	
	/*Entering the text into bodyof email*/
	@FindBy(xpath = "//div[@class='Am Al editable LW-avf tS-tW']")
	WebElement bodyElement;
	
	public void getBodyElement(String body) {
		bodyElement.sendKeys(body);
	}
	
	/*For clicking on More option icon ...*/
	@FindBy(xpath = "//div[@aria-label='More options']")
	WebElement threeDotsOption;
	
	public void getThreeDots() {
		threeDotsOption.click();
	}
	
	@FindBy(xpath = "//div[text()='Label']")
	WebElement labelElement;
	
	public void getLabelElement() {
		//driver.switchTo().frame(labelElement);
		actions = new Actions(driver);
		actions.moveToElement(labelElement);
		labelElement.click();
	}
	
	@FindBy(xpath = "//div[@title='Social']//div[@class='J-LC-Jo J-J5-Ji']")
	WebElement socialElement;
	
	public void getSocialElement() {
		socialElement.click();
	}
	
	/*For directly adding star element*/
	@FindBy(xpath = "//div[@class='zd SFI2Md Lk bi4']")
	WebElement directStartElement;
	
	public void getDirectStarelement() {
		directStartElement.click();
	}
	
	/*For clicking on Apply button*/
	@FindBy(xpath = "//div[text()='Apply']")
	WebElement applyButtonElement;
	public void getClickonAplyElement() {
		applyButtonElement.click();
	}
	
	/*For Clicking on send button*/
	@FindBy(xpath = "//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")
	WebElement sendButtonElement;
	
	public void getSendButtonElement() {
		sendButtonElement.click();
	}
	
	/*Refresh the button*/
	@FindBy(xpath = "//div[@class='asf T-I-J3 J-J5-Ji']")
	//@FindBy(xpath = "//div[@class='asa']")
	WebElement refreshElement;
	
	public void getRefreshElement() {
		refreshElement.click();
	}
	
	/*For Clicking on Social element tab*/
	@FindBy(xpath = "//div[text()='Social']")
	WebElement socialTabElement;
	
	public void getSocialElementTab() {
		socialTabElement.click();
	}
	
	/*For starring the email*/
	@FindBy(xpath = "//tbody/tr[@id=':p9']/td[3]")
	
	WebElement starredIconElement;
	
	public void getStarredElement() {
		starredIconElement.click();
	}
	
	/*For clicking on mail element*/
	@FindBy(xpath = "//tr[@jsmodel='nXDxbd']")
	WebElement mailClickElement;
	
	public void getEmailClickElement() {
		mailClickElement.click();
	}
	
	/*For Finding the text subject */
	@FindBy(xpath = "//h2[@class='hP']")
	WebElement subjectTextElement;
	
	public void getSubjectTextElement(String subjectTextFind) {
		if(subjectElement.getText().equalsIgnoreCase(subjectTextFind)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}

}
