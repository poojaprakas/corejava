package com.xworkz.dp.dto;

public class Lawyer {
	private String name;
	private String qualification;
	private String experience;
	private char gender;
	private int age;
	private boolean caseWon;
	private boolean caseLost;
	
	Lawyer(){
		System.out.println("invoked no arg const");
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isCaseWon() {
		return caseWon;
	}

	public void setCaseWon(boolean caseWon) {
		this.caseWon = caseWon;
	}

	public boolean isCaseLost() {
		return caseLost;
	}

	public void setCaseLost(boolean caseLost) {
		this.caseLost = caseLost;
	}

	public Lawyer(String name, String qualification, String experience, char gender, int age, boolean caseWon,
			boolean caseLost) {
		super();
		this.name = name;
		System.out.println(this.name);
		
		this.qualification = qualification;
		System.out.println(this.qualification);
		
		this.experience = experience;
		System.out.println(this.experience);
		
		this.gender = gender;
		System.out.println(this.gender);
		
		this.age = age;
		System.out.println(this.age);
		
		this.caseWon = caseWon;
		System.out.println(this.caseWon);
		
		this.caseLost = caseLost;
		System.out.println(this.caseLost);
	}
	
	
	

}
