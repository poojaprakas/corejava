package com.xworkz.festival.company;

public class Belt {
	protected int price;
	protected String material;
	protected int size;
	protected boolean gender;
	
	
	public Belt() {
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
		return 50;
	}
	@Override
	public boolean equals(Object gender) {
		System.out.println("Invoked equals method");
		if (gender == null) {
			System.out.println("You have passed null value");
				return true;
		}
		if (gender instanceof Belt) {
			System.out.println("Ipod is  an instance of ipod ");
			Belt a = (Belt) gender;
			System.out.println("Casted");
			int storage = a.price;
				return true;

		}
		return false;
	}
}
