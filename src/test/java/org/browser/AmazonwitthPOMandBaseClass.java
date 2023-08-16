package org.browser;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AmazonwitthPOMandBaseClass extends BaseClass{

	
	
	
	@Test
	public static void pageOne() {
		AmazonPOM po = new AmazonPOM();
		initializeDriver("Chrome");
		driver.get("https://www.amazon.in/");
	    WebElement searchBox = po.getSearchBox();
	    searchBox.sendKeys("Samsung");
	}
}
