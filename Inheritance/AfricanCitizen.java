package com.xworkz.rules.voting;

public class AfricanCitizen implements VotingRule,TrafficRule,MarriageRule {

	@Override
	public boolean validAge(char gender, int age) {
		System.out.println("invoked validAge");
		return true;
	}

	@Override
	public boolean validLicence() {
		System.out.println("invoked validLicense");
		return false;
	}
	
	@Override
	public String licenseNo() {
		System.out.println("invoked licenseNo");
		return "6754#2@56";
	}

	@Override
	public boolean validInsurance() {
	 System.out.println("validInsurance");
		return false;
	}

	@Override
	public int validAge() {
		System.out.println("invoked validAge");
		return 20;
	}

	@Override
	public String validID() {
		System.out.println("invoked validId");
		return "#3456378";
	}
	private String name="saru";
	private String stateName="noida";
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public void displayDetails()
	{
		System.out.println("invoked details");
	}
}
	