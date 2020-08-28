package com.delta.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.delta.utilities.BrowserUtilities;
import com.delta.utilities.Driver;



public class ShopHotelsPage {

	
	
	
	//SAIDA
		public ShopHotelsPage() {
			
			PageFactory.initElements(Driver.getDriver(), this);
		}

		@FindBy(xpath = "//li[@class='shopping-link-2']//a[contains(text(),'Shop Hotels')]")
			public WebElement shopHot;
		

		@FindBy(xpath = "//input[@id='qf-0q-destination']")
			public WebElement destButton;;
		

		@FindBy(xpath = "//input[@id='qf-0q-localised-check-in']")
			public WebElement pickUp;
		
			
		@FindBy(xpath = "//div[@class='widget-daterange-cont']//div[2]//div[2]//table[1]//td")
				public List <WebElement> pickUpDate;
		

		@FindBy(xpath = "//input[@name='q-localised-check-out']")
			public WebElement checkout;
		
		@FindBy(xpath = "//div[@class='widget-daterange-cont']//div[2]//div[2]//table[1]//td")
		public List <WebElement> checkoutDate;
		
		@FindBy(xpath = "//select[@id='qf-0q-compact-occupancy']")
		public WebElement rooms;
		
		@FindBy(xpath = "//p[@class='pv-ant']")
		public WebElement verText;
		
		@FindBy(xpath = "//h1[contains(text(),'Hyatt House Austin')]")
		public WebElement hotelName;
		
		@FindBy(xpath = "//div[contains(@class,'totp-change-search-container')]//input[contains(@name,'q-localised-check-in')]")
		public WebElement chechInDate;
		
		@FindBy(xpath = "//div[contains(@class,'totp-change-search-container')]//input[contains(@name,'q-localised-check-out')]")
		public WebElement chechOutDate;

		@FindBy(xpath = "//div[contains(@class,'totp-change-search-container')]//select[contains(@name,'q-rooms')]")
		public WebElement room;
		
		@FindBy(xpath = "//div[contains(@class,'totp-change-search-container')]//select[contains(@name,'q-room-0-adults')]")
		public WebElement adult;
		
		@FindBy(xpath = "//div[contains(@class,'totp-change-search-container')]//select[contains(@name,'q-room-0-children')]")
		public WebElement children;
		
		@FindBy(xpath = "//div[contains(@class,'totp-change-search-container')]//button[contains(@class,'cta cta-strong')][contains(text(),'Search')]")
		public WebElement search;
		
		
		public WebElement returnFirstSelectedOption1() {
			return new Select(room).getFirstSelectedOption();
		}
		
		public WebElement returnFirstSelectedOption2() {
			return new Select(adult).getFirstSelectedOption();
		}
		public WebElement returnFirstSelectedOption3() {
			return new Select(children).getFirstSelectedOption();
		}
		
		
		
		public void hotelcalendar() {
			
			
			for (int i = 0; i < pickUpDate.size(); i++) {
				String date = pickUpDate.get(i).getText();
				if (date.equalsIgnoreCase("28")) {
					pickUpDate.get(i).click();
					break;
				}
			}
			checkout.click();
		BrowserUtilities.waitFor(2);
			for (int i = 0; i < checkoutDate.size(); i++) {
				String date = checkoutDate.get(i).getText();
				if (date.equalsIgnoreCase("4")) {
					checkoutDate.get(i).click();
					break;
				}
				//h5//a[@title='"+product+"']"
}
}
		
		public void clickOnHotelName(String hotelName) {
			String xpath = "//a[contains(text(),'"+hotelName+"')]";
			Driver.getDriver().findElement(By.xpath(xpath)).click();
			
		}
}