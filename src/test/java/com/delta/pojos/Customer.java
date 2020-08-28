package com.delta.pojos;

public class Customer {
	
	
	private  String firstName;
	
	private  String lastName;
	
	private  String confirmNo;

	public Customer(String firstName, String lastName, String confirmNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.confirmNo = confirmNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getConfirmNo() {
		return confirmNo;
	}
	

}
