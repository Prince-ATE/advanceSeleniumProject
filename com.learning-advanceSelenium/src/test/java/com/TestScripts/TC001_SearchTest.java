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

public class TC001_SearchTest extends BaseTest {

	@Test(groups = "regressionTesting")
	public void searchTest() throws InterruptedException {
		driver.findElement(By.id("small-searchterms")).sendKeys("books");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		WebDriverUtility.scrollToWebElement(driver, driver.findElement(By.xpath("//h1[text()='Search']")));
		Thread.sleep(2000);
		WebDriverUtility.takeScreenshotOfWebpage(driver, "searchacreenshot");
	}
}
