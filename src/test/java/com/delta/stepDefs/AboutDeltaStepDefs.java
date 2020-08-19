package com.delta.stepDefs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
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
		
		
		BrowserUtilities.waitForPageToLoad(3);
		ad.search.click();  
		ad.enter.sendKeys("About");
		BrowserUtilities.waitFor(1);
 		ad.about.click();
 		
 		
 		
	//a.clickAndHold(ad.scroll).moveByOffset(15, 0).click().build().perform();
 		
 		//js.executeScript("arguments[0].click();",ad.play);
 		//BrowserUtilities.waitFor(1);
// 		
// 		a.click(dnh.play).build().perform();
//		a.clickAndHold(dnh.scroll).moveByOffset(15, 0).click().build().perform();
 		//div[@class='youtube-player']//iframe
	}

	@When("I am on video button")
	public void iAmOnVideoButton() {
		
		AboutDeltaPage ad = new  AboutDeltaPage();
		Actions a = new Actions(Driver.getDriver());
		JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
		js.executeScript("window.scrollBy(0,500)");
 		BrowserUtilities.waitFor(3);
 		a.click(ad.play).build().perform();
 		BrowserUtilities.waitFor(2);
 		
 		
	}

	@When("I click on play button")
	public void iClickOnPlayButton() {
		
		AboutDeltaPage ad = new  AboutDeltaPage();
		Actions a = new Actions(Driver.getDriver());
		JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
		
 		BrowserUtilities.waitFor(2);
 		ad.playAgain.click();
 		
		
	}

	@Then("I verify the functionalities")
	public void iVerifyTheFunctionalities() {
		
		AboutDeltaPage ad = new  AboutDeltaPage();
		Actions a = new Actions(Driver.getDriver());
		JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
//		
//		ad.playAgain.click();
//		ad.settings.click();
//		ad.playAgain.click();
		
		
		
		
		
		//ad.againPlay.click();
		a.click(ad.playAgain).build().perform();
		a.clickAndHold(ad.scroll).moveByOffset(15, 0).click().build().perform();

		BrowserUtilities.waitFor(2);
		ad.playAgain.click();
		BrowserUtilities.waitFor(2);
		ad.youtube.click();
	}


}
