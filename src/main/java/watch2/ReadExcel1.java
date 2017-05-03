package watch2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static void main(String[] args) throws IOException{
		
		File src = new File("C:\\DDF\\Login.xlsx");
	
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		double data0 = sheet1.getRow(0).getCell(0).getNumericCellValue();
		
		System.out.println("Data from Excel is " + data0);
		
		
	
		
		
	 wb.close();
	}
	
	
}
