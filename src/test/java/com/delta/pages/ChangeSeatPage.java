package com.delta.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.Driver;


public class ChangeSeatPage {

	public ChangeSeatPage() {
		
		PageFactory.initElements(Driver.getDriver(), this);

	}
	
	// In home page on upper bar click on Need Help?
	@FindBy  (id = "headSectab3")
	public WebElement needHelpButton;
	
	// Click on Seat Help
	@FindBy  (id = "primary-static-link-2")
    public WebElement seatsHelpButton;
	   
	// Click on Change/Upgrade Your Seat
	@FindBy  (xpath = "//a[@class='btn btn-danger btn-primary-cta btn-block btn-default']")
	public WebElement changeUpgradeYourSeatButton;
	
	// On My Trips page fill up form
	@FindBy  (id = "myTripsConfFName")
	public WebElement firstName;
	
	@FindBy  (id = "myTripsConfLName")
	public WebElement lastName;
	
	@FindBy  (id = "myTripsConfNo")
	public WebElement confirmationNumber;
	
	@FindBy  (id = "myTripsConfNoButton") 
	public WebElement findMyTripButton;

	//Check the Tittle **
}


