package com.delta.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.Driver;

public class AboutDeltaPage {


	public AboutDeltaPage () {
		
	PageFactory.initElements(Driver.getDriver(), this);
	
	}
	
	@FindBy(xpath = "//ngc-search[@class='d-none d-lg-block ng-tns-c0-0 ng-star-inserted']//img")
	public WebElement search;
	
	@FindBy(xpath = "//input[@class='form-control mb-2 mb-sm-0 custom-search-color']")
	public WebElement enter;
	//div[@class='search-results d-none pl-1 d-block']//li[2]//a[1]
	

	@FindBy(xpath = "//div[@class='search-results d-none pl-1 d-block']//li[2]//a[1]")
	public WebElement about;
	
	@FindBy(xpath = "//div[@class='play']")
	public WebElement play;
	
}
