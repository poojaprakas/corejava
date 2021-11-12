package com.xworkz.festival.company;

public class Plant {
	protected String name;
	protected boolean alive;
	protected int lifeSpan;
	protected String getName() {
		return name;
	}
	public Plant() {
		System.out.println("invoked no arg const");
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected boolean isAlive() {
		return alive;
	}
	protected void setAlive(boolean alive) {
		this.alive = alive;
	}
	protected int getLifeSpan() {
		return lifeSpan;
	}
	protected void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}
	
	@Override
	public int hashCode() {
		System.out.println("Invoked hashcode method");
		return 100;
	}
	@Override
	public String toString() {
		System.out.println("Invoked to String Method");
		return super.toString();
	};

	@Override
	public boolean equals(Object alive) {
		System.out.println("Invoked equals method");
		if (alive == null) {
			System.out.println("You have passed null value");
			return false;	
		}
			

	
	if (alive instanceof Plant) {
		System.out.println("plant is alive ");
		Plant p = (Plant) alive;
		System.out.println("Casted");
		boolean storage = p.alive;
		if (this.alive) {
			System.out.println("plant are always alive");
}
	}
	return false;
	}
}
