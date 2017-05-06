package com.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.core.BaseTest;
//import com.pages.FlipkartLoginPage;
import com.pages.LinikedInLoginPage;

public class SmokeTest extends BaseTest {

	
	
	@Test
	public void test1() throws InterruptedException, IOException
	{
		driver.navigate().to("http://linkedin.com");
		LinikedInLoginPage.login("tstchennai16@gmail.com", "thestreet");
		//driver.navigate().to("http://www.thestreet.com");
			//	TheStreetLoginPage.login("qauser", "Cr@m3r");
		
				LinikedInLoginPage.checkbox();	
				
				//driver.navigate().to("https://accounts.google.com/signin/v2/identifier");
				Thread.sleep(3000);
				//FlipkartLoginPage.login1("kingsleydavid7@gmail.com", "kingdave123");
				
		
		// driver.navigate().to("http://linkedin.com");
		//WIApageelements.userName.sendKeys("tstchennai16@gmail.com");"
		
		
		//Common.sendkeys(WIApageelements.userName, 10, "tstchennai16@gmail.com");
		
		
		//Common.sendkeys(WIApageelements.password, 10, "thestreet");
		//WIApageelements.click_login_button.click();
		//Thread.sleep(3000);
		
	}
		 
	}