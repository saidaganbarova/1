package com.delta.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.Driver;

public class PersonalProfilePage {

	public PersonalProfilePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(xpath="//div[@class='logged-in-container logged-in-flyout ng-star-inserted']")
	public WebElement profNameMenu;
	
	
	@FindBy(xpath="//a[contains(text(),'Profile')]")
	public WebElement ProfileButton;
	
	
	
	
	@FindBy(xpath="(//dd[@class='section-container__basic-info-data ng-star-inserted'])[1]")
	public WebElement DOB;
	

	@FindBy(xpath="//dd[@class='tlMaskInfo']")
	public WebElement name;
	
			
	
	@FindBy(xpath="//a[@class='passport__add-link']")
	public WebElement addPassport;		
			
	

	@FindBy(xpath="//input[@id = 'passportInfofirstName']")
	public WebElement firstNameInput;

	@FindBy(xpath="//input[@id = 'lastName']")
	public WebElement lastName;	
	
	

	@FindBy(xpath="//span[@id='gender-val']")
	public WebElement gender;	
	
	

	@FindBy(xpath="//li[@id='ui-list-gender2']")
	public WebElement femaleGender;	
	
	
	
	@FindBy(xpath="//select[@id='dobMonth']")
	public WebElement month;	
	
	
	@FindBy(xpath="//select[@id='dobDate']")
	public WebElement date;	
	
	
	
	@FindBy(xpath="//select[@id='dobYear']")
	public WebElement year;	
	
	
	
	@FindBy(xpath="//li[@id='ui-list-expMonth6']")
	public WebElement june;	
	
	@FindBy(xpath="//input[@id='passportNumber']")
	public WebElement passportNum;	
	
	
	
	@FindBy(xpath="//span[@id='nationality-val']")
	public WebElement nationality;	
	
	
	
	//li[@id='ui-list-nationality39'] 
	@FindBy (xpath="//li[@id='ui-list-nationality39'] ")
	public WebElement canada;
	
}
