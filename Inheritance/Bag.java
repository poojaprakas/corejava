package com.xworkz.festival.company;

public class Bag {
	protected int price;
	protected String section;
	protected boolean good;
	
	public Bag() {
		System.out.println("invoked no arg const");
	}
	@Override
	public String toString() {
		System.out.println("Invoked to String Method");
		return super.toString();
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked hashcode method");
		return 2500;
	}

	@Override
	public boolean equals(Object good) {
		System.out.println("Invoked equals method");
		if (good== section) {
			System.out.println("You have passed null value");
				return true;
		}
			if (good instanceof Bag) {
				System.out.println("good is  an instance of bag ");
				Bag a = (Bag) good;
				System.out.println("Casted");
				String storage =a.section;
				if (this.section.equals(storage)) {
					System.out.println("sections are present in bag");

}
			}
			return false;
	}
}
