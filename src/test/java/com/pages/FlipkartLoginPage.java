package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.core.BaseTest;
import com.methods.WrapperMethods;

public class FlipkartLoginPage extends BaseTest {
	
	public FlipkartLoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//input[@id='identifierId']")
	public WebElement userName;
	
	@FindBy(xpath = "//input[@id='identifierNext']/")
	public WebElement userNamebutton;
	
	@FindBy(xpath = "//input[@id='password']/div[1]/div/div[1]/input/")
	public WebElement Password;
	
	@FindBy(xpath = "//input[@id='passwordNext']/content/span")
	public WebElement Passwordbutton;

public static void login1(String Username, String Password) {
		
		
		Username(Username);
		WIApageelements1.userNamebutton.click();
		Password(Password);
		WIApageelements1.Passwordbutton.click();
		
		
	}
	
	
	
	public static void Username(String Username) {
		WrapperMethods.sendkeys(Username);
		
	}
	
	public static void Password(String Password) {
		
		WIApageelements.password.sendKeys(Password);
	}
	
//	@FindBy(xpath = "//input[@class='login-password']")
//	public WebElement password;
//
//	@FindBy(xpath = "//input[@class='login submit-button']")
//	public WebElement click_login_button;
//
}
