package com.day3XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3AutomationTesting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement txtFName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		txtFName.sendKeys("SatheesKumar");
		
		WebElement txtLName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtLName.sendKeys("Murugan");
		
		WebElement txtAdress = driver.findElement(By.xpath("//textarea[@rows='3']"));
		txtAdress.sendKeys("sellur, Madurai");
	
		WebElement txtEmail = driver.findElement(By.xpath("//input[@type='email']"));
		txtEmail.sendKeys("zaddhu111@gmail.com");
		
		WebElement txtPhone = driver.findElement(By.xpath("//input[@type='tel']"));
		txtPhone.sendKeys("8928828129");
		
		WebElement rbtnMale = driver.findElement(By.xpath("//input[@value='Male']"));
		rbtnMale.click();
		
		WebElement cbxOne = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		cbxOne.click();
		
		WebElement cbxTwo = driver.findElement(By.xpath("//input[@id='checkbox2']"));
		cbxTwo.click();
		
		WebElement cbxThree = driver.findElement(By.xpath("//input[@id='checkbox3']"));
		cbxThree.click();
		
		WebElement txtFPassword = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		txtFPassword.sendKeys("Zaddhu@123");
		
		WebElement txtSPassword = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		txtSPassword.sendKeys("Zaddhu@123");
		
		WebElement btnSubmit = driver.findElement(By.xpath("//button[@id='submitbtn']"));
		btnSubmit.click();
		
		//driver.quit();
	}
}
