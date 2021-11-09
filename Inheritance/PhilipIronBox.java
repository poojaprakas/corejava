package com.xworkz.festival.company;
import com.xworkz.festival.IronBox;

public class PhilipIronBox extends IronBox{
	
	public PhilipIronBox() {
		super();
		System.out.println("invoked Philip IronBox no-arg const");
	}
	public PhilipIronBox(String brand, String type, boolean working, double minTemp, double maxTemp){
		super(brand,type,working,minTemp,maxTemp);
		System.out.println("invoked String,String,boolean,double,double const from PhilipIronBox");
	}
	  public void displayDetails() {
		  System.out.println(super.getBrand());
		  System.out.println(super.getType());
		  System.out.println(super.isWorking());
		  System.out.println(super.getMaxTemp());
		  System.out.println(super.getMinTemp());
	  }
	  @Override
	  public void produceHeat()
	  {
		  System.out.println("invoked produceHeat from PhilipIronBox");
		  super.produceHeat();
		 
	  }
	
	}
	

