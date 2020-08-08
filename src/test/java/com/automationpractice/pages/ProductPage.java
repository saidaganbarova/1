package com.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.utilities.Driver;

public class ProductPage {
	
	public ProductPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (tagName = "h1")
	public WebElement product;
	
	@FindBy (id = "quantity_wanted")
	public WebElement quantityBox;

	@FindBy (id = "our_price_display")
	public WebElement price;

	@FindBy (className =  "icon-plus")
	public WebElement plusButton;
	
	@FindBy (className =  "icon-minus")
	public WebElement minusButton;
	
	

}
