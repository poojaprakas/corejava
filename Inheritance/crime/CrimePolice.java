package com.xworkz.festival.crime;
import com.xworkz.festival.Police;
public class CrimePolice  extends Police{
    public CrimePolice() {
		super();
		System.out.println("invoked no arg const of CrimePolice");
		System.out.println(super.name);
		System.out.println(super.designation);
		System.out.println(super.exp);
		System.out.println(super.noOfStars);
	
	}	
    public void testMethod() {
    	System.out.println("invoked testMethod from crimePolice");
    	super.displayDetails();
    	
    }
	

}
