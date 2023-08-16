package org.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebsiteLaunch {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\ProcrureWise\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
	
	
	}
	
	
	
}
