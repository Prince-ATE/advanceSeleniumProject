package com.TestScriptsPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoWebShopValidation {

	
	@Test
	public void demoWebShopValidation() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		if(driver.getTitle().equals("Demo Web")) {
			Reporter.log("Correct Web Page");
			driver.findElement(By.linkText("Log in")).click();
			if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/login")) {
			driver.findElement(By.id("Email")).sendKeys("princek621@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("Princek621@");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			}else {
				Reporter.log("Invalid Url");
			}
			if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/")) {
				Reporter.log("valid Home Page URL");
				driver.quit();
			}else {
				Reporter.log("Invalid Home Page Url");
			}
			
		}else {
			Reporter.log("Incorrect Web Page");
			driver.quit();
		}
		
		
	}
}
