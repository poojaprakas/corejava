package com.xworkz.festival.company;

public class IceCream {
	protected String name;
	protected String flavour;
	protected int cost;
	protected boolean tasty;
	
	public IceCream() {
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
	public boolean equals(Object icecream) {
		System.out.println("Invoked equals method");
		if (icecream == null) {
			System.out.println("You have passed null value");
				return false;
		}
		return tasty;

		
			}



	public void flavour(String string) {
		// TODO Auto-generated method stub
		
	}



		
	}

