package com.xworkz.rules.hospital;

import com.xworkz.rules.HospitalDischargeRule;

public class HospitalAssociation {
	private String name;
	private String location;
	private String govt;
	private HospitalAdmitRule hospitalAdmitRule;
	private HospitalDischargeRule hospitalDischargeRule;
	
	public HospitalAssociation() {
		System.out.println("invoked no arg const");
	}
	
	public HospitalAssociation(String name, String location, String govt, HospitalAdmitRule hospitalAdmitRule,
			HospitalDischargeRule hospitalDischargeRule) {
		super();
		this.name = name;
		this.location = location;
		this.govt = govt;
		this.hospitalAdmitRule = hospitalAdmitRule;
		this.hospitalDischargeRule = hospitalDischargeRule;
	}
	 
	  public void admitRule()
	  {
		  System.out.println("invoked rules of hospital");
		    String patientName= this.hospitalAdmitRule.register();
		    System.out.println("Admit the patient:".concat(patientName));
		     double amount= this.hospitalAdmitRule.payAdvance();
		     System.out.println("Amount paid by patient:" +amount);
		    double insured= this.hospitalAdmitRule.validInsurance();
		    System.out.println("Insurance of the patient:"+ insured);
	  }
	  
	  public void dischargeRule()
	  {
		  System.out.println("invoked discharge rule of hospital");
		 double dis= this.hospitalDischargeRule.discount();
		 System.out.println("Discount in patient bill:" +dis);
		 boolean bill= this.hospitalDischargeRule.payBill();
		 System.out.println("Bill paid by patient:" +bill);
	  }
	  
		  
	  }


