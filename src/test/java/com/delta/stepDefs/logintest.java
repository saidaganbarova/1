package com.delta.stepDefs;

import org.openqa.selenium.interactions.Actions;

import com.delta.utilities.BrowserUtilities;
import com.delta.utilities.ConfigReader;
import com.delta.pages.HomePage;
import com.delta.pages.LoginPage;
import com.delta.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logintest {
	

	@Given("I am on the homepage")
	public void iAmOnTheHomepage() {
		
		

		Driver.getDriver().get(ConfigReader.getProperty("url"));
	    
	}

	@When("I click on LogIn")
	public void iClickOnLogIn() {
	   HomePage hp = new HomePage();
	   Actions a = new Actions(Driver.getDriver());
	   a.moveToElement(hp.loginButton).click().build().perform();
	   //hp.loginButton.click();
	   
	   BrowserUtilities.waitFor(3);
	   LoginPage lp = new LoginPage();
	   lp.usernameInputBox.sendKeys("Testerqwe");
	   lp.LastNameInputBox.sendKeys("test");
	   lp.passwordInputBox.sendKeys("Mooncat123");
	   lp.loginButton.click();
		
		
		
	}

	@Then("I logged in")
	public void iLoggedIn() { 
	}


	
	
	
}
