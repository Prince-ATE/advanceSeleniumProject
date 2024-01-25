package com.Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApparelAndShoesPage {

	public ApparelAndShoesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Blue Jeans']/ancestor::div[@class='details']/descendant::input")
	WebElement blueJeansAddToCartButton;
	
	
}
