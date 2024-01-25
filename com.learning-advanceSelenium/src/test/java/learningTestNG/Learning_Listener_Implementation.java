package learningTestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Generic_Utility.BaseTest2;
import com.Generic_Utility.WebDriverUtility;
@Listeners(com.Generic_Utility.ListenerImplementation.class)
public class Learning_Listener_Implementation extends BaseTest2 {

	@Test
	public void addToCart() throws InterruptedException {
		driver.findElement(By.linkText("APPAREL & SHOES")).click();
		driver.findElement(By.xpath("//a[text()='Blue Jeans']/ancestor::div[@class='details']/descendant::div[@class='add-info']/descendant::input")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Assert.assertEquals(driver.getTitle(), "Demo Web");
		WebDriverUtility.scrollToWebElement(driver, driver.findElement(By.xpath("//h1[text()='Shopping cart']")));
		
		Thread.sleep(2000);
		
	}
	
}
