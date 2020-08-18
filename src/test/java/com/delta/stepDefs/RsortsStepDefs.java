package com.delta.stepDefs;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import com.delta.pages.BookPage;
import com.delta.pages.ResortPage;
import com.delta.utilities.BrowserUtilities;
import com.delta.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RsortsStepDefs {
	
	

    @When("I click on shop hotels")
    public void iClickOnShopHotels() {
    	JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    	js.executeScript("window.scrollBy(0,500)");
    	js.executeScript("arguments[0].click();", new BookPage().shopHot );
   
}

	@When("I click on resorts")
	public void iClickOnResorts() {
		
		JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
		BrowserUtilities.waitFor(1);
		String expectedTitle1 = "Find & Book Airline Tickets : Delta Air Lines";

		String current = Driver.getDriver().getWindowHandle();

		String otherWindow = "Delta - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations";

		for (String i : Driver.getDriver().getWindowHandles()) {

			if (!(current.equals(i)) && !(current.equals(otherWindow))) {

				Driver.getDriver().switchTo().window(i);
			}
		}
		
		js.executeScript("window.scrollBy(0,500)");
		BrowserUtilities.waitFor(1);
		js.executeScript("arguments[0].click();", new ResortPage().resort );
	}

	@When("I fill out all info")
	public void iFillOutAllInfo() {
		ResortPage rp = new ResortPage();
		
		rp.destButton.clear();
		rp.destButton.sendKeys("Austin");
		BrowserUtilities.waitFor(1);
		rp.destButton.sendKeys(Keys.ARROW_DOWN);
		rp.destButton.sendKeys(Keys.ARROW_DOWN);
		rp.destButton.sendKeys(Keys.ENTER);
		rp.clickCal1.click();
		rp.calenTable();
		BrowserUtilities.waitFor(2);
		rp.clickCal2.click();
		rp.calenTable1();
		rp.room.click();
		rp.submit.click();
		
	}

	@Then("I should be able to land on the next page")
	public void iShouldBeAbleToLandOnTheNextPage() {
		
		BrowserUtilities.waitFor(2);
		String actual = new ResortPage().text.getText();
		String expected = "Important: This destination may have COVID-19 travel restrictions in place, including specific restrictions for lodging. Check any national, local, and health advisories for this destination before you book.";
		Assert.assertEquals(actual, expected);
		

	}

}
