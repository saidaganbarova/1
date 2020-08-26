package com.delta.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.Driver;

public class LoginPage {
	

	
	
	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	
	
	@FindBy(xpath="//input[@id='userId']")
	public WebElement usernameInputBox;
	
	


	
	@FindBy(xpath="//input[@id='lastName']")
	public WebElement LastNameInputBox;
	
	

	@FindBy(xpath="//input[@id='password']")
	public WebElement passwordInputBox;
	
	
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	public WebElement loginButton;
	
	
	
	
	@FindBy(xpath="//span[@class='pax-name']")
	public WebElement nameConfirmation;
	
	
	@FindBy(xpath="//a[@id='flyout-logOut-link']")
	public WebElement logout;
	
	
}
