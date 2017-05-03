package watch2;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider23 {

	public static WebDriver driver;
	
	@DataProvider(name="TestData")
	public Object[][] getData()
	{
		Object[][] data = new Object[2][2];
		
		data[0][0]="tstchennai16@gmail.com";
		data[0][1]="thestreet";
		
		data[1][0]="user2";
		data[1][1]="password2";
		
		return data;
		
	}
	
	@Test(dataProvider="TestData")
	public void DataProvider1(String username, String password) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Java/demo1/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.navigate().to("https://www.linkedin.com");
	    
		driver.findElement(By.id("login-email")).clear();
        driver.findElement(By.id("login-email")).sendKeys(username);	
        driver.findElement(By.id("login-password")).clear();
        driver.findElement(By.id("login-password")).sendKeys(password);
        driver.findElement(By.id("login-submit")).click();
		
	}
		
	

}
