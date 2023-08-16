package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FishPond {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\ProcrureWise\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fishpond.co.in/");
		driver.manage().window().maximize();

		WebElement searchbox = driver.findElement(By.id("searchbar"));
		searchbox.sendKeys("The adventures of Tom Sawyer");

		WebElement searchbuton = driver.findElement(By.xpath("//span[@class='search__button-icon flat-icon']"));
		searchbuton.click();

		WebElement product = driver.findElement(By.xpath("(//a[@class='item-block__title-link'])[2]"));
		product.click();

		WebElement addtoCartButton = driver.findElement(By.xpath("//button[@class='button-add-to-cart']"));
		addtoCartButton.click();

		WebElement checkOutButtton = driver.findElement(By.xpath("//a[@class='blue_link']"));
		checkOutButtton.click();

		WebElement deleteLink = driver.findElement(By.xpath("//a[@class='never-visited-link delete-item']"));
		deleteLink.click();

		Thread.sleep(3000);

		WebElement continueButton = driver.findElement(By.xpath("//a[@class='flat-button blue medium']"));
		continueButton.click();

	}

}
