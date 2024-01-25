package com.TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Generic_Utility.BaseTest;
import com.Generic_Utility.WebDriverUtility;

public class TC002_AddToCart extends BaseTest {

	@Test(groups = "smokeTesting")
	public void addToCart() throws InterruptedException {
		driver.findElement(By.linkText("APPAREL & SHOES")).click();
		driver.findElement(By.xpath("//a[text()='Blue Jeans']/ancestor::div[@class='details']/descendant::div[@class='add-info']/descendant::input")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		WebDriverUtility.scrollToWebElement(driver, driver.findElement(By.xpath("//h1[text()='Shopping cart']")));
		WebDriverUtility.takeScreenshotOfWebpage(driver, "cartPage");
		Thread.sleep(2000);
		
	}
	
}
