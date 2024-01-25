package com.Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Blue Jeans']/ancestor::tr/descendant::input[@type='checkbox']")
	WebElement blueJeansRemoveCheckBox;
	
	@FindBy(xpath = "//input[@name='updatecart']")
	WebElement updateCartButton;
	
	@FindBy(xpath = "//h1[text()='Shopping cart']")
	WebElement shoppingCartHeading;

	public WebElement getBlueJeansRemoveCheckBox() {
		return blueJeansRemoveCheckBox;
	}

	public WebElement getUpdateCartButton() {
		return updateCartButton;
	}

	public WebElement getShoppingCartHeading() {
		return shoppingCartHeading;
	}
	
	
}
