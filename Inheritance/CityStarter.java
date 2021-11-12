package com.xworkz.hajama;

public class CityStarter {

	public static void main(String[] args) {
		City c1=new City();
		City c2=new City();
		System.out.println(c1.toString());
		System.out.println(c1.hashCode());
		
		c1.setCountryName("india");
		c2.setStateName("america");
        System.out.println(c1.equals(c2));
	}

}
