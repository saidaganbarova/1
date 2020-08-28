package com.delta.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.Driver;



public class SenOutlineExampPage {

	

	public SenOutlineExampPage() {
	
	PageFactory.initElements(Driver.getDriver(), this);
	}
	

	@FindBy(xpath ="//a[contains(text(),'Updated Bag & Travel Fees')]" )
	public WebElement updateBag;
	

	@FindBy(xpath ="//button[@class='idp-btn idp-primary idp-btn-wide']" )
	public WebElement myTrips;
	
	@FindBy(xpath ="//h2[contains(text(),'Credit')]" )
	public WebElement cordNO;;
	
	
	@FindBy(xpath ="//input[@id='myTripsCcFName']" )
	public WebElement firstName;
	
	@FindBy(xpath ="//input[@id='myTripsCcLName']" )
	public WebElement lastName;
	
	@FindBy(xpath ="//input[@id='myTripsCardNo']" )
	public WebElement cardNoText;
	
	@FindBy(xpath ="//button[@id='myTripsCreditCardButton']" )
	public WebElement findMyTrip;
	
	
	@FindBy(xpath ="//div[@id='myTripsConfError']//span[@id='tripFinderStrutsErr']" )
	public WebElement errorMessage;
	
	
	
}
