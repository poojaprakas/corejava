package com.xworkz.dp.dto;

public class Park {
	
	private float noOfPlant;
	private String flowers;
	private boolean entryFee;
	private int noOfShop;
	
	Park(){
		System.out.println("default const invoked");
	}

	public float getNoOfPlant() {
		return noOfPlant;
	}

	public void setNoOfPlant(float noOfPlant) {
		this.noOfPlant = noOfPlant;
	}

	public String getFlowers() {
		return flowers;
	}

	public void setFlowers(String flowers) {
		this.flowers = flowers;
	}

	public boolean getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(boolean entryFee) {
		this.entryFee = entryFee;
	}

	public int getNoOfShop() {
		return noOfShop;
	}

	public void setNoOfShop(int noOfShop) {
		this.noOfShop = noOfShop;
	}

	public Park(float noOfPlant, String flowers, boolean entryFee, int noOfShop) {
		super();
		this.noOfPlant = noOfPlant;
		this.flowers = flowers;
		this.entryFee = entryFee;
		this.noOfShop = noOfShop;
	}
	
	

}
