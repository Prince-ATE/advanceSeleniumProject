package learningTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Learning_DataProvider {

	@Test(dataProvider = "loginData")
	public void loginTest(String username, String password) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
			driver.findElement(By.xpath("//a[text()='Log in']")).click();
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			Thread.sleep(2000);
			driver.quit();
		
			driver.quit();
		}
	
	@DataProvider(name = "loginData")
	public Object[][] loginData() {
		Object [][]data = new Object[3][2];
		data[0][0] = "princek621@gmail.com";
		data[0][1] = "Princek621@";
		
		data[1][0] = "123Manisha@gmail.com";
		data[1][1] = "Manisha2";
		
		data[2][0] = "nikhil26@gmail.com";
		data[2][1] = "nikhil123";
		
		return data;
		
		
	}

}
