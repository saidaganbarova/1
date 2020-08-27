package com.delta.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.Driver;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(xpath="//button[@class='login-btn btn btn-danger']")
	public WebElement loginButton;
	
	@FindBy (linkText = "SIGN UP")
	public WebElement signUpButton;
	
	
	
	
	
	@FindBy (xpath = "//a[.='BOOK']")
	public WebElement bookButton;
	
	@FindBy (xpath = "//a[.='MY TRIPS']")
	public WebElement myTrips;
	
	
	public WebElement getMenu(String menu) {
		String xpath = "//a[.='"+    menu    +"']";
		return Driver.getDriver().findElement(By.xpath(xpath));
	}
	
	
}
