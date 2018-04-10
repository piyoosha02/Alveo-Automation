package com.invigorate.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.invigorate.base.TestBase;

public class HomePage extends TestBase{
	
	//page Factory - OR
	@FindBy(xpath="//i[text()='add']")
	WebElement AddUser;

	@FindBy(xpath="//div[@class='checkbox']//label[contains(text(),\"Active\")]")
	WebElement FilterActiveUser;
	
	@FindBy(xpath="//div[@class='checkbox']//label[contains(text(),\"Inactive\")]")
	WebElement FilterInactiveUser;
	
	@FindBy(xpath="//div[@class='checkbox']//label[contains(text(),\"Pending\")]")
	WebElement FilterPendingUser;
	
	@FindBy(xpath="//div[@class='checkbox']//label[contains(text(),\"Suspended\")]")
	WebElement FilterSuspendedUser;
	
	@FindBy(xpath="//span[contains(text(), 'Client')]")
	WebElement ClientPage;
	
	@FindBy(xpath="//span[contains(text(), 'Payer')]")
	WebElement PayerPage;
	
	@FindBy(xpath="//span[contains(text(), 'Vendor')]")
	WebElement VendorPage;
	
	@FindBy(xpath="//span[contains(text(), 'Notification')]")
	WebElement NotificationPage;
	
	//Initializing the page object
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
    //Action
		
		public AddNewUser addUserPage() {
			AddUser.click();
			return new AddNewUser();
		}
		
		public void filterActiveUser() {
			FilterActiveUser.click();
			}
		
		public void filterInactiveUser() {
			FilterInactiveUser.click();
			}
		
		public void filterPendingUser() {
			FilterPendingUser.click();
			}
		
		public void filterSuspendedUser() {
			FilterSuspendedUser.click();
			}
}
