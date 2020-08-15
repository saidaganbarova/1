package com.automationpractice.pojos;

public class Cart {
	
	private String productName;
	private double unitPrice;
	private int quantity;
	private double totalBefore;
	private double totalAfter;
	
	public Cart(String productName, double unitPrice, int quantity, double totalBefore, double totalAfter) {
		super();
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.totalBefore = totalBefore;
		this.totalAfter = totalAfter;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalBefore() {
		return totalBefore;
	}

	public void setTotalBefore(double totalBefore) {
		this.totalBefore = totalBefore;
	}

	public double getTotalAfter() {
		return totalAfter;
	}

	public void setTotalAfter(double totalAfter) {
		this.totalAfter = totalAfter;
	}
	
	
	
	


}
