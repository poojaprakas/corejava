package com.xworkz.hajama;

public class Aeroplane {
	private int no;
	private String company;
	private boolean govt;
	
	public Aeroplane() {
		System.out.println("default const");
	}
	@Override
	public String toString() {
		System.out.println("Invoked to String Method");
		return super.toString();
	};

	@Override
	public int hashCode() {
		System.out.println("Invoked hashcode method");
		return 20000;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals method");
		if (obj == null) {
			System.out.println("You have passed null value");
				return false;
		}
		if (obj instanceof Aeroplane) {
			System.out.println("aeroplane is  an instance of aeroplane ");
			Aeroplane a = (Aeroplane) obj;
			System.out.println("Casted");
			String storage = a.getCompany();
			if (this.company.equals(storage)) {
				System.out.println("company have matched");
				return true;
			}
		}
		return false;
	}

	protected int getNo() {
		return no;
	}

	protected void setNo(int no) {
		this.no = no;
	}

	protected String getCompany() {
		return company;
	}

	protected void setCompany(String company) {
		this.company = company;
	}

	protected boolean isGovt() {
		return govt;
	}

	protected void setGovt(boolean govt) {
		this.govt = govt;
	}
	

}
