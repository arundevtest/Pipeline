package org.browser;

import java.awt.Transparency;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdcatinwithPomAndBaseClass extends BaseClass{
	
	public static PomUser pom;
	@Parameters ({"UserName", "Password"})
	@Test (priority=1)
	public void pageOne(String user, String pass) {
		
		
		try {
			
			initializeDriver("Chrome");
			getUrl("https://adactinhotelapp.com/");
			
			 pom = new PomUser();
			
			WebElement userName = pom.getUserName();
			userName.sendKeys(user);
					
			WebElement password = pom.getPassword();
			password.sendKeys(pass);
			
			WebElement loginButton = pom.getLoginButton();
			loginButton.click();
			
			System.out.println("Page one Executed successfully");

			
		} catch (Exception e) {
			
			System.out.println("Error occured in Page one");
		}
		
	}
	    @Parameters({"Date"})
		@Test (priority=2)
		public void pageTwo(String date) {
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
		        clearAndSendKeys(checkInDate, date);
		        
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
	@Test(priority=300)
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
        
	    @Test  (priority=4)
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
        
       @Test (priority=5)
        public void pageFive() {
    	   
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
		
	
	
	
	


