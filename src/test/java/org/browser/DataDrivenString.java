package org.browser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenString {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\DELL\\Documents\\Book2.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(3);
		Cell cell = row.getCell(0);
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
