
package com.delta.stepDefs;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.delta.pages.OptionsPage;
import com.delta.utilities.BrowserUtilities;
import com.delta.utilities.Driver;
import com.github.javafaker.Options;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class OptionStepDefs {
	
	 @When("click on shop hotel")
	 public void clickOnShopHotel() {
		JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("arguments[0].click();", new OptionsPage().shopHot);
		BrowserUtilities.waitFor(1);
		String expectedTitle1 = "Find & Book Airline Tickets : Delta Air Lines";

		String current = Driver.getDriver().getWindowHandle();

		String otherWindow = "Delta - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations";

		for (String i : Driver.getDriver().getWindowHandles()) {

			if (!(current.equals(i)) && !(current.equals(otherWindow))) {

				Driver.getDriver().switchTo().window(i);
			}
		}

	}
	 @When("click on {string}")
	 public void clickOn(String option) {
		 new OptionsPage().getOption(option).click();
	     
	 }

	@Then("I shoul be able land on {string}")
	public void iShoulBeAbleLandOn(String title) {
		
		

	}

		   
		  
			   
			 
				 
				
			}

	


