package com.day3XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q9Flipkart {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement btnClose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnClose.click();
		
		WebElement btnLogin = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		btnLogin.click();
		
		WebElement txtUser = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		txtUser.sendKeys("8928828129");
		
		WebElement txtPassword = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		txtPassword.sendKeys("Zaddhu@123");
		
		//driver.quit();
		
		
		
		
	}

}
