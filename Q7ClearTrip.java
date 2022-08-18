package com.day3XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q7ClearTrip {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.cleartrip.com/trains");
		
		WebElement txtFrom = driver.findElement(By.id("from_station"));
		txtFrom.sendKeys("Madurai Junction (MDU)");
		
		WebElement txtTo = driver.findElement(By.id("to_station"));
		txtTo.sendKeys("Chennai Egmore (MS)");
		
		WebElement btnSearch = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
		btnSearch.click();
		
		//driver.quit();
		
		
	}
}
