package com.TestScriptsPractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Generic_Utility.Java_Utility;
import com.Generic_Utility.WebDriverUtility;

public class FlipkartSearch {
	
	
	@DataProvider
	public Object[][] getData() throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/testScriptData/flipkartData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		Object [][] data = new Object[rowCount-1][cellCount];
		
		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				data[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue(); 
			}
			
		}
		return data;
		
	}

	@Test(dataProvider = "getData")
	public void searchTest(String searchText) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys(searchText);
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		WebDriverUtility.takeScreenshotOfWebpage(driver, Java_Utility.getName());
		driver.quit();
	}
}
