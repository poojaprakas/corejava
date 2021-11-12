package com.xworkz.hajama;
public class City {
	private String name;
	private String stateName;
	private String countryName;
	
	public City() {
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
		return 800;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals method");
		if (obj == null) {
			System.out.println("You have passed null value");
				return false;
		}
			if (obj instanceof City) {
				System.out.println("city is  an instance of city ");
				City a = (City) obj;
				System.out.println("Casted");
				String storage = a.getCountryName();
				if (this.countryName.equals(storage)) {
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

	protected String getStateName() {
		return stateName;
	}

	protected void setStateName(String stateName) {
		this.stateName = stateName;
	}

	protected String getCountryName() {
		return countryName;
	}

	protected void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	

}
