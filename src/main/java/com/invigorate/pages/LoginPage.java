package com.invigorate.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.invigorate.base.TestBase;

public class LoginPage extends TestBase{
	
	//page Factory - OR
	@FindBy(name="email")
	WebElement Email;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement loginButton;
	
	@FindBy(xpath="//img[contains(@class,'text-center')]")
	WebElement AlveoLogo;
	
	//Initializing the page object
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Action
	public boolean validateAlveoLogo() {
		return AlveoLogo.isDisplayed();
	}
	
	public HomePage login(String email, String pwd) {
		Email.sendKeys(email);
		Password.sendKeys(pwd);
		loginButton.click();
		
		return new HomePage();
	}
	

}
