package com.day3XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q13Myntra {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		
		WebElement txtMob = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
		txtMob.sendKeys("8928828129");
		
		WebElement btnContinue = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		btnContinue.click();
		
		//driver.quit();
	}
	
}
