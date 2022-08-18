package com.day3XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q14Swiggy {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.swiggy.com/");
		
		WebElement btnSignUp = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		btnSignUp.click();
		
		WebElement txtMob = driver.findElement(By.id("mobile"));
		txtMob.sendKeys("8928828129");
		
		WebElement txtName = driver.findElement(By.id("name"));
		txtName.sendKeys("SatheesKuamr");
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("zaddhu111@gmail.com");
		
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("Zaddhu@123");
		
		WebElement btnContinue = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		btnContinue.click();
		
		//driver.quit();
		
		
	}
}
