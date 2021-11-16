package com.xworkz.rules.run;

import com.xworkz.rules.IndianCitizen;
import com.xworkz.rules.voting.AfricanCitizen;

public class RulesRunner {

	public static void main(String[] args) {
		IndianCitizen citizen=new IndianCitizen();
		System.out.println(citizen.validAge());
		System.out.println(citizen.validAge('f', 18));
		System.out.println(citizen.validID());
		System.out.println(citizen.validInsurance());
		System.out.println(citizen.validLicence());
		
		citizen.displayNameAndAdressDetails();
		String name=citizen.getName();
		System.out.println(name);
		String adress=citizen.getAddress();
		System.out.println(adress);
		System.err.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		IndianCitizen citizen2=new IndianCitizen();
		 System.out.println(citizen2.validAge());
		 System.out.println(citizen2.validAge('m', 21));
		 System.out.println(citizen2.validID());
		 System.out.println(citizen2.validInsurance());
		 System.out.println(citizen2.validLicence());
		 System.out.println(citizen2.licenseNo());
		 citizen2.setName("swathi");
		  String name1 = citizen2.getName();
		  System.out.println(name1);
		  citizen2.setAddress("BTM");
		  String adress1 =citizen2.getAddress();
		  System.out.println(adress1);
		  System.err.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		 
		  IndianCitizen citizen3=new IndianCitizen();
		  System.out.println(citizen3.validAge());
		  System.out.println(citizen3.validAge('f', 21));
		  System.out.println(citizen3.validID());
		  System.out.println(citizen3.validInsurance());
		  System.out.println(citizen3.validLicence());
		  citizen3.setName("pooja");
		   String name3=citizen3.getName();
		   System.out.println(name3);
		   citizen3.setAddress("tumkur");
		   String nam=citizen3.getAddress();
		   System.out.println(nam);
		   System.err.println("%%%%%%%%%%%%%%%%%");
		   
		   IndianCitizen citizen4=new IndianCitizen();
			  System.out.println(citizen4.validAge());
			  System.out.println(citizen4.validAge('f', 21));
			  System.out.println(citizen4.validID());
			  System.out.println(citizen4.validInsurance());
			  System.out.println(citizen4.validLicence());
			  citizen4.setName("roshini");
			   String name4=citizen4.getName();
			   System.out.println(name4);
			   citizen4.setAddress("mandya");
			   String na=citizen4.getAddress();
			   System.out.println(na);
			   
		AfricanCitizen citizen1=new AfricanCitizen();
		System.out.println(citizen1.validAge());
		System.out.println(citizen1.validAge('m', 22));
		System.out.println(citizen1.validID());
		System.out.println(citizen1.validInsurance());
		System.out.println(citizen1.validLicence());
		String namez=citizen1.getName();
		System.out.println(namez);
		String statez=citizen1.getStateName();
		System.out.println(statez);
		 
		AfricanCitizen citizen5=new AfricanCitizen();
		System.out.println(citizen5.validAge());
		System.out.println(citizen5.validAge('m', 22));
		System.out.println(citizen5.validID());
		System.out.println(citizen5.validInsurance());
		System.out.println(citizen5.validLicence());
		
		 citizen5.setName("raksha");
		   String na1=citizen5.getName();
		   System.out.println(na1);
		   citizen5.setStateName("benin");
		   String na2=citizen5.getStateName();
		   System.out.println(na2);
		   
	     
		   AfricanCitizen citizen8=new AfricanCitizen();
			System.out.println(citizen8.validAge());
			System.out.println(citizen8.validAge('m', 22));
			System.out.println(citizen8.validID());
			System.out.println(citizen8.validInsurance());
			System.out.println(citizen8.validLicence());
			
			 citizen5.setName("rani");
			   String na3=citizen5.getName();
			   System.out.println(na3);
			   citizen5.setStateName("jowar");
			   String na6=citizen5.getStateName();
			   System.out.println(na6);
			   
              
			   AfricanCitizen citizen9=new AfricanCitizen();
				System.out.println(citizen9.validAge());
				System.out.println(citizen9.validAge('m', 22));
				System.out.println(citizen9.validID());
				System.out.println(citizen9.validInsurance());
				System.out.println(citizen9.validLicence());
				
				 citizen5.setName("rani");
				   String na5=citizen5.getName();
				   System.out.println(na5);
				   citizen5.setStateName("jowar");
}
}
