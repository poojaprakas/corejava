package com.xworkz.festival;
import com.xworkz.festival.Constants;
public class Police {
	public String name="kiranbedi";
	protected String designation="IPS";
	protected float exp=4.5f;
	Constants con;
	protected int noOfStars=4;
	
	protected Police() {
		super();
		System.out.println("invoked no arg const of police");
	}
	protected void displayDetails() {
		System.out.println("invoked displayDetails from police");
	}

}
