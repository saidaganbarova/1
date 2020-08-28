package com.delta.stepDefs;

import java.util.List;

import org.junit.Assert;

import com.delta.pages.CustomTypePage;
import com.delta.pojos.Customer;
import com.delta.utilities.BrowserUtilities;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class CustomTypeStepDefs {

	
	
	
	@When("I click on my trips")
	public void iClickOnMyTrips() {
	   
		new CustomTypePage().clickOnMyTrips.click();
	}

	@Then("I should be able to submit with the following details")
	public void iShouldBeAbleToSubmitWithTheFollowingDetails(List<Customer> customers) {
		
		Customer customer = customers.get(0);
		CustomTypePage cp = new CustomTypePage();
		
		cp.enterConfirNo.sendKeys(customer.getConfirmNo());
	    cp.enterFirstName.sendKeys(customer.getFirstName());
	    cp.enterLastName.sendKeys(customer.getLastName());
	}

	@Then("verify the text in the next page")
	public void verifyTheTextInTheNextPage() {
		new CustomTypePage().clickOnSubmitButton.click();
		BrowserUtilities.waitFor(2);
		String expected = new CustomTypePage().verifyTextButton.getText();
		String actual = "Whoops! We're sorry, we could not find any reservation with the information you have provided."
				+ " Please check your documentation and try again.";
		Assert.assertEquals(expected, actual);

}
}