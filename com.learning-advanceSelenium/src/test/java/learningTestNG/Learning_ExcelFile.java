package learningTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic_Utility.Java_Utility;

public class Learning_ExcelFile {

	@Test
	public void registerTest() throws Throwable {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/testScriptData/testScriptData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("registerData");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(0);
		String firstName = cell.getStringCellValue();
		String lastName = row.getCell(1).getStringCellValue();
		String email = row.getCell(2).getStringCellValue();
		String newEmail = email+Java_Utility.getRandomNumber()+"@gmail.com";
		String password = row.getCell(3).getStringCellValue();
		String cnfPassword = row.getCell(4).getStringCellValue();
		String gender = row.getCell(5).getStringCellValue();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		
		if(gender.equals("M")) {
			driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		}
		else {
			driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		}
			
			driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(firstName);
			driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(lastName);
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(newEmail);
			System.out.println(driver.findElement(By.xpath("//input[@id='Email']")).getAttribute("value"));
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
			driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(cnfPassword);
			driver.findElement(By.xpath("//input[@id='register-button']")).click();
			Thread.sleep(2000);
			driver.quit();
			
		
}
}
