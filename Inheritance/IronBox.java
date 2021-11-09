package com.xworkz.festival;

public class IronBox {
	   private String brand;
	   private String type;
	   boolean working;
	   private double minTemp;
	   private double maxTemp;
	   
	   protected IronBox() {
		super();
		System.out.println("invoked no-arg const of IronBox");
	}
	   

	protected IronBox(String brand, String type, boolean working, double minTemp, double maxTemp) {
		super();
		this.brand = brand;
		this.type = type;
		this.working = working;
		this.minTemp = minTemp;
		this.maxTemp = maxTemp;
	}
	protected void produceHeat() {
		System.out.println("invoked produceHeat");
		System.out.println("ironbox is heating");
	}
	protected void turnOn() {
		System.out.println("invoked turnOn");
	}
	protected void turnOff() {
		System.out.println("invoked turnOff");
	}

	protected String getBrand() {
		return brand;
	}

	protected void setBrand(String brand) {
		this.brand = brand;
	}

	protected String getType() {
		return type;
	}

	protected void setType(String type) {
		this.type = type;
	}

	protected boolean isWorking() {
		return working;
	}

	protected void setWorking(boolean working) {
		this.working = working;
	}

	protected double getMinTemp() {
		return minTemp;
	}

	protected void setMinTemp(double minTemp) {
		this.minTemp = minTemp;
	}

	protected double getMaxTemp() {
		return maxTemp;
	}

	protected void setMaxTemp(double maxTemp) {
		this.maxTemp = maxTemp;
	}
	   
		   
	   }


