package com.delta.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.Driver;

public class ResortVerificationPage {
	
	
	public  ResortVerificationPage() {
	PageFactory.initElements(Driver.getDriver(), this);
	
	}

	@FindBy(xpath = "//fieldset[@class='checkbox-filters']//label[contains(text(),'Free WiFi')]")
	public WebElement wifi;


	@FindBy(xpath = "//fieldset[2]//div[2]//div[1]//div[2]//div[3]")
	public WebElement price;


	@FindBy(xpath = "//a[contains(text(),'Lakeway Resort and Spa')]")
	public WebElement resortName;
	

	@FindBy(xpath = "//ins[contains(text(),'$272')]")
	public WebElement daylyPrice;

	@FindBy(xpath = "//li[@class='hotel deal-of-the-day loyalty-applied']//p[1]")
	public WebElement totalDays;

	@FindBy(xpath = "//body/div[@class='resp-section']/main[@class='inner-section']/div[@class='resp-row']/div[@class='resp-col main']/div[@class='main-inner']/section/div[@class='h-listing']/ol[@class='listings infinite-scroll-enabled']/li[2]/article[1]/section[1]/aside[1]/a[1]")
	public WebElement click;

}
