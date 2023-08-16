package org.browser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomUser extends BaseClass {

	public PomUser() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id="username")
	private WebElement userName;
	
	public WebElement getUserName() {
		return userName ;
	}
	

	@FindBy(id = "password")
	private WebElement passWord;

	public WebElement getPassword() {
		return passWord;
	}

	@FindBy(xpath = "//input[@class='login_button']")
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;

	}

	@FindBy(id = "location")

	private WebElement location;

	public WebElement getLocation() {
		return location;
	}

	@FindBy(id = "hotels")

	private WebElement hotels;

	public WebElement getHotels() {
		return hotels;

	}

	@FindBy(id = "room_type")

	private WebElement roomtype;

	public WebElement getRoomType() {
		return roomtype;

	}

	@FindBy(id = "room_nos")

	private WebElement roomnos;

	public WebElement getRoomNos() {
		return roomnos;
	}

	@FindBy(id = "datepick_in")

	private WebElement checkindate;

	public WebElement getCheckInDate() {
		return checkindate;
	}

	@FindBy(id = "datepick_out")

	private WebElement checkoutdate;

	public WebElement getCheckOutDate() {
		return checkoutdate;
	}

	@FindBy(id = "adult_room")

	private WebElement adultsperroom;

	public WebElement getAdultsPerRoom() {
		return adultsperroom;
	}

	@FindBy(id = "child_room")

	private WebElement childperroom;

	public WebElement getChildPerRoom() {
		return childperroom;
	}

	@FindBy(id = "Submit")

	private WebElement searchbutton;

	public WebElement getSearchButton() {
		return searchbutton;
	}

	@FindBy(id = "radiobutton_0")

	private WebElement radiobutton;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	@FindBy(id = "continue")

	private WebElement continuebutton;

	public WebElement getContinueButton() {
		return continuebutton;
	}

	@FindBy(id = "first_name")

	private WebElement firstname;

	public WebElement getFirstName() {
		return firstname;
	}

	@FindBy(id = "last_name")
	private WebElement lastname;

	public WebElement getLastName() {
		return lastname;

	}

	@FindBy(id = "address")
	private WebElement billingaddress;

	public WebElement getBillingAddress() {
		return billingaddress;

	}

	@FindBy(id = "cc_num")
	private WebElement creditcardno;

	public WebElement getCreditCardNumber() {
		return creditcardno;
	}

	@FindBy(id = "cc_type")
	private WebElement creditcardtype;

	public WebElement getCreditCardType() {
		return creditcardtype;
	}

	@FindBy(id = "cc_exp_month")
	private WebElement expirymonth;

	public WebElement getExpiryMonth() {
		return expirymonth;
	}

	@FindBy(id = "cc_exp_year")
	private WebElement expiryyear;

	public WebElement getExpiryYear() {
		return expiryyear;
	}

	@FindBy(id = "cc_cvv")
	private WebElement cvvnumber;

	public WebElement getCVVNumber() {
		return cvvnumber;
	}

	@FindBy(id = "book_now")
	private WebElement booknowbutton;

	public WebElement getBookNowButton() {
		return booknowbutton;
	}

	@FindBy(id = "my_itinerary")
	private WebElement itinerarybutton;

	public WebElement getItinerarybutton() {
		return itinerarybutton;
	}

	



}
