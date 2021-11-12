package com.xworkz.hajama;

public class StadiumStarter {

	public static void main(String[] args) {
		Stadium sta1=new Stadium();
		Stadium sta2=new Stadium();
		System.out.println(sta1.toString());
		System.out.println(sta1.hashCode());
		
		sta1.setName("chinnaswami");
		sta2.setName("ratnavara");
		System.out.println(sta1.equals(sta1));

	}

}
