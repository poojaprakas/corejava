package com.xworkz.amazon.dao;

import com.xworkz.amazon.dto.BankDTO;

public class ImplementationOfBankDAO implements BankDAO{
	private BankDTO[] bank=new BankDTO[2];
	private int count=0;
	
	@Override
	public boolean save(BankDTO dto) {
		if(dto!=null) {
			for(int i=0; i<bank.length; i++) {
				this.bank[0]=dto;
				System.out.println("it is not null it can save");
				return true;
			}
			}
		else {
			System.err.println("it is null");
		}
		return false;
	}
}
  @Override
  public BankDAO findbyname(String name) {
	  if(name!=null) {
		  for(int j=0; j<bank.length; j++) {
			  if(bank[j]!=null) {
				  String store=bank[j].getName();
				  System.out.println("if it is not null then dont worry i will find your name");
				  
				  }
			  else {
				  System.out.println("sorry name not found");
			  }
		  }
	  }
	  System.err.println("it is a null");
	  return null;
		  }
       @Override
       public void display() {
    	   for(int k=0; k<bank.length; k++) {
    		   if(bank[k]!=null) {
    			   System.out.println("name"  +bank[k].getName());
    			   System.out.println("location" +bank[k].getLocation());
    			   System.out.println("government" +bank[k].isGovernment());
    			   
    			     }
    		   else {
    			   System.err.println("cannot give bank details");
    		   }
	  }
       }
       }
  