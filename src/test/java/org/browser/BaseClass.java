package org.browser;

import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.base.CaseFormat;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

	public static WebDriver driver;


	public static String readExcelData(int rowIndex, int cellIndex) {
		
		String value = null;
		
		try {
			
			File file = new File("C:\\Users\\DELL\\Documents\\Book2.xlsx");
			
			FileInputStream stream = new FileInputStream(file);
			
			Workbook book = new XSSFWorkbook(stream);
			
			Sheet sheet = book.getSheet("Sheet1");
			
			 Row row = sheet.getRow(rowIndex);
			
			Cell cell = row.getCell(cellIndex);
			
			CellType cellType = cell.getCellType();
			
			switch (cellType) {
			case STRING:
				
				value = cell.getStringCellValue();
				
				break;

			default:
				if (DateUtil.isCellDateFormatted(cell)) {
					
					Date dateCellValue = cell.getDateCellValue();
					
					SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
					
					value = s.format(dateCellValue);
					
					
				} else {
					
					double numericCellValue = cell.getNumericCellValue();
					long l = (long)numericCellValue;
					BigDecimal valueOf = BigDecimal.valueOf(l);// 
					value = valueOf.toString();

				}
				
				break;
			}
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return value;
	}
	
	//public static WebDriver driver;	
	
	public static void initializeDriver(String browser) {

		switch (browser) {
		case "Chrome":
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
			
		case "Edge":
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		    break;

		case "Firefox":
		    
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		
		break;
		        
		    
		default: 
			
			System.out.println("Driver not initialized");
			
			break;
		}
		
		
	}

	
	public static void getUrl(String url) {

		driver.get(url);
	}
	
	public static void idSendKeys(WebElement element, String keysToSend) {
		
		element.sendKeys(keysToSend);

	}
	
		public static void xpathSendKeys(WebElement element, String keysToSend) {
        
        element.sendKeys(keysToSend);
					
			
		}
		
		
		public static void clickButton(String locator,String attributeValue,String xpathExpression) {
			
			if (locator=="id") {
				
				WebElement element = driver.findElement(By.id(attributeValue));
				element.click();
			}else if(locator=="xpath") {
				WebElement element1 = driver.findElement(By.xpath(xpathExpression));
				element1.click();
				
			}
		
			
			}
		
		public static void clickButtonNew(String locator, String idValue , String xpathExpression ) {
			
			switch (locator) {
			case "ID":
				WebElement element = driver.findElement(By.id(idValue));
				element.click();
				
				
				break;

			default:
				WebElement element1 = driver.findElement(By.xpath(xpathExpression));
				element1.click();
				
				break;
			}

		}
		
		
		public static void selectByIndexId(WebElement element, int index) {

			
			Select s = new Select(element);
			s.selectByIndex(index);
			
			
		}
		
		public static void selectByValueId(WebElement refName, String value) {

			Select s = new Select(refName);
			s.selectByValue(value);
	
		
		
		}
		
		
		public static void selectByTextId(WebElement element, String value) {

			
			Select s = new Select(element);
			s.selectByVisibleText(value);
		
	}
		
		
		public static void selectByIndexXpath(String xpathExpression, int index) {

			WebElement element = driver.findElement(By.xpath(xpathExpression));
			Select s = new Select(element);
			s.selectByIndex(index);
		
		}

	
		
		public static void selectByValueXpath(String xpathExpression, String value) {

			WebElement element = driver.findElement(By.xpath(xpathExpression));
			Select s = new Select(element);
			s.selectByValue(value);
		}
	
		public static void selectByTextXpath(String xpathExpression, String value) {

			WebElement element = driver.findElement(By.xpath(xpathExpression));
			Select s = new Select(element);
			s.selectByVisibleText(value);
	
 }

		public static void clearAndSendKeys(WebElement element, String keysToSend) {

			
			element.clear();
			element.sendKeys(keysToSend);
		}
			
			
		public static void sleep(int sec) {

			try {
				Thread.sleep(sec); 
			} catch (Exception e) {
				// TODO: handle exception
			}
		}	
			
}
		
		
		
	

	
	
	
	
	
	
	
	













































































































































































