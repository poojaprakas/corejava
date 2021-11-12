package com.xworkz.hajama;

public class AeroplaneStarter {

	public static void main(String[] args) {
		Aeroplane aer=new Aeroplane();
		Aeroplane aer1=new Aeroplane();
		System.out.println(aer.hashCode());
		System.out.println(aer.toString());
		
		aer.setCompany("Air india");
		aer1.setCompany("air lines");
		System.out.println(aer.equals(aer));

	}

}
