package com.delta.stepDefs;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import com.delta.pages.ShopHotelsPage;
import com.delta.pojos.User;
import com.delta.utilities.BrowserUtilities;
import com.delta.utilities.Driver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopHotelsStepDefs {
	

	@When("I click shop hotel")
	public void iClickShopHotel() {
		JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
		
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("arguments[0].click();", new ShopHotelsPage().shopHot);
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

	@When("I enter all required information")
	public void iEnterAllRequiredInformation() {
		ShopHotelsPage sh = new ShopHotelsPage();
		
		sh.destButton.sendKeys("Austin");
		BrowserUtilities.waitFor(1);
		sh.destButton.sendKeys(Keys.ARROW_DOWN);
		sh.destButton.sendKeys(Keys.ARROW_DOWN);
		sh.destButton.sendKeys(Keys.ENTER);
		sh.pickUp.click();
		sh.hotelcalendar();
		sh.rooms.click();
		sh.rooms.sendKeys(Keys.ENTER);
		String expected = "Important: This destination may have COVID-19 travel restrictions in place,"
				+ " including specific restrictions for lodging. Check any national, local, "
				+ "and health advisories for this destination before you book.";
		String actual = sh.verText.getText();
		String title = Driver.getDriver().getTitle();
		System.out.println(title);
		Assert.assertEquals(expected,actual);
		
	}
	  
	

	
	@When("I click  on {string}")
	public void iClickOn(String hotelName){
	   new ShopHotelsPage().clickOnHotelName(hotelName);

		String expectedTitle1 = "Find & Book Airline Tickets : Delta Air Lines";

		String current = Driver.getDriver().getWindowHandle();

		String otherWindow = "Delta - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations";

		for (String i : Driver.getDriver().getWindowHandles()) {

			if (!(current.equals(i)) && !(current.equals(otherWindow))) {

				Driver.getDriver().switchTo().window(i);
			}
		}
	   BrowserUtilities.waitFor(2);
	}
	
	@Then("The hotel details should be the following")
	public void theHotelDetailsShouldBeTheFollowing(List<Map<String,String>> dataTable) {
		
		
		
		ShopHotelsPage sh = new ShopHotelsPage ();
		String actualName = sh.hotelName.getText();
		String actualCheckIn = sh.chechInDate.getAttribute("value");
	    String actualCheckOut = sh.chechOutDate.getAttribute("value");
	    String actualRooms = sh.returnFirstSelectedOption1().getText();
	    String actualAdults = sh.returnFirstSelectedOption2().getText();
	    String actualChildren = sh.returnFirstSelectedOption3().getText();
	    
	    Map<String,String> map = dataTable.get(0);
	    
	    Assert.assertEquals(map.get("hotelName"),actualName);
	    Assert.assertEquals(map.get("chechIn"),actualCheckIn);
	    Assert.assertEquals(map.get("checkOut"),actualCheckOut);
	    Assert.assertEquals(map.get("rooms"),actualRooms);
	    Assert.assertEquals(map.get("adults"),actualAdults);
	    Assert.assertEquals(map.get("children"),actualChildren);
	    
	    
	}
	
	@Then("click on search buttonn")
	public void clickOnSearchButtonn() {
	   
		new ShopHotelsPage().search.click();

}
	@Then("The hotel details should be the following using custom type")
	public void theHotelDetailsShouldBeTheFollowingUsingCustomType(User user) {

		ShopHotelsPage sh = new ShopHotelsPage ();
		String actualName = sh.hotelName.getText();
		String actualCheckIn = sh.chechInDate.getAttribute("value");
	    String actualCheckOut = sh.chechOutDate.getAttribute("value");
	    String actualRooms = sh.returnFirstSelectedOption1().getText();
	    String actualAdults = sh.returnFirstSelectedOption2().getText();
	    String actualChildren = sh.returnFirstSelectedOption3().getText();
	    	    		
	    Assert.assertEquals(user.getHotelName(),actualName);
	    Assert.assertEquals(user.getChechIn(),actualCheckIn);
	    Assert.assertEquals(user.getCheckOut(),actualCheckOut);
	    Assert.assertEquals(user.getRoom(),actualRooms);
	    Assert.assertEquals(user.getAdult(),actualAdults);
	    Assert.assertEquals(user.getChildren(),actualChildren);
	    
	}

	
	
}