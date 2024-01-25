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

public class TC003_RemoveFromCart extends BaseTest {

	@Test(groups = "regressionTesting")
	public void removeFromCart() throws InterruptedException {
		driver.findElement(By.linkText("APPAREL & SHOES")).click();
		driver.findElement(By.xpath("//a[text()='Blue Jeans']/ancestor::div[@class='details']/descendant::div[@class='add-info']/descendant::input")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		driver.findElement(By.xpath("//a[text()='Blue Jeans']/ancestor::tr/descendant::td[@class='remove-from-cart']/descendant::input")).click();
		driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
		WebDriverUtility.scrollToWebElement(driver, driver.findElement(By.xpath("//h1[text()='Shopping cart']")));
		WebDriverUtility.takeScreenshotOfWebpage(driver, "cartPage");
		Thread.sleep(2000);
	}
}
