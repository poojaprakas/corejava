package com.xworkz.festival.company;

public class Watch {
	private String colour;
	private String type;
	private int cost;
	private boolean good;


  public Watch() {
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
   @Override
   public String toString() {
		System.out.println("Invoked to String Method");
		return super.toString();
	};

@Override
public int hashCode() {
	System.out.println("Invoked hashcode method");
	return 1000;
}
@Override
public boolean equals(Object obj) {
	System.out.println("Invoked equals method");
	if (obj == null) {
		System.out.println("You have passed null value");
		return false;	
	}
	

if (obj instanceof Watch) {
	System.out.println("Watch is  an instance of watch ");
	Watch a = (Watch) obj;
	System.out.println("Casted");
	String storage = a.getColour();
	if (this.colour.equals(storage)) {
		System.out.println("colour have matched");
		return true;
	}
}
return false;
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
