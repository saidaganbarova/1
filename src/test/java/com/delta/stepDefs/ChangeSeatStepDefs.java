package com.delta.stepDefs;

import org.openqa.selenium.JavascriptExecutor;

import com.delta.pages.ChangeSeatPage;
import com.delta.utilities.BrowserUtilities;
import com.delta.utilities.Driver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangeSeatStepDefs {

	@When("I click on Need Help?")
	public void iClickOnNeedHelp() {

		ChangeSeatPage csp = new ChangeSeatPage();

		//JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

		BrowserUtilities.waitFor(3);
		csp.needHelpButton.click();

	}

	@When("I click on Seats Help")
	public void iClickOnSeatsHelp() {

		ChangeSeatPage csp = new ChangeSeatPage();

		BrowserUtilities.waitFor(3);
		csp.seatsHelpButton.click();
	}

	@When("I click on Change\\/Upgrde Your Seat")
	public void iClickOnChangeUpgrdeYourSeat() {

		ChangeSeatPage csp = new ChangeSeatPage();
		JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

		BrowserUtilities.waitFor(1);

		js.executeScript("window.scrollBy(0,300)");
		csp.changeUpgradeYourSeatButton.click();

	}

	@Then("I should be able get Whoops Not Found Page")
	public void iShouldBeAbleGetWhoopsNotFoundPage() {

		ChangeSeatPage csp = new ChangeSeatPage();
		
		BrowserUtilities.waitFor(3);
		
		
		csp.firstName.sendKeys("Michael");

		csp.lastName.sendKeys("Adams");

		csp.confirmationNumber.sendKeys("DL9856");

		csp.findMyTripButton.click();
	}
}
