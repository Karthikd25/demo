package com.day3XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1Amazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement txtSearch = driver.findElement(By.xpath("//input[@type='text']"));
		txtSearch.sendKeys("iphone");
		
		WebElement btnClick = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		btnClick.click();
		
		//driver.quit();
		
	}
}
