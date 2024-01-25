package com.Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Log in")
	WebElement loginLink;
	
	@FindBy(name = "q")
	WebElement searchTextField;
	
	@FindBy(xpath = "//input[@value='Search']")
	WebElement searchButton;
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	WebElement shoppingCartButton;

	public WebElement getShoppingCartButton() {
		return shoppingCartButton;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
	
}
