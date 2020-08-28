package com.delta.pojos;

public class User {
	
	private String hotelName;
	private String checkIn;
	private String checkOut;
	private String rooms;
	private String adults;
	private String children;
	

	public User(String hotelName, String chechIn, String checkOut, String room, String adult, String children) {
		super();
		this.hotelName = hotelName;
		this.checkIn = chechIn;
		this.checkOut = checkOut;
		this.rooms = room;
		this.adults = adult;
		this.children = children;
	}
	
	
	
	public String getHotelName() {
		return hotelName;
	}



	public String getChechIn() {
		return checkIn;
	}



	public String getCheckOut() {
		return checkOut;
	}



	public String getRoom() {
		return rooms;
	}



	public String getAdult() {
		return adults;
	}



	public String getChildren() {
		return children;
	}



	
	}
