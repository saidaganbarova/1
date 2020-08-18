package com.delta.stepDefs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import com.delta.pages.AboutDeltaPage;
import com.delta.pages.BookPage;
import com.delta.utilities.BrowserUtilities;
import com.delta.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AboutDeltaStepDefs {
	
	
	@Given("I click on search butoon")
	public void iClickOnSearchButoon() {
		AboutDeltaPage ad = new  AboutDeltaPage();
		JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
		BrowserUtilities.waitForPageToLoad(3);
		ad.search.click();  
		ad.enter.sendKeys("About");
		BrowserUtilities.waitFor(1);
 		ad.about.click();
 		js.executeScript("window.scrollBy(0,500)");
 		BrowserUtilities.waitFor(3);
 		js.executeScript("arguments[0].click();",ad.play);
 		//BrowserUtilities.waitFor(1);
	}

	@When("I am on video button")
	public void iAmOnVideoButton() {
	   
	}

	@When("I click on play button")
	public void iClickOnPlayButton() {
	    
	}

	@Then("I verify the functionalities")
	public void iVerifyTheFunctionalities() {
	    
	}



}
