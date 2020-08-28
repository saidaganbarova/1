package com.delta.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.Driver;

public class OptionsPage {
	
	public OptionsPage() {
		
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "//li[@class='shopping-link-2']//a[contains(text(),'Shop Hotels')]")
	public WebElement shopHot;

	

	public WebElement getOption(String option) {
		String xpath = "//a[.='"+   option    +"']";
		return Driver.getDriver().findElement(By.xpath(xpath));
	
 
  }

}
