package com.automationpractice.stepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.ProductPage;
import com.automationpractice.utilities.Driver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ProductInfoStepDefinitions {
	
	String expectedProduct;
	
	@When("I click on Blouse")
	public void i_click_on_blouse() {
	    new HomePage().blouse.click();
	}

	@Then("The product name should be Blouse in the product page")
	public void the_product_name_should_be_blouse_in_the_product_page() {
	    String actual = new ProductPage().product.getText();
	    
	    Assert.assertEquals("Blouse", actual);
	    
	    Driver.quit();
	}
	
	
	@When("I click on {string}")
	public void i_click_on(String product) {
		
		new HomePage().clickOnProduct(product);
		
		expectedProduct = product;
		
	    
	}

	@Then("The product name should be correct")
	public void the_product_name_should_be_in_the_product_page() {
		
		String actual = new ProductPage().product.getText();
		Assert.assertEquals(expectedProduct, actual);
	   
	}
	
	
	
	@Then("The product quantity should be {int} and the product price should be {double}")
	public void the_product_quantity_should_be_and_the_product_price_should_be(Integer expectedQuantity, Double expectedPrice) {
		String actual = new ProductPage().quantityBox.getAttribute("value");
	    
	    Assert.assertEquals(expectedQuantity, Integer.valueOf(actual));
	    
	    Double actualPrice = Double.valueOf(new ProductPage().price.getText().replace("$", ""));
	    
	    Assert.assertEquals(expectedPrice, actualPrice);
	    
	    
	}
	
	
	@When("I click on {word} button {int} times")
	public void i_click_on_plus_button_times(Integer int1, String word) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The quantity should be correct")
	public void the_quantity_should_be_correct() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
