package com.xworkz.hajama;
import com.xworkz.hajama.SharkFish;

public class GoldFish extends Fish{
	public String colour="gold";
	public String size="small";
	public GoldFish() {
		super();
		System.out.println("invoked no args const");
	}
	
	
	GoldFish(String colour){
		System.out.println("invoked goldfish  arg const");
	}
}
