package com.xworkz.hajama;

public class Stadium {
	private String name;
	private String city;
	private int areaInMeters;
	
	public Stadium() {
		System.out.println("invoked no arg const");
	}
	@Override
	public String toString() {
		System.out.println("Invoked to String Method");
		return super.toString();
	};

	@Override
	public int hashCode() {
		System.out.println("Invoked hashcode method");
		return 500;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals method");
		if (obj == null) {
			System.out.println("You have passed null value");
				return false;
		}

		if (obj instanceof Stadium) {
			System.out.println("Stadium is  an instance of stadium ");
			Stadium a = (Stadium) obj;
			System.out.println("Casted");
			String storage = a.getName();
			if (this.name.equals(storage)) {
				System.out.println("Model number have matched");
				return true;
			}
		}
		return false;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getCity() {
		return city;
	}

	protected void setCity(String city) {
		this.city = city;
	}

	protected float getAreaInMeters() {
		return areaInMeters;
	}

	protected void setAreaInMeters(int areaInMeters) {
		this.areaInMeters = areaInMeters;
	}
	

}
