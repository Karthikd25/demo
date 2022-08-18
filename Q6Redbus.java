package com.day3XPath;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6Redbus {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		Thread.sleep(2000);
		WebElement btnArrow = driver.findElement(By.id("sign-in-icon-down"));
		btnArrow.click();
		
		Thread.sleep(2000);
		WebElement btnSignIn = driver.findElement(By.id("hc"));
		btnSignIn.click();
		
		Thread.sleep(2000);
		WebElement txtMob = driver.findElement(By.xpath("//input[@data-message=\"Please enter valid mobile number|Please enter valid mobile number\"]"));
		txtMob.sendKeys("8928828129");
		
		//driver.quit();
		
	}
}
