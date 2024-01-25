package com.Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "APPAREL & SHOES")
	WebElement apparelAndShoesLink;
	
	@FindBy(xpath = "//a[@class='ico-logout']")
	WebElement logoutLink;

	public WebElement getApparelAndShoesLink() {
		return apparelAndShoesLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	
}
