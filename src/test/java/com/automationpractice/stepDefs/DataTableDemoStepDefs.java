package com.automationpractice.stepDefs;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Then;

public class DataTableDemoStepDefs {
	
	@Then("I should be able to enter the following customer info using list of lists")
	public void iShouldBeAbleToEnterTheFollowingCustomerInfo( List<Map<String, String>> table) {
	   
		System.out.println(table);
		
	}
	
	@Then("I should be able to enter the following customer info using list of maps")
	public void iShouldBeAbleToEnterTheFollowingCustomerInfoMaps( List<Map<String, String>> table) {
	   
		System.out.println(table);
		
	}
	
	
	@Then("I should be able to seethe following airports")
	public void iShouldBeAbleToSeetheFollowingAirports(Map<String, String> dataTable) {
	    System.out.println(dataTable);
	}
	
	
	@Then("I should be able to seethe following airports with their location info")
	public void iShouldBeAbleToSeetheFollowingAirportsWithTheirLocationInfo(Map<String,List<Double>> dataTable) {
	    System.out.println(dataTable);
	}
	
	
	@Then("I should be able to see the following airports with their location info with headers")
	public void iShouldBeAbleToSeeTheFollowingAirportsWithTheirLocationInfoWithHeaders(Map<String, Map<String, String>> dataTable) {
	   System.out.println(dataTable);
	}



}
