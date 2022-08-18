package com.day3XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5GreensTech {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement btnInterview = driver.findElement(By.id("heading20"));
		btnInterview.click();
		
		WebElement btnCts = driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/interview-questions/cts.pdf#toolbar=0']"));
		btnCts.click();
		
		//driver.quit();
		
	
	
	}
}
