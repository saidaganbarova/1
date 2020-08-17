package com.delta.stepDefs;



import org.junit.Assert;
import org.openqa.selenium.Keys;

import com.delta.pages.BookPage;
import com.delta.utilities.ConfigReader;
import com.delta.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookStepDefs {
	
	
	
	
	
	@Given("I am on home page")
	public void iOnHomePage() {
		
		Driver.getDriver().get(ConfigReader.getProperty("url"));

	    
	}

	@When("I click on from button and enter a destination")
	public void iClickOnFromButtonAndEnterADestination() {
		
		BookPage bp = new BookPage();
		bp.fromButton.sendKeys("IAD" + Keys.ENTER);
		bp.fromButtonClose.click();
	    
	}

	@When("when I click on to button and enter a destinatin")
	public void whenIClickOnToButtonAndEnterADestinatin() {
		BookPage bp = new BookPage();
		bp.toButton.sendKeys("AUS" + Keys.ENTER);
		bp.toButtonClose.click();
	}

	@When("when I click on trip button and select one")
	public void whenIClickOnTripButtonAndSelectOne() {
	    
		BookPage bp = new BookPage();
		
		bp.selectTripButton.click();
		bp.selectRoundTripButton.click();
		
	}

	@When("when select the dates and passenger amount")
	public void whenSelectTheDatesAndPassengerAmount() {
		
		 new BookPage().confirmHomePage();
	  
	}

	@When("yet when I click on submit button")
	public void yetWhenIClickOnSubmitButton() {
	    new BookPage().submitButton.click();
	}

	@Then("I shoul be able to land on the next page")
	public void iShoulBeAbleToLandOnTheNextPage() {
		String actualTitle = Driver.getDriver().getTitle();
		String expectedTitle="Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site";
		Assert.assertEquals(actualTitle, expectedTitle);
				
		
	}



}
