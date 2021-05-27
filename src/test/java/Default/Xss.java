package Default;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xss {
	
	
	public void excelData() throws IOException {
		
		FileInputStream fis = new FileInputStream("C://Users//Admin//Desktop//Book2.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		System.out.println(workBook.getNumberOfSheets());
		
		System.out.println("hi this is the change made by master");
		System.out.println("hi this is the change made by first not by master");
		
		
		System.out.println("hi this is the change made by master master");
		System.out.println("hi this is the change made by first not by master master");
	}
	
	

}
