package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import hooks.BasePage;

public class ReadExcel extends BasePage{
	
	public static String[][] fetchdata(String sheet) throws IOException {
			
		XSSFWorkbook wBook = new XSSFWorkbook("./data/Lead.xlsx");
		XSSFSheet ws = wBook.getSheet(sheet);
		int rows = ws.getLastRowNum();
		System.out.println(rows);
		short cells = ws.getRow(0).getLastCellNum();
		System.out.println(cells);		
		String[][] data = new String[rows][cells];
		for (int i = 1; i <= rows; i++) {
			XSSFRow row = ws.getRow(i);
			for (int j = 0; j < cells; j++) {
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
				data[i-1][j] = cellValue;
			}
		}
		wBook.close();		
		return data;
	}
}
	