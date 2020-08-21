package com.delta.stepDefs;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import com.delta.pages.HotelVerificationPage;
import com.delta.utilities.BrowserUtilities;
import com.delta.utilities.Driver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelVerificationStepDefs {

	
	@When("I verify all the information")
	public void iVerifyAllTheInformation() {
		HotelVerificationPage hv = new HotelVerificationPage();

		String expectedTitle1 = "Find & Book Airline Tickets : Delta Air Lines";

		String current = Driver.getDriver().getWindowHandle();

		String otherWindow = "Delta - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations";

		for (String i : Driver.getDriver().getWindowHandles()) {

			if (!(current.equals(i)) && !(current.equals(otherWindow))) {

				Driver.getDriver().switchTo().window(i);
			}
		}

		BrowserUtilities.waitFor(1);
		JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
		js.executeScript("window.scrollBy(0,500)");

		for (int i = 0; i < 10; i++) {
			BrowserUtilities.waitFor(1);
			hv.photos.click();
		}

		js.executeScript("window.scrollBy(0,500)");

		String actualName = hv.hotelName.getText();
		System.out.println("Hotel name: " + actualName);
		String expectedName = "Lakeway Resort and Spa";
		Assert.assertEquals(actualName, expectedName);
		
		String actualAddress = hv.hotelAddress.getText();
		System.out.println("Hotel address: " + actualAddress);
		String expectedAddress = "101 Lakeway Dr, Lakeway, TX, 78734, United States of America";
		Assert.assertEquals(actualAddress, expectedAddress);
		
		String actualNigttlyPrice = hv.nightlyPrice.getText();
		System.out.println("Nigtly price: " + actualNigttlyPrice);
		String expectedNightlyPrice = "$193";
		Assert.assertEquals(actualNigttlyPrice, expectedNightlyPrice);
		
		String actualTotalPrice = hv.totalPrice.getText();
		System.out.println("Total price " + actualTotalPrice);
		String expectedTotalPrice = "($580 for 3 nights)";
		Assert.assertEquals(actualTotalPrice, expectedTotalPrice);
		
		String actualRoomType = hv.roomType.getText();
		System.out.println("Room type: " + actualRoomType);
		String expectedRoomType = "Non-Lakeview, King with Balcony";
		Assert.assertEquals(actualRoomType, expectedRoomType);
		
		String actualCancelText = hv.freeCancel.getText();
		System.out.println("Cancel text: " + actualCancelText);
		String expectedCancelText = "Cancellation policy";
		Assert.assertEquals(actualCancelText, expectedCancelText);
	}
	

	@Then("I should be able reserve")
	public void iShouldBeAbleReserve() {
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
