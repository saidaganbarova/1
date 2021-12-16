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
		String name = ad.about.getText();
		System.out.println(name);
		if (name.equalsIgnoreCase("About Delta")) {
 		ad.about.click();
		}
 		
 		

	}

	@When("I am on video button")
	public void iAmOnVideoButton() throws InterruptedException {
		
		AboutDeltaPage ad = new  AboutDeltaPage();
		Actions a = new Actions(Driver.getDriver());
		JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
		js.executeScript("window.scrollBy(0,300)");
 		BrowserUtilities.waitFor(3);
 		a.click(ad.play).build().perform();
 		BrowserUtilities.waitFor(2);
 		Thread.sleep(2000);
 		
 		
	}

@When("I click on play button")
	public void iClickOnPlayButton() {
		
		AboutDeltaPage ad = new  AboutDeltaPage();
		Actions a = new Actions(Driver.getDriver());
		JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
		
 		BrowserUtilities.waitFor(2);
 		ad.playAgain.click();
 		Driver.getDriver().switchTo().frame(ad.iframe);
 	//	a.clickAndHold(ad.scroll).moveByOffset(5, 0).click().build().perform();
	}

	@Then("I verify the functionalities")
	public void iVerifyTheFunctionalities() {
		
		AboutDeltaPage ad = new  AboutDeltaPage();
		Actions a = new Actions(Driver.getDriver());
		JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
		BrowserUtilities.waitFor(5);
		ad.sound.click();
		BrowserUtilities.waitFor(2);
		ad.subtitles.click();
		//BrowserUtilities.waitFor(2);
		//ad.settings.click();
		BrowserUtilities.waitFor(2);
		ad.click.click();
		BrowserUtilities.waitFor(2);
		ad.fullScreen.click();
		BrowserUtilities.waitFor(2);
		
	}


}
