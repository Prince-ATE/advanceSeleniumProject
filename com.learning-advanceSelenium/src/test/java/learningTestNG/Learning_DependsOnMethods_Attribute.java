package learningTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Learning_DependsOnMethods_Attribute {

	@Test
	public void registerTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Prince",Keys.TAB,"Kumar",Keys.TAB,"princek650@gmail.com",Keys.TAB,"Princek621@",Keys.TAB,"Princek621@",Keys.ENTER);
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	@Test(dependsOnMethods = "registerTest")
	public void loginTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("princek650@gmail.com",Keys.TAB,"Princek621@",Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test(dependsOnMethods = {"registerTest","loginTest"})
	public void searchTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobile",Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}

}
