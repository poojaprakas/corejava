package com.xworkz.festival.company;

public class WatchStarter {

	public static void main(String[] args) {
	     Watch wat=new Watch();
	     Watch wat1=new Watch();
	     System.out.println(wat.toString());
	     System.out.println(wat.hashCode());
	     
	     wat.setCost(500);
	     wat1.setCost(500);
	     System.out.println(wat.equals(wat1));
	     
           
        
	}

}
