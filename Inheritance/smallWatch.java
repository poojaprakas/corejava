package com.xworkz.festival;

import com.xworkz.festival.company.Watch;

public class smallWatch extends Watch{
	
      public smallWatch() {
		super();
	}
      public smallWatch(String colour, String type, int cost, boolean good) {
    	  super(colour,type,cost,good);
    	  
      }
      public void displayDetails() {
    	  System.out.println(super.colour);
    	  System.out.println(super.type);
    	  System.out.println(super.cost);
    	  System.out.println(super.good);
      }
      @Override
      public void showTime() {
    	  System.out.println("invoked override method");
    	  super.showTime();
    	 
    	
    	  }
      }

