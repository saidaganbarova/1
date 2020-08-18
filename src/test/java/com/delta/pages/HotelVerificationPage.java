package com.delta.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.Driver;

public class HotelVerificationPage {
	

	public HotelVerificationPage () {
	PageFactory.initElements(Driver.getDriver(), this);
	
	}
	
	@FindBy(xpath = "//div[@class='canvas widget-carousel-enabled']//button[@class='cta widget-carousel-cta-next']")
	public WebElement photos;
	
	@FindBy(xpath = "(//h2[contains(text(),'Lakeway Resort and Spa')])[1]")
	public WebElement hotelName;

	@FindBy(xpath = "//input[@class='widget-query-autosuggest  clearable autosuggest-enabled'][@name='q-destination']")
	public WebElement hotelAddress;
	////li[1]//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]//strong[1]
	@FindBy(xpath = "(//strong[@class='current-price'][contains(text(),'$211')])[1]")
	public WebElement nightlyPrice;
	
	@FindBy(xpath = "//li[1]//div[2]//div[1]//div[2]//div[1]//div[1]//div[2]//p[1]")
	public WebElement totalPrice;
	
	@FindBy(xpath = "//li[1]//div[2]//div[1]//div[2]//div[1]//div[1]//div[5]//strong[1]")
	public WebElement freeCancel;
	
	@FindBy(xpath = "//li[1]//div[2]//div[1]//div[2]//div[2]//form[1]//button[1]")
	public WebElement reserve;
	
	@FindBy(xpath = "//div[@class='thumbnail']//span[contains(text(),'Non-Lakeview, King with Balcony')]")
	public WebElement roomType;
	
	
	@FindBy(xpath = "//button[contains(text(),'Reserve with deposit')]")
	public WebElement reserveWithDep;
}

