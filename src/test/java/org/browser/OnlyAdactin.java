package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OnlyAdactin extends BaseClass {

	
	public static void main(String[] args) {

		initializeDriver("Chrome");
		getUrl("https://adactinhotelapp.com/");
		sleep(5000);
		

		NewPOM pom = new NewPOM();
		
		
		WebElement userName = pom.getUserName();
		userName.sendKeys("Arunhotel");
		
		WebElement password = pom.getPassword();
		password.sendKeys("12345678");

		WebElement loginButton = pom.getLoginButton();
		loginButton.click();

		WebElement location = pom.getLocation();
		selectByValueId(location, "Brisbane");

		WebElement hotels = pom.getHotels();
		selectByIndexId(hotels, 1);

		WebElement roomType = pom.getRoomType();
		selectByTextId(roomType, "Double");

		WebElement roomNos = pom.getRoomNos();
		selectByValueId(roomNos, "3");

		WebElement checkInDate = pom.getCheckInDate();
		clearAndSendKeys(checkInDate, "09/08/2023");

		WebElement checkOutDate = pom.getCheckOutDate();
		clearAndSendKeys(checkOutDate, "10/08/2023");

		WebElement adultsPerRoom = pom.getAdultsPerRoom();
		selectByValueId(adultsPerRoom, "4");

		WebElement childPerRoom = pom.getChildPerRoom();
		selectByValueId(childPerRoom, "2");

		WebElement searchButton = pom.getSearchButton();
		searchButton.click();


		WebElement radiobutton = pom.getRadiobutton();
		radiobutton.click();

		WebElement continueButton = pom.getContinueButton();
		continueButton.click();
		
		WebElement firstName = pom.getFirstName();
		firstName.sendKeys(readExcelData(2, 0));

		WebElement lastName = pom.getLastName();
		lastName.sendKeys(readExcelData(3, 0));

		WebElement billingAddress = pom.getBillingAddress();
		billingAddress.sendKeys(readExcelData(4, 0));

		WebElement creditCardNumber = pom.getCreditCardNumber();
		creditCardNumber.sendKeys(readExcelData(5, 0));

		WebElement creditCardType = pom.getCreditCardType();
		selectByIndexId(creditCardType, 2);

		WebElement expiryMonth = pom.getExpiryMonth();
		selectByValueId(expiryMonth, "3");

		WebElement expiryYear = pom.getExpiryYear();
		selectByValueId(expiryYear, "2026");

		WebElement cvvNumber = pom.getCVVNumber();
		cvvNumber.sendKeys(readExcelData(6, 0));

		WebElement bookNowButton = pom.getBookNowButton();
		bookNowButton.click();

		System.out.println("Page four executed successfully");


		sleep(8000);
		WebElement itinerarybutton = pom.getItinerarybutton();
		itinerarybutton.click();



	}     

}


