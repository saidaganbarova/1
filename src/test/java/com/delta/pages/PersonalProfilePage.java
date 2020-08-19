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
	
			
			
			
	
}
