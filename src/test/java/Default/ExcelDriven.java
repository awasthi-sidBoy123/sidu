package Default;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDriven {


	public ArrayList<String> getData(String TestCaseName) throws IOException {

		ArrayList<String> arr = new ArrayList<String>();

		FileInputStream fis = new FileInputStream("C://Users//Admin//Desktop//Book1.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(fis);

		// Mark:- To get the count of sheets
		int sheet = workBook.getNumberOfSheets();
		System.out.println(sheet);
		for (int i = 0; i < sheet; i++) {
			if (workBook.getSheetName(i).equalsIgnoreCase("Sheet1")) {

				XSSFSheet sheeet = workBook.getSheetAt(i);
				Iterator<Row> rows = sheeet.iterator();
				Row firstRow = rows.next();
				Iterator<Cell> ce = firstRow.cellIterator();
				int column = 0;
				int k = 0;

				while (ce.hasNext()) {
					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase("TestCases")) {
						// Mark:- Here we grabed the cell number where testcase is present
						column = k;
					}
					k++;
				}

				while (rows.hasNext()) {
					Row r = rows.next();
					// Mark:- In that row now we will look for the particular user means now we are
					// searching the rows of that particular cell or column
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(TestCaseName)) {

						// Mark:- After getting the user name we will go for the password and other
						// values of that row. So we will use cell iterator to go
						// in those columns
						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {
							Cell val = cv.next();
							// Mark:- To check if the value is numeric or of which type
							if (val.getCellType() == CellType.STRING) {
								arr.add(val.getStringCellValue());
							} else {
								arr.add(NumberToTextConverter.toText(val.getNumericCellValue()));
							}

						}
					}

				}
			}
		}
		return arr;
	}

}
