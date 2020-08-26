package com.delta.stepDefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.interactions.Actions;

import com.delta.utilities.BrowserUtilities;
import com.delta.utilities.ConfigReader;
import com.delta.pages.HomePage;
import com.delta.pages.LoginPage;
import com.delta.utilities.Driver;
import com.delta.utilities.ExcelUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginPageStepDef {
	

	@Given("I am on the homepage")
	public void iAmOnTheHomepage() {
		
		

		Driver.getDriver().get(ConfigReader.getProperty("url"));
	    
	}

	@When("I click on LogIn")
	public void iClickOnLogIn() {
	   HomePage hp = new HomePage();
	   Actions a = new Actions(Driver.getDriver());
	   a.moveToElement(hp.loginButton).click().build().perform();
	 
	   
	   BrowserUtilities.waitFor(5);
	   LoginPage lp = new LoginPage();
	   lp.usernameInputBox.sendKeys("caffeine4130");
	   lp.LastNameInputBox.sendKeys("Young");
	   lp.passwordInputBox.sendKeys("Mooncat123!");
	   lp.loginButton.click();
		
		
		
	}

	@Then("I logged in")
	public void iLoggedIn() { 
		BrowserUtilities.waitFor(5);
		System.out.println(Driver.getDriver().getTitle());
		Assert.assertEquals("Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site", Driver.getDriver().getTitle());
	
	
	
	}

	
	
	
	@When("I enter {string} and {string}")
	public void iEnterAnd(String a, String b) {
		   LoginPage lp = new LoginPage();
		   BrowserUtilities.waitFor(3);
		 
		   lp.usernameInputBox.sendKeys(a);
		   lp.LastNameInputBox.sendKeys("Young");
		   lp.passwordInputBox.sendKeys(b);
		   lp.loginButton.click();
	
	
	}
	
	

	
	
//	@When("I login with parametrs")
//	public void iloginwithparametrs() {
//	   HomePage hp = new HomePage();
//	   Actions a = new Actions(Driver.getDriver());
//	   a.moveToElement(hp.loginButton).click().build().perform();
//	 
//	   
//	   BrowserUtilities.waitFor(5);
//	   }
	
	
	
	@When("Use excel File to enter login info")
	public void useExcelFileToLogin() {
		HomePage hp = new HomePage();
		LoginPage lp = new LoginPage();
		
		ExcelUtils sheet = new ExcelUtils("loginIntro.xlsx", "Sheet1");
		List <Map <String, String>> data = sheet.getDataAsListOfMaps();
	   // System.out.println(data);
	  
		String actual = "Iuliia";
		
		for (int i = 0; i< data.size(); i++) {
			Map< String, String > row = data.get(i);
		
			Actions a = new Actions(Driver.getDriver());
			a.moveToElement(hp.loginButton).click().build().perform();
			BrowserUtilities.waitFor(5);
	    	lp.usernameInputBox.sendKeys(row.get("Login"));
	    	lp.LastNameInputBox.sendKeys("Young");
	    	lp.passwordInputBox.sendKeys(row.get("Password"));
	    	lp.loginButton.click();
	    	BrowserUtilities.waitFor(5);
	    	Assert.assertEquals(lp.nameConfirmation.getText(), "Iuliia");
	    	BrowserUtilities.waitFor(2);
	    	lp.nameConfirmation.click();
	    	BrowserUtilities.waitFor(2);
	    	lp.logout.click();
	    	BrowserUtilities.waitFor(5);
	    	
	    	
			
		}
	    
	    
	}

	
	
	
	
	
	
	
	
	
	
	
}
