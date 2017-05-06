package com.methods;

import org.openqa.selenium.WebElement;

import com.core.BaseTest;

public class WrapperMethods extends BaseTest {

	public static void sendkeys(String value) {
		WIApageelements.userName.sendKeys(value);
		//WIApageelements1.userName.sendKeys(value);
		
	}
	
	public static boolean elementfoundornot(WebElement element){
		 
		 boolean king =element.isEnabled();
		 return king;
	}
	
}