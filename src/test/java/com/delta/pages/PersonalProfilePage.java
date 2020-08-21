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
	
	
	
	@FindBy(xpath="//span[@id='dobMonth-val']")
	public WebElement month;	
	
	
	@FindBy(xpath="//span[@id='dobDate-val']")
	public WebElement date;	
	
	

	@FindBy(xpath="//li[@id='ui-list-dobDate4']")
	public WebElement fifthDate;	
	
	
	
	@FindBy(xpath="//span[@id='dobYear-val']")
	public WebElement year;	
	
	
	@FindBy(xpath="//li[@id='ui-list-dobYear10']")
	public WebElement pickedAyear;	
	
	
	
	@FindBy(xpath="//li[@id='ui-list-dobMonth2']")
	public WebElement feb;	
	
	
	
	@FindBy(xpath="//input[@id='passportNumber']")
	public WebElement passportNum;	
	
	
	
	@FindBy(xpath="//span[@id='nationality-val']")
	public WebElement nationality;	
	
	
	
	//li[@id='ui-list-nationality39'] 
	@FindBy (xpath="//li[@id='ui-list-nationality39'] ")
	public WebElement canada;
	
	
	
	

	@FindBy (xpath="//span[@class='select-ui-wrapper ']")
	public WebElement countryOfResidence;

	
	
	@FindBy (xpath="//li[@id='ui-list-residence16']")
	public WebElement countryPick;
	
	
	@FindBy (xpath="//button[@class='btn btn-block btn-danger ng-star-inserted']") 
	public WebElement save;

	
	@FindBy (xpath="//span[@id='expMonth-val']") 
	public WebElement expMonth;
	
	
	@FindBy (xpath="//li[@id='ui-list-expMonth5']") 
	public WebElement expMay;
	
	
	
	@FindBy (xpath="//span[@id='expDate-val']") 
	public WebElement expDate;
	

	@FindBy (xpath="//li[@id='ui-list-expDate5']") 
	public WebElement expFive;
	

	
	@FindBy (xpath="//span[@id='expYear-val']") 
	public WebElement expYear;
	
	
	
	
	@FindBy (xpath="//li[@id='ui-list-expYear5']") 
	public WebElement expYearPick;
	
	
}
