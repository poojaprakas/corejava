package com.xworkz.festival.company;

public class HeadSetRunner {

	public static void main(String[] args) {
		HeadSet head=new HeadSet("philips",true,20);
		System.out.println("invoked parameterised const");
		System.out.println(head.brand);
		System.out.println(head.battery);
		System.out.println(head.warranty);
		
		HeadSet head1=new HeadSet("sony",false,89);
         System.out.println("invoked another const");
         System.out.println(head1.brand);
         System.out.println(head1.battery);
         System.out.println(head1.warranty);
         
         System.out.println(head.toString());
         System.out.println(head1.toString());
         System.out.println(head.hashCode());
         System.out.println(head1.hashCode());
         
         System.out.println(head==head1);
         System.out.println(head.equals(head1));
	}
	  

}
