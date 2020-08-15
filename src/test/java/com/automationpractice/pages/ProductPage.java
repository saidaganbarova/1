package com.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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

	@FindBy (id =  "group_1")
	public WebElement size;

	@FindBy (xpath =  "//p[@id='product_condition']//span")
	public WebElement condition;

	@FindBy (xpath =  "//p[@id='product_reference']//span")
	public WebElement  model;

	@FindBy (xpath =  "//p[@id='add_to_cart']//button")
	public WebElement addToCartButton;
	
	@FindBy (xpath =  "//a[@title='Proceed to checkout']")
	public WebElement proceedButton;
	//a[@title='Proceed to checkout']
	
	public WebElement returnFirstSelectedOption() {
		return new Select(size).getFirstSelectedOption();
	}
	
	

}
