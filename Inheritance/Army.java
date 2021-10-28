package com.xworkz.dp.dto;

public class Army {
	
	int noOfSoldier;
	String colourOfUniforms;
	int noOfRiffles;
	
	Army(){
		System.out.println("non arg const");
	}

	public int getNoOfSoldier() {
		return noOfSoldier;
	}

	public void setNoOfSoldier(int noOfSoldier) {
		this.noOfSoldier = noOfSoldier;
	}

	public String getColourOfUniforms() {
		return colourOfUniforms;
	}

	public void setColourOfUniforms(String colourOfUniforms) {
		this.colourOfUniforms = colourOfUniforms;
	}

	public int getNoOfRiffles() {
		return noOfRiffles;
	}

	public void setNoOfRiffles(int noOfRiffles) {
		this.noOfRiffles = noOfRiffles;
	}

	public Army(int noOfSoldier, String colourOfUniforms, int noOfRiffles) {
		super();
		this.noOfSoldier = noOfSoldier;
		this.colourOfUniforms = colourOfUniforms;
		this.noOfRiffles = noOfRiffles;
	}
	
	
	

}
