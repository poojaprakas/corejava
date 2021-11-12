package com.xworkz.hajama;

public class TyreStarter {

	public static void main(String[] args) {
		Tyre t1=new Tyre();
		Tyre t2=new Tyre();
		System.out.println(t1.toString());
		System.out.println(t1.hashCode());
		
		t1.setBrand("bajaj");
		t2.setBrand("raja");
		System.out.println(t1.equals(t2));

	}
}