package com.day3XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q12Snapdeal {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.snapdeal.com/");
		
		WebElement btnSignIn = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		btnSignIn.click();
		
		WebElement btnRegister = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		btnRegister.click();
		
		WebElement txtUserName = driver.findElement(By.name("username"));
		txtUserName.sendKeys("abd@gmail.com");
		
		WebElement btnContinue = driver.findElement(By.xpath("//button[@id='checkUser']"));
		btnContinue.click();
		
		//driver.quit();
		
	}
}
