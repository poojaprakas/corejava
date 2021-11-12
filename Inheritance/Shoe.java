package com.xworkz.festival.company;

public class Shoe {
	protected String brand;
	protected int size;
	protected String colour;
	
	public Shoe() {
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
		return 500;
	}
	@Override
	public boolean equals(Object colour) {
		System.out.println("Invoked equals method");
		if (colour == null) {
			System.out.println("You have passed null value");
				return false;
		}
		return true;

}
}

