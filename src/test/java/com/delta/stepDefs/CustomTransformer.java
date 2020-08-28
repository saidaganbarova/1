package com.delta.stepDefs;

import java.util.Map;

import com.delta.pojos.Customer;
import com.delta.pojos.User;

import io.cucumber.java.DataTableType;

public class CustomTransformer {
	
	
	@DataTableType
	
	public Customer costomerEntry(Map<String,String> row ) {

		

		return new  Customer(row.get("first name"),
				             row.get("last name"),
				             row.get("confirmation"));
	}
}
