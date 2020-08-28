package com.delta.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.Driver;

public class CustomTypePage {

	
   public CustomTypePage() {
		
		PageFactory.initElements(Driver.getDriver(), this);
	}
	

	@FindBy(xpath ="//a[@class='nav-link app-link nav-link-mytrips']")
	public WebElement clickOnMyTrips;

	@FindBy(id ="searchOption-val")
	public WebElement clickOnConfirmButton;
	

	@FindBy(xpath ="//input[@name='confirmationNo']")
	public WebElement enterConfirNo;
	
	@FindBy(xpath ="//input[@class='form-control mb-2 mb-sm-0 text-capitalize input-mobile-tab-class ng-untouched ng-pristine ng-invalid']")
	public WebElement enterFirstName;
	
	@FindBy(xpath ="//input[@class='form-control mb-2 mb-sm-0 text-capitalize input-mobile-tab-class ng-untouched ng-pristine ng-invalid']")
	public WebElement enterLastName;
	
	@FindBy(id ="btn-mytrip-submit")
	public WebElement clickOnSubmitButton;
	
	@FindBy(xpath="//span[@class='myTripsStrutsErrorBox']")
	public WebElement verifyTextButton;
	
	
}
