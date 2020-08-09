package com.automationpractice.stepDefs;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.automationpractice.pages.DressesPage;
import com.automationpractice.pages.HomePage;
import com.automationpractice.utilities.BrowserUtilities;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DressStylesStepDefs {
	
	@When("I click on dresses button")
	public void iClickOnDressesButton() {
	   new HomePage().dressButton.click();
	}

	@Then("The following subcategories should be there")
	public void theFollowingSubcategoriesShouldBeThere(List<String> expected) {
	    
		List<String> actual = BrowserUtilities.getElementsText(new DressesPage().subcategories);
		int i = 0;
		for (String dress : actual) {
			Assert.assertEquals(expected.get(i).toUpperCase(), dress);
			i++;
		}
		
		
	}

}
