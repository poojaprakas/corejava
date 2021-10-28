package com.xworkz.dp.dto;

public class Season {
	
	int noOfSeason;
	String type;
	String work;
	
	Season(){
		System.out.println("default const invoked");
	}

	public int getNoOfSeason() {
		return noOfSeason;
	}

	public void setNoOfSeason(int noOfSeason) {
		this.noOfSeason = noOfSeason;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public Season(int noOfSeason, String type, String work) {
		super();
		this.noOfSeason = noOfSeason;
		this.type = type;
		this.work = work;
	}
	
	
	
	

}
