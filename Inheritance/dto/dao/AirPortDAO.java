package com.xworkz.amazon.dao;
import com.xworkz.amazon.dto.AirportDTO;
public interface AirPortDAO {
boolean save(AirportDTO dto);
	
AirPortDAO findbyname(String name);
	  void display();

}
