package com.delta.stepDefs;

import com.delta.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logintest {
	

	@Given("I am on the homepage")
	public void iAmOnTheHomepage() {
	    
	}

	@When("I click on LogIn")
	public void iClickOnLogIn() {
	   HomePage hp = new HomePage();
	   hp.loginButton.click();
		
		
		
	}

	@Then("I logged in")
	public void iLoggedIn() {
	   
	}


	
	
	
}
