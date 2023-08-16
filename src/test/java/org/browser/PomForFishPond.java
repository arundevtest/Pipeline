package org.browser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomForFishPond extends BaseClass {

	public PomForFishPond() {
		PageFactory.initElements(driver, this);
			
	}

@FindBy(id="searchbar")
private WebElement searchBox;

public WebElement getSearchBox() {
	return searchBox;
}
	
@FindBy(xpath="//span[@class='search__button-icon flat-icon']")
private WebElement searchSymbol;

@FindBy(xpath="//a[@class='item-block__title-link'])[2]")
private WebElement bookName;

@FindBy(xpath="//button[@class='button-add-to-cart']")
private WebElement addtoCartButton;

@FindBy(xpath="//a[@class='blue_link']")
private WebElement checkOutButtton;

@FindBy(xpath="//a[@class='never-visited-link delete-item']")
private WebElement deleteLink;

@FindBy(xpath="//a[@class='flat-button blue medium']")
private WebElement continueButton;

public WebElement getSearchSymbol() {
	return searchSymbol;
}

public WebElement getBookName() {
	return bookName;
}
public void setBookName(WebElement bookName) {
	this.bookName = bookName;
}

public WebElement getAddtoCartButton() {
	return addtoCartButton;
}


public WebElement getCheckOutButtton() {
	return checkOutButtton;
}


public WebElement getDeleteLink() {
	return deleteLink;
}


public WebElement getContinueButton() {
	return continueButton;
}









































}











    