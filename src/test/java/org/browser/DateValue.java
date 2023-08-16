package org.browser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;	
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DateValue {

	public static void main(String[] args) throws IOException {

		
		File file = new File("C:\\Users\\DELL\\Documents\\Book2.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(4);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		
		switch (cellType) {
		case STRING:
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue+ "\t");
			
			break;

		default:
			if (DateUtil.isCellDateFormatted(cell)) {
				
				Date dateCellValue = cell.getDateCellValue();
				
				SimpleDateFormat s = new SimpleDateFormat("dd/MMM/yy");
				
				String format = s.format(dateCellValue);
				
				System.out.println(format);
					
				
			} else {
				double numericCellValue = cell.getNumericCellValue();
				long l = (long)numericCellValue;
				System.out.println(l+ "\t");
				
				
			}
				
			break;
		}
		
		
		
		
		
System.out.println();
		
		
		
		
		
		
		
	}

}
