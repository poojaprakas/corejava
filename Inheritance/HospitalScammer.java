package com.xworkz.rules;

import com.xworkz.rules.hospital.Hospital;

public class HospitalScammer {

	public static void main(String[] args) {
		Hospital hospital=new Hospital();
		hospital.discount();
		System.out.println(hospital.discount());
		
		hospital.register();
		System.out.println(hospital.register());
		
		hospital.payAdvance();
		System.out.println(hospital.payAdvance());
		
		hospital.validInsurance();
		System.out.println(hospital.validInsurance());
		
		hospital.displayDetails();
		
		

	}

}
