package com.xworkz.hajama;
import com.xworkz.hajama.Factory;

public class SugarFactory extends Factory {
	
	public SugarFactory(String name) {
		super("sugar");
		System.out.println("invoked arg const");
	}
	public SugarFactory(int since) {
		super(1981);
		System.out.println("invoked arg const ");
		
	}

}
