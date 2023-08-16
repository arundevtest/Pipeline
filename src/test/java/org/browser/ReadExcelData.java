package org.browser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\DELL\\Documents\\Custom Office Templates\\Saved.xlsx");
		Workbook book = new XSSFWorkbook();
		Sheet createSheet = book.createSheet("Add");
		Row createRow = createSheet.createRow(1);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("gmail");
		FileOutputStream out = new FileOutputStream(file);
		book.write(out);
		
		
		
		
		
		
	}

}
