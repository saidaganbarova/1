package com.delta.stepDefs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.delta.pages.HomePage;
import com.delta.pages.SignUpPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpDefs {

	
	@When("I click on Sign Up button")
	public void iClickOnSignUpButton() {
	   
	   HomePage hp = new HomePage();
	   hp.signUpButton.click();
	   
	   
	   
	}

	@When("I fill out all the required fields")
	public void iFillOutAllTheRequiredFields() {
		SignUpPage su = new SignUpPage();
		   su.firstName.sendKeys("Elshan");
		   su.lastName.sendKeys("Guliyev");
		   List<WebElement> genderOptions = su.gender.findElements(By.tagName("li"));
		   for (WebElement we : genderOptions) {
				if (we.getText().equals("Male")) {
					we.click();
				}

			}
		   }
		   
		   
		   
	
	@When("I click on complete")
	public void iClickOnComplete() {
	  
	}

	@Then("I verify account is created")
	public void iVerifyAccountIsCreated() {
	   
	}
	
}
