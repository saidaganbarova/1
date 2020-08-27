package com.delta.stepDefs;

import org.junit.Assert;

import com.delta.pages.HomePage;
import com.delta.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class HomePageStepDef {
	
	@Given("I click on {string}")
	public void iClickOn(String str) {
	   HomePage hp = new HomePage();
	   hp.getMenu(str).click();
	   
	}

	@Then("I confirm the {string}")
	public void iConfirmThe(String title) {
	   Assert.assertEquals(title, Driver.getDriver().getTitle());
	}
	
	

}
