package com.xworkz.festival.company;
 import com.xworkz.festival.smallWatch;
public class WatchStarter {

	public static void main(String[] args) {
	
           smallWatch watch=new smallWatch("pink","ranstad",500,true);
        	  watch.displayDetails(); 
        	  System.out.println("invoked parameterised const");
        	  watch.showTime();
           
	}

}
