package com.xworkz.hajama;
public class Food {
	private String name;
	private int price;
	private String quantity;
	private String quality;
	
	public Food() {
		System.out.println("invoked no arg const");
	}
	
	@Override
	public String toString() {
		System.out.println("Invoked to String Method");
		return super.toString();
	};

	@Override
	public int hashCode() {
		System.out.println("Invoked hashcode method");
		return 100;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals method");
		if (obj == null) {
			System.out.println("You have passed null value");
				return false;
		}
		if (obj instanceof Food) {
			System.out.println("Food is  an instance of food ");
			Food a = (Food) obj;
			System.out.println("Casted");
			String storage = a.getName();
			if (this.name.equals(storage)) {
				System.out.println("food have matched");
				return true;
			}
			
		}
		return false;
	}
		
	

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getPrice() {
		return price;
	}

	protected void setPrice(int price) {
		this.price = price;
	}

	protected String getQuantity() {
		return quantity;
	}

	protected void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	protected String getQuality() {
		return quality;
	}

	protected void setQuality(String quality) {
		this.quality = quality;
	}
	
	

}
