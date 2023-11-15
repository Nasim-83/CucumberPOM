package com.crm.pages;





import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.utilities.TestBase;

public class LoginPage extends TestBase{
	
	
	public LoginPage() {
		PageFactory.initElements(driver, LoginPage.class);
	}
	@FindBy(name="username")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//input[@type=\"submit\"]")
	WebElement login;
	@FindBy(xpath="//a[contains(text(),\"Sign Up\")]")
	WebElement signup;
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmlogo;

	
	public String validateLoginpage()
	{
		return driver.getTitle();
	}
		public boolean validateCRMimg() {
			return crmlogo.isDisplayed();
		}
		
		public HomePage login(String un,String pwd) throws IOException
		{
			username.sendKeys(un);
			password.sendKeys(pwd);
			login.click();
		return new HomePage();
		}
		
}
