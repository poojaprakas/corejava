package com.xworkz.amazon.dao;

public class CartDTO 
{
	String name;
	int quantity;
	float price;
	int noOfItems;
	
	public CartDTO(String name, int quantity, float price, int items) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.noOfItems = items;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getItems() {
		return getItems();
	}

	public void setItems(int items) {
		this.noOfItems = items;
	}

}

