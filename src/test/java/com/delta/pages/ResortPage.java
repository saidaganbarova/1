package com.delta.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.Driver;





public class ResortPage {
	
  public ResortPage() {
		
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//div[@class='property-name fs-bird'][contains(text(),'Resorts')]")
	public WebElement resort;


	@FindBy(xpath = "//div[contains(@class,'cont widget-query widget-query-compact-occupancy sqm-constrained widget-query-nights-display')]//input[contains(@name,'q-destination')]")
	public WebElement destButton;
	
	@FindBy(xpath = "//div[@class='cont widget-query widget-query-compact-occupancy sqm-constrained widget-query-nights-display']//div[1]//label[2]")
	public WebElement clickCal1;

	@FindBy(xpath = "//div[@class='widget-overlay widget-overlay-query widget-overlay-active']//div[@class='widget-query-group widget-query-dates']//div[2]//label[2]")
	public WebElement clickCal2;
	
	@FindBy(xpath = "//table[@class='widget-datepicker-contains-selected widget-datepicker-contains-highlight widget-datepicker-contains-range-end']//td")
	public List <WebElement> calTable;
	
	@FindBy(xpath = "//div[@class='cont widget-query widget-query-compact-occupancy sqm-constrained widget-query-nights-display']//div[@class='widget-query-group widget-query-occupancy']//select")
	public WebElement room;
	
	@FindBy(xpath = "//button[@class='cta widget-overlay-ok']")
	public WebElement submit;
	
	

	@FindBy(xpath = "//p[@class='pv-ant']")
	public WebElement text;
	
	@FindBy (xpath ="//h1[@class='hidden--xs hidden--s-m mt-small']")
	public WebElement hotelText ;
	
	
	public void calenTable() {
		
		for (int i = 0; i <calTable.size(); i++) {
			String date = calTable.get(i).getText();
			if (date.equalsIgnoreCase("23")) {
				calTable.get(i).click();
				break;
			}
		}
	}
		

		public void calenTable1() {
		for (int i = 0; i < calTable.size(); i++) {
			String date = calTable.get(i).getText();
			if (date.equalsIgnoreCase("26")) {
				calTable.get(i).click();
				break;
			}
			
			
		}
	
	}
	
}
