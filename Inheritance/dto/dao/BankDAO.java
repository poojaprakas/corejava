package com.xworkz.amazon.dao;

import com.xworkz.amazon.dto.BankDTO;

public interface BankDAO {
	
	boolean save(BankDTO dto);
	
	BankDAO findbyname(String name);
	  void display();

}
