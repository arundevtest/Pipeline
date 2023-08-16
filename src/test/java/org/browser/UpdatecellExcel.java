package org.browser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdatecellExcel {

	public static void main(String[] args) throws IOException {

		
	File file = new File("C:\\Users\\DELL\\Documents\\Custom Office Templates\\Book1.xlsx");
	
	FileInputStream stream = new FileInputStream(file);
	
	Workbook book = new XSSFWorkbook(stream);
	
   Sheet sheet = book.getSheet("Sheet1");	
	
   Row row = sheet.getRow(2);
		
	Cell cell = row.getCell(0);	
		
	CellType cellType = cell.getCellType();
	
	switch (cellType) {
	case STRING:
		String stringCellValue = cell.getStringCellValue();
		
		if (stringCellValue.equals("vasu@gmail.com")) {
			
			cell.setCellValue("bye@gmail.com");
			
			FileOutputStream out = new FileOutputStream(file);
			book.write(out);
			
			
		}
		
		
		
		
		
		
		
		break;

	default:
		break;
	}
		
		
		
		
	}

}
