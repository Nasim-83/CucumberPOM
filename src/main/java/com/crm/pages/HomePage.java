package com.crm.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.crm.utilities.TestBase;

public class HomePage extends TestBase {

	public HomePage() throws IOException {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//td[contains(text(),'User: Nasim shaikh ')]")
	WebElement userNameLabel;

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contactLinkElement;

	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement dealLink;

	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement taskLink;

	
	@FindBy(xpath = "//input[@value='New Contact']")
	WebElement newContactLink;
	
	public String verifyHomePageTitle () {
		return driver.getTitle();
	}
	
	
	public boolean verifyCorrectUserName() {
	return	userNameLabel.isDisplayed();
		
	}
	
	
	public void clickOnNewContactLink() throws InterruptedException
	{
//		Actions action=new Actions(driver);
//		action.moveToElement(contactLinkElement).build().perform();
		Thread.sleep(5000);
		newContactLink.sendKeys(Keys.ENTER);
	}
}
