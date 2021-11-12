package com.xworkz.festival.company;

public class Fish {
	private String name;
	private String colour;
	private int price;
	
	public Fish() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int hashCode() {
		return 200;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public boolean equals(Object obj) {
		System.out.println("Invoked equals method");
		if (obj == null) {
			System.out.println("You have passed null value");
				return false;
		}
		if (obj instanceof Fish) {
			System.out.println("obj is  an instance of fish ");
			Fish a = (Fish) obj;
			System.out.println("Casted");
			String storage = a.getColour();
			if (this.colour.equals(storage)) {
				System.out.println("equals method invokeds");
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

	protected String getColour() {
		return colour;
	}

	protected void setColour(String colour) {
		this.colour = colour;
	}

	protected int getPrice() {
		return price;
	}

	protected void setPrice(int price) {
		this.price = price;
	}
}



