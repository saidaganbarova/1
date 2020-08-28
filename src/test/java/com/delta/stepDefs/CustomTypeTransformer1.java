package com.delta.stepDefs;

import java.util.Map;

import com.delta.pojos.User;

import io.cucumber.java.DataTableType;

public class CustomTypeTransformer1 {
	
	
	@DataTableType
	
	public User userEntry(Map<String,String> row ) {

		String hotelName = row.get("hotelName");
		String checkIn = row.get("chechIn");
		String checkOut = row.get("checkOut");
		String rooms = row.get("rooms");
		String adults = row.get("adults");
		String children = row.get("children");

		return new  User(hotelName,checkIn,checkOut,rooms,adults,children);
	}
}
