package com.xworkz.festival.company;

public class HeadSet {
	protected String brand;
	protected boolean battery;
	protected int warranty;
	protected String getBrand() {
		return brand;
	}
	protected void setBrand(String brand) {
		this.brand = brand;
	}
	protected boolean isBattery() {
		return battery;
	}
	protected void setBattery(boolean battery) {
		this.battery = battery;
	}
	protected int getWarranty() {
		return warranty;
	}
	protected void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	protected HeadSet(String brand, boolean battery, int warranty) {
		super();
		this.brand = brand;
		this.battery = battery;
		this.warranty = warranty;
	}
	public int hashCode() {
		return getWarranty();
	}
	
	
	@Override
	public boolean equals(Object battery) {
		System.out.println("Invoked equals method");
		if (battery == null) {
			System.out.println("You have passed null value");
				return false;
		}

		if (battery instanceof HeadSet) {
			System.out.println("HeadSet is  an instance of headset");
			HeadSet a = (HeadSet) battery;
			System.out.println("Casted");
			boolean storage =a.battery;
			if (this.equals(storage)) {
				System.out.println("battery capacity is gud");
				return true;
	}
}
		return false;
	}
}
		
	
		
	
	
	
		
	
	


