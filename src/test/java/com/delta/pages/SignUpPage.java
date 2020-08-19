package com.delta.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.Driver;

public class SignUpPage {
	public SignUpPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(id= "basicInfoFirstName")
	public WebElement firstName;
	
	@FindBy(id= "basicInfoLastName")
	public WebElement lastName;
	
	@FindBy(id= "basicInfoGender-button")
	public WebElement gender;
	
	@FindBy (xpath= "//span[@class='ui-selectmenu-text'][contains(text(),'Month')]")
	public WebElement month;
	
	@FindBy (xpath= "//span[@class='ui-selectmenu-text'][contains(text(),'Day')]")
			public WebElement day;
	
	@FindBy (id= "basicInfoYob-button")
	public WebElement year;
	
	@FindBy (id ="countryCode-1-button")
	public WebElement country;
	
	@FindBy (id= "aType-1-button")
	public WebElement addressType;
	
	@FindBy (id= "addr1-1")
	public WebElement adress;
	
	@FindBy (id= "cityCountyWard-11")
	public WebElement city;
	
		
	@FindBy (id= "stateProv-1-button")
	public WebElement state;
	
	
	@FindBy (id= "postal-1")
	public WebElement postalCode;
	
	@FindBy (id= "phoneCountryCode-button")
	public WebElement countryCode;
	
	
	
	
	
	
	
	
	
	
	
	
}
