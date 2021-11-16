package com.xworkz.rules;

import com.xworkz.rules.voting.MarriageRule;
import com.xworkz.rules.voting.TrafficRule;
import com.xworkz.rules.voting.VotingRule;

public class IndianCitizen implements VotingRule,TrafficRule,MarriageRule {

	@Override
	public int validAge() {
		System.out.println("invoked validAge");
		return 18;
	}

	@Override
	public String validID() {
		System.out.println("invoked validID");
		return "tyupo$576";
	}

	@Override
	public boolean validLicence() {
		System.out.println("invoked validlicense");
		return false;
	}

	@Override
	public String licenseNo() {
		System.out.println("invoked licenseno");
		return "ytroe#45";
	}

	@Override
	public boolean validInsurance() {
	System.out.println("invoked validInsurance");
		return false;
	}

	@Override
	public boolean validAge(char gender, int age) {
	System.out.println("invoked valid age");
		return false;
	}
	private String name="sanvi";
	private String address="mysore";
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public void displayNameAndAdressDetails() {
		System.out.println("invoked name and adressdetails");
	}
	
	}


	
  

