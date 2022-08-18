package com.day3XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2Facebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("zaddhu111@gmail.com");
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("Zaddhu@123");
		
		WebElement txtLogin = driver.findElement(By.name("login"));
		txtLogin.click();
		
		//driver.quit();
	
	}
}
