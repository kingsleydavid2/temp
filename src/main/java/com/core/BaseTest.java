package com.core;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

//import com.pages.FlipkartLoginPage;
import com.pages.LinikedInLoginPage;

public class BaseTest {

	public static WebDriver driver;
	public static LinikedInLoginPage WIApageelements;
	//public static FlipkartLoginPage WIApageelements1;

	@BeforeSuite
	public void beforeSuite() throws IOException {
	
		   System.setProperty("webdriver.chrome.driver", "C:/Java/demo1/chromedriver.exe");
		    driver = new ChromeDriver();
			WIApageelements = new LinikedInLoginPage();
			//WIApageelements1 = new FlipkartLoginPage();
			

			}

	@AfterSuite
	public void afterSuite() throws IOException {
		
		
		
			driver.quit();
		
	}

}
