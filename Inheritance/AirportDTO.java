package com.xworkz.amazon.dto;

public class AirportDTO {
	String name;
	String location;
	int id;
	String type;
	
	public AirportDTO() {
		System.out.println("invoked no arg const");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public AirportDTO(String name, String location, int id, String type) {
		super();
		this.name = name;
		this.location = location;
		this.id = id;
		this.type = type;
	}

}
