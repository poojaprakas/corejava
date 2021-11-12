package com.xworkz.festival.company;

public class ShoeStarter {

	public static void main(String[] args) {
		Shoe sh=new Shoe();
		System.out.println(sh.toString());
		System.out.println(sh.hashCode());
		System.out.println(sh.equals(sh));
	}

}
