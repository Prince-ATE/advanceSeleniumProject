package com.Generic_Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class WebDriverUtility {

	public static void takeScreenshotOfWebpage(WebDriver driver, String screenshotName) {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File("./src/test/resources/screenshots/"+screenshotName+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void scrollToWebElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
}
