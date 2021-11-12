package com.xworkz.festival.company;

public class FishStarter {

	public static void main(String[] args) {
	  Fish fe=new Fish();
	  Fish f=new Fish();
	  System.out.println(fe.hashCode());
	  System.out.println(fe.toString());
	  
     fe.setColour("white");
     f.setColour("gold");
     System.out.println(fe.equals(f));
     
     fe.setName("anjel");
     f.setName("anjel");
     System.out.println(fe.equals(f));
	 
	}

}
