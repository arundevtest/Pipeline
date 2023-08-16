package org.browser;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;


public class JunitLeaning extends BaseClass {

	
public static PomUser pom;
	
	@BeforeClass
	
	public static void pageOne() {
		
		
		try {
			
			initializeDriver("Chrome");
			getUrl("https://adactinhotelapp.com/");
			
			 pom = new PomUser();
			
			WebElement userName = pom.getUserName();
			userName.sendKeys(readExcelData(1, 0));
					
			WebElement password = pom.getPassword();
			password.sendKeys("12345678");
			
			WebElement loginButton = pom.getLoginButton();
			loginButton.click();
			
			System.out.println("Page one Executed successfully");

			
		} catch (Exception e) {
			
			System.out.println("Error occured in Page one");
		}
		
	}
	
		@Before
		public  void pageTwo() {
			try {
				
				pom = new PomUser();
				
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
		        
		        System.out.println("Page two executed successfully");
				
			} catch (Exception e) {
				   System.out.println("Error occured in Page two");
				
			}
			
	        

		}
	
		@Test
     public void pageThree() {
    	 try {
    		 pom = new PomUser();
    		 WebElement radiobutton = pom.getRadiobutton();
             radiobutton.click();
             
             WebElement continueButton = pom.getContinueButton();
             continueButton.click();
             
             System.out.println("Page three executed successfully");
			
		} catch (Exception e) {
			System.out.println("Error occured in page three");
			
		}
    	 
    	 
	}
        
	    @After 
        public void pageFour() {
			try {
				pom = new PomUser();
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
	            
			} catch (Exception e) {
				System.out.println("Error occured in Page four");
			}
        	

		}
        
       @AfterClass 
        public static void pageFive() {
    	   
        	try {
        		pom = new PomUser();
        		sleep(8000);
                
                WebElement itinerarybutton = pom.getItinerarybutton();
                itinerarybutton.click();
                
                System.out.println("Page five executed successfully");
			} catch (Exception e) {
				
				System.out.println("Error occured in page five");
			}
        	
		}
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}     
	
	
	
	
	
	
	
	

