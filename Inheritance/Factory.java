package com.xworkz.hajama;

public class Factory {
	private String owner;
	private int since;
	private String name;
	
	public  Factory(String name) {
		System.out.println("invoked String arg const");
		this.name=name;
		System.out.println(this.name);
		
		
	}
	public Factory(int since) {
		System.out.println("invoked int arg const");
		this.since=since;
		System.out.println(this.since);
	}
	
		
	}
		


