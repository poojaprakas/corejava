package com.xworkz.hajama;

public class Tyre {
	private String brand;
	private int price;
	
	public Tyre() {
		System.out.println("invoke default const");
	}
	@Override
	public String toString() {
		System.out.println("Invoked to String Method");
		return super.toString();
	};

	@Override
	public int hashCode() {
		System.out.println("Invoked hashcode method");
		return 5000;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals method");
		if (obj == null) {
			System.out.println("You have passed null value");
				return false;
		}
			if (obj instanceof Tyre) {
				System.out.println("Ipod is  an instance of ipod ");
			Tyre a = (Tyre) obj;
				System.out.println("Casted");
				String storage = a.getBrand();
				if (this.brand.equals(storage)) {
					System.out.println("Model number have matched");
					return true;
				}
			}
			return false;
	}

	protected String getBrand() {
		return brand;
	}

	protected void setBrand(String brand) {
		this.brand = brand;
	}

	protected int getPrice() {
		return price;
	}

	protected void setPrice(int price) {
		this.price = price;
	}
	

}
