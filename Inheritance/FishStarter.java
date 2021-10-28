package com.xworkz.hajama;
import com.xworkz.hajama.Fish;
import com.xworkz.hajama.GoldFish;
import com.xworkz.hajama.SharkFish;

public class FishStarter {

	public static void main(String[] args) {
		Fish fish=new Fish();
		System.out.println(fish.alive);
		System.out.println(fish.region);
		
	SharkFish  sharkfish=new SharkFish () ;
		System.out.println( sharkfish.height);
		System.out.println( sharkfish.weight);
		
		GoldFish goldfish=new GoldFish();
		System.out.println(goldfish.colour);
		System.out.println(goldfish.size);
		
		
		

	}

}
