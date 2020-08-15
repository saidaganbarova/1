package com.automationpractice.stepDefs;

import com.automationpractice.pages.ProductPage;
import com.automationpractice.pojos.Cart;
import com.automationpractice.utilities.BrowserUtilities;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingCartStepDefs {
	
	@When("when I increase the quantity to {int} and add to cart and proceed to checkout")
	public void whenIIncreaseTheQuantityToAndAddToCartAndProceedToCheckout(Integer times) {
		
		ProductPage pp =	new ProductPage();
				
	    for (int i = 1; i < times; i++) {
	    	pp.plusButton.click();
		}
	    pp.addToCartButton.click();
	    
	    BrowserUtilities.waitFor(2);
	    
	    pp.proceedButton.click();
	    
	}

	@Then("I verify the following details of the cart")
	public void iVerifyTheFollowingDetailsOfTheCart( Cart cart) {
	   
		System.out.println(cart.getProductName());
		
	}

}
