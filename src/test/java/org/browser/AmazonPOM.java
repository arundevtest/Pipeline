package org.browser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPOM extends BaseClass{
	
	public AmazonPOM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="twotabsearchtextbox")
	private WebElement searchBox;

	public WebElement getSearchBox() {
		return searchBox;
	}
	
	
	@FindBy(id="nav-search-submit-button")
	private WebElement searchSymbol;

	public WebElement getSearchSymbol() {
		return searchSymbol;
	}
	
	@FindBy(xpath="((//span[@class='a-size-medium a-color-base a-text-normal'])[3]")
	private WebElement samsungMobiles23;
	
	public WebElement getSamsungMobiles23() {
		return samsungMobiles23;
	}

	@FindBy(id="add-to-cart-button")
	private WebElement addToCartButton;

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}
	
	@FindBy(xpath="//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")
	private WebElement cartButton;

	public WebElement getCartButton() {
		return cartButton;
	}
	
	@FindBy(xpath="(//input[@data-action='delete'])[1]")
	private WebElement deleteLink;

	public WebElement getDeleteLink() {
		return deleteLink;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
