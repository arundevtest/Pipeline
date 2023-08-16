package org.browser;

import org.openqa.selenium.WebElement;

public class Checkiing extends BaseClass {


	
	public static void main(String[] args) throws InterruptedException {
		AmazonPOM po = new AmazonPOM();
		initializeDriver("Chrome");
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(9000);
	    WebElement searchBox = po.getSearchBox();
	    searchBox.sendKeys("Samsung");
	}
	
}
