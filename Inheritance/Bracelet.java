package com.xworkz.dp.dto;

public class Bracelet {
	private String colour;
	private String material;
	private boolean gemUsed;
	private boolean gifted;
	private float price;
	
	
	public Bracelet() {
		System.out.println("Bracelet with no arg const");
	}


	public String getColour() {
		return colour;
	}


	public Bracelet(String colour, String material, boolean gemUsed, boolean gifted, float price) {
		super();
		this.colour = colour;
		this.material = material;
		this.gemUsed = gemUsed;
		this.gifted = gifted;
		this.price = price;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public boolean isGemUsed() {
		return gemUsed;
	}


	public void setGemUsed(boolean gemUsed) {
		this.gemUsed = gemUsed;
	}


	public boolean isGifted() {
		return gifted;
	}


	public void setGifted(boolean gifted) {
		this.gifted = gifted;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}
	
	

}
