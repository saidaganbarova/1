package com.delta.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.Driver;

public class CommentPage {


	public CommentPage () {
		
		PageFactory.initElements(Driver.getDriver(), this);
	}

		@FindBy (xpath = "//a[@class='popular-list-1']")
		public WebElement needHelpButton;
		
		// Click on Comment/Complain button
		@FindBy (xpath = "//a[contains(text(),'Yes')]")
		public WebElement CommentComplainButton;
		
		// Submit General Feedback : checkboxes > Continue to Personal Information> 
		// Fill up-> Continue To Comment-> fill up-> Review-> Confirmation. 

		@FindBy (xpath = "//label[2]")
		public WebElement labelButton;
		
		@FindBy (xpath = "//select[@name='select']")
		public WebElement chooseButton;
		
		@FindBy (xpath = "//textarea[@class='fsrVisible acs-feedback__control acs-feedback__control--textarea']")
		public WebElement messageButton;
	
		@FindBy (xpath = "//button[@class='acs-feedback__button acs-feedback__button--expand acs-submit-feedback__button']")
		public WebElement submitButton;
				
		@FindBy (xpath = "/button[@class='acs-close-button acs-feedback__button acs-feedback__button--epilogue acs-feedback__button--expand']")
		public WebElement okButton;
	

}

