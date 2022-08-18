package com.day3XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q11AccGoogle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		WebElement txtFName = driver.findElement(By.name("firstName"));
		txtFName.sendKeys("SatheesKumar");
		
		WebElement txtLName = driver.findElement(By.name("lastName"));
		txtLName.sendKeys("Murugan");
		
		//WebElement txtUserName = driver.findElement(By.name("username"));
		//txtUserName.sendKeys("zadhhu89288");
		
		WebElement txtPass = driver.findElement(By.name("Passwd"));
		txtPass.sendKeys("Zaddhu@123");
		
		WebElement txtPassword = driver.findElement(By.name("ConfirmPasswd"));
		txtPassword.sendKeys("Zaddhu@123");
		
		WebElement cbxShow = driver.findElement(By.xpath("//input[@type='checkbox']"));
		cbxShow.click();
		
		WebElement btnNext = driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]"));
		btnNext.click();
		
		//driver.quit();
	}
}
