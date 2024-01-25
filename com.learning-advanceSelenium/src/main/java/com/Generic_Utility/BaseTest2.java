package com.Generic_Utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.Object_Repository.WelcomePage;

public class BaseTest2 {
public static WebDriver sdriver;
public WebDriver driver;
	
	
	@BeforeClass(alwaysRun = true)
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		sdriver = driver;
	}
	
	@BeforeMethod(alwaysRun = true)
	public void logInApplication() {
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
	//	driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys("princek621@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Princek621@");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}
	
	@AfterMethod(alwaysRun = true)
	public void logoutApplication() {
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
	}
}
