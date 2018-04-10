package com.invigorate.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.invigorate.base.TestBase;
import com.invigorate.pages.HomePage;
import com.invigorate.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage(); 
	}
	
	@Test(priority=1)
	public void alveoLogoImageTest() {
		boolean flag = loginPage.validateAlveoLogo();
		Assert.assertTrue(flag);
	} 
	
	@Test(priority=2)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("emailId"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
