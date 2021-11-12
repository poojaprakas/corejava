package com.xworkz.hajama;

public class FoodStarter {

	public static void main(String[] args) {
		Food f=new Food();
		Food f1=new Food();
		System.out.println(f.toString());
		System.out.println(f.hashCode());
		
		f.setName("biriyani");
		f1.setName("chapathi");
		System.out.println(f.equals(f));
		
		f1.setPrice(50);
		f.setPrice(100);
		System.out.println(f1.equals(f));

	}

}
