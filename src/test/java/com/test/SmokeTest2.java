package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.core.BaseTest;
import com.pages.FlipkartLoginPage;
import com.pages.LinikedInLoginPage;

public class SmokeTest2 extends BaseTest {

	
	
	@Test
	public void test1() throws InterruptedException, IOException
	{
		driver.navigate().to("http://linkedin.com");
		String data0 = null;
		String data1 = null;
		LinikedInLoginPage.login(data0, data1);
		//LinikedInLoginPage.login("tstchennai16@gmail.com", "thestreet");
		//driver.navigate().to("http://www.thestreet.com");
			//	TheStreetLoginPage.login("qauser", "Cr@m3r");
		
				LinikedInLoginPage.checkbox();	
				
				driver.navigate().to("https://accounts.google.com/signin/v2/identifier");
				Thread.sleep(3000);
				FlipkartLoginPage.login1("kingsleydavid7@gmail.com", "kingdave123");
				
	
		// driver.navigate().to("http://linkedin.com");
		//WIApageelements.userName.sendKeys("tstchennai16@gmail.com");"
		
		
		//Common.sendkeys(WIApageelements.userName, 10, "tstchennai16@gmail.com");
		
		
		//Common.sendkeys(WIApageelements.password, 10, "thestreet");
		//WIApageelements.click_login_button.click();
		//Thread.sleep(3000);
		
	}
		 
	public void ReadExcel1() throws IOException {

		
			
			File src = new File("C:\\DDF\\Login.xlsx");
		
			FileInputStream fis = new FileInputStream(src);
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			XSSFSheet sheet1 = wb.getSheetAt(0);
			
			double data0 = sheet1.getRow(0).getCell(0).getNumericCellValue();
			
			System.out.println("Data from Excel is " + data0);
			
			double data1 = sheet1.getRow(0).getCell(1).getNumericCellValue();
			
		 wb.close();
		}
		
		
	
	}