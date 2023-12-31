package org.browser;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenAllString {

	
	public static void main(String[] args) throws IOException {
		
 File file = new File("C:\\Users\\DELL\\Documents\\Book2.xlsx");
 FileInputStream stream = new FileInputStream(file);
 Workbook book = new XSSFWorkbook(stream);
 Sheet sheet = book.getSheet("Sheet1");
 
 for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
	 
	Row row = sheet.getRow(i);
	
	for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
		
		Cell cell = row.getCell(j);
		
		//To find the cell type - If its numeric or string
		
		CellType cellType = cell.getCellType();
	switch (cellType) {
	case STRING:
		
		String stringCellValue = cell.getStringCellValue();
		System.out.print(stringCellValue+ "\t");
			break;

	default:
		
		double numericCellValue = cell.getNumericCellValue();
		
		long l = (long)numericCellValue;
		System.out.print(l);
		break;
		
	}
		
		

	
		
	}

	
	System.out.println();
	
	}
		
		
		
		
		
		
		
	}
}