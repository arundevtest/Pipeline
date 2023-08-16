package org.browser;

import org.openqa.selenium.WebElement;

public class FishPondusingBaseclassandPom extends BaseClass {

	public static void main(String[] args) {
		
		PomForFishPond pom = new PomForFishPond();
		initializeDriver("Chrome");
		getUrl("https://www.fishpond.co.in/");
		
		WebElement searchBox = pom.getSearchBox();
		searchBox.sendKeys("The Adventures of Tom Sawyer");
		
		WebElement searchSymbol = pom.getSearchSymbol();
		searchSymbol.click();
		
		WebElement bookName = pom.getBookName();
		bookName.click();
		
		WebElement addtoCartButton = pom.getAddtoCartButton();
		addtoCartButton.click();
		
		WebElement checkOutButtton = pom.getCheckOutButtton();
		checkOutButtton.click();
		
		WebElement deleteLink = pom.getDeleteLink();
		deleteLink.click();
		
		WebElement continueButton = pom.getContinueButton();
		continueButton.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
