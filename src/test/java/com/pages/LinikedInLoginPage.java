package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.core.BaseTest;
import com.methods.WrapperMethods;

public class LinikedInLoginPage  extends BaseTest {

	public LinikedInLoginPage () {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@class='login-email']")
	public WebElement userName;

	@FindBy(xpath = "//input[@class='login-password']")
	public WebElement password;

	@FindBy(xpath = "//input[@class='login submit-button']")
	public WebElement click_login_button;
	
	@FindBy(xpath = "//button[@class='nav-search-button']")
	public WebElement Searchbox;
	
	public static void login(String Username, String Password) {
		
		
		Username(Username);
		Password(Password);
		WIApageelements.click_login_button.click();
		
		
	}
	
	public static void checkbox() throws InterruptedException{
		Thread.sleep(5000);
		
		if (WIApageelements.Searchbox.isEnabled()) {
			
			System.out.println("Search is preesnt");
		}
		else {
		System.out.println("Search is not preesnt");	
		}
	}
	
	public static void Username(String Username) {
		WrapperMethods.sendkeys(Username);
		
	}
	
	public static void Password(String Password) {
		
		WIApageelements.password.sendKeys(Password);
	}
	
}