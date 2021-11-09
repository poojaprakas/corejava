package com.xworkz.festival.company;

public class Watch {
	protected String colour;
	protected String type;
	protected int cost;
	protected boolean good;


   protected Watch() {
	   super();
	   System.out.println("invoked no arg const");
   }
   protected void turnOn() {
	   System.out.println("invoked watch turnOn");
	   
   }
   protected void turnOff() {
	   System.out.println("invoked watch turnOff");
   }
   protected void showTime() {
	   System.out.println("invoked showTime");
   }
   
   


protected Watch(String colour, String type, int cost, boolean good) {
	super();
	this.colour = colour;
	this.type = type;
	this.cost = cost;
	this.good = good;
}


protected String getColour() {
	return colour;
}


protected void setColour(String colour) {
	this.colour = colour;
}


protected String getType() {
	return type;
}


protected void setType(String type) {
	this.type = type;
}


protected int getCost() {
	return cost;
}


protected void setCost(int cost) {
	this.cost = cost;
}


protected boolean isGood() {
	return good;
}


protected void setGood(boolean good) {
	this.good = good;
}
   
}
