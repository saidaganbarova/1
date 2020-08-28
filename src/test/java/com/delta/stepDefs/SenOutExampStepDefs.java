package com.delta.stepDefs;


import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import com.delta.pages.SenOutlineExampPage;
import com.delta.utilities.BrowserUtilities;
import com.delta.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SenOutExampStepDefs {
	
	
	
	
	@Given("I click on uptaded bags & travel fees")
	public void iClickOnUptadedBagsTravelFees() {
		JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("arguments[0].click();",new SenOutlineExampPage().updateBag);
		BrowserUtilities.waitFor(1);
		String expectedTitle1 = "Find & Book Airline Tickets : Delta Air Lines";

		String current = Driver.getDriver().getWindowHandle();

		String baggageFees = "Baggage Policy and Fees | Delta Air Lines";

		for (String i : Driver.getDriver().getWindowHandles()) {

			if (!(current.equals(i)) && !(current.equals(baggageFees))) {

				Driver.getDriver().switchTo().window(i);
			}
		}
		BrowserUtilities.waitFor(1);
		js.executeScript("window.scrollBy(0,800)");

		
	}

	@Given("I clic on my trips")
	public void iClicOnMyTrips() {
		
		new SenOutlineExampPage().myTrips.click();
	    
	}

	@When("I click on confirmation number")
	public void iClickOnConfirmationNumber() {
		new SenOutlineExampPage().cordNO.click();
	}

	@When("I enter {string} in the field")
	public void iEnterInTheField(String firstName) {
	   
		new SenOutlineExampPage().firstName.sendKeys(firstName);
	}

	@When("I enter {string} the field")
	public void iEnterTheField(String lastNAme) {
		new SenOutlineExampPage().lastName.sendKeys(lastNAme);
	}

	@Then("I enter {string}")
	public void iEnter(String confirmNO) {
		new SenOutlineExampPage().cardNoText.sendKeys(confirmNO);
		new SenOutlineExampPage().findMyTrip.click();
	}

	@Then("Verify the error text")
	public void verifyTheErrorText() {
	    
		BrowserUtilities.waitFor(3);
		String expected = new SenOutlineExampPage().errorMessage.getText();
		String actual = "Uh-oh! We're sorry, we need to collect other information to display your reservation. "
				+ "Please try searching by your Ticket Number.";
		
		
		Assert.assertEquals(expected, actual);
		
//		try {
//		    	Assert.assertEquals(expected, actual);
//		      System.out.println("PASSED");
//		    } catch (Exception e) {
//		      System.out.println("Something went wrong.");
//		    }
			
	}




	
	}