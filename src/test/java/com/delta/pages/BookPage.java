package com.delta.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.Driver;



public class BookPage {
	
	
	

	 public  BookPage (){
			
		PageFactory.initElements(Driver.getDriver(), this);
	}

	// Click on "From" button
	@FindBy(xpath = "//a[@id='fromAirportName']")
	public WebElement fromButton;
	// Closing the "From" button
	@FindBy(xpath = "//button[@class='search-flyout-close float-right d-none d-lg-block circle-outline icon-moreoptionsclose']")
	public WebElement fromButtonClose;
	// Click on "To" button
	@FindBy(xpath = "//a[@id='toAirportName']")
	public WebElement toButton;

	// Closing the "To" button
	@FindBy(xpath = "//button[@class='search-flyout-close float-right d-none d-lg-block circle-outline icon-moreoptionsclose']")
	public WebElement toButtonClose;

	// Click on "Round Trip" button
	@FindBy(xpath = "//span[@id ='selectTripType-val']")
	public WebElement selectTripButton;

	// Selecting the "Round Trip" from drop drown button
	@FindBy(id = "ui-list-selectTripType0")
	public WebElement selectRoundTripButton;

	// Selecting the "Calendar" button
	@FindBy(id = "calDepartLabelCont")
	public WebElement calDepartButton;

	// Selecting a "Departure date" from the calendar table
	@FindBy(xpath = "//div[@class='dl-datepicker-group dl-datepicker-group-1']//td")
	public List<WebElement> departDateButton;

	// Selecting a "Return date" from the calendar table
	@FindBy(xpath = "//div[@class='dl-datepicker-group dl-datepicker-group-1']//td")
	public List<WebElement> returntDateButton;

	// Closing the "Calendar" table
	@FindBy(xpath = "//button[@aria-label='done']")
	public WebElement calenCloseButton;
	// Clicking on "Passenger" button
	@FindBy(id = "passengers-val")
	public WebElement selectPassengerButton;
	// Selecting the "Passenger"count
	@FindBy(id = "ui-list-passengers1")
	public WebElement pickPassCount;
	// Clicking on the "Submit Button
	@FindBy(id = "btn-book-submit")
	public WebElement submitButton;
	

	@FindBy(xpath = "//li[@class='shopping-link-2']//a[contains(text(),'Shop Hotels')]")
		public WebElement shopHot;
	
	
	public void confirmHomePage() {

		calDepartButton.click();

		for (int i = 0; i < departDateButton.size(); i++) {
			String date = departDateButton.get(i).getText();
			if (date.equalsIgnoreCase("23")) {
				departDateButton.get(i).click();
				break;
			}
		}
		

		for (int i = 0; i < returntDateButton.size(); i++) {
			String date = returntDateButton.get(i).getText();
			if (date.equalsIgnoreCase("26")) {
				returntDateButton.get(i).click();
				break;
			}
		}
	 		calenCloseButton.click();
		selectPassengerButton.click();
		pickPassCount.click();
	}

}



