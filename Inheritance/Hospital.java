package com.xworkz.rules.hospital;

import com.xworkz.rules.HospitalDischargeRule;

public class Hospital implements HospitalAdmitRule,HospitalDischargeRule {

	@Override
	public String register() {
		System.out.println("invoked  valid register");
		return "154##58";
	}

	@Override
	public double payAdvance() {
	 System.out.println("invoked payAdvance in time");
		return 27.09;
	}

	@Override
	public double validInsurance() {
		System.out.println("invoked validInsurance");
		return 789.006;
	}

	@Override
	public boolean payBill() {
		System.out.println("invoked paybill completely");
		return true;
	}

	@Override
	public double discount() {
		System.out.println("invoked discount");
		return 25.0;
	}
	public void displayDetails() {
		
	}

	
	}


