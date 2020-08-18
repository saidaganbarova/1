package com.delta.stepDefs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import com.delta.pages.ResortVerificationPage;
import com.delta.utilities.BrowserUtilities;
import com.delta.utilities.Driver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ResortVerivicationStepDefs {

	
	
	@When("I selct free WIFI")
	public void iSelctFreeWIFI() {
		JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
		js.executeScript("window.scrollBy(0,500)");
		BrowserUtilities.waitFor(1);
		new ResortVerificationPage().wifi.click();	
	}

	@When("Selct the price")
	public void selctThePrice() {

		 BrowserUtilities.waitFor(2);
		 Actions acs = new Actions(Driver.getDriver());
		 acs.clickAndHold( new ResortVerificationPage().price).moveByOffset(-60,0).click().build().perform();
		 
	
	}

	@Then("I do some verification")
	public void iDoSomeVerification() {
		ResortVerificationPage rv =	new ResortVerificationPage();
		String actualText = rv.resortName.getText();
		System.out.println(actualText);
		if(actualText.equalsIgnoreCase("Lakeway Resort and Spa")) {
			rv.click.click();
	
		}
		
		
}



}
