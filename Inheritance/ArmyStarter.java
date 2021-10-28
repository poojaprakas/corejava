package com.xworkz.dp.dto;

public class ArmyStarter {

	public static void main(String[] args) {
		
		Army army =new Army();
		army.setNoOfSoldier(56788);
		army.setColourOfUniforms("green");
		army.setNoOfRiffles(6);
		
		Army armys =new Army();
		armys.setNoOfSoldier(56789);
		armys.setColourOfUniforms("black");
		armys.setNoOfRiffles(7);
		
		
		//grouping armies
		
		Army[] arm=new Army[4];
		  arm[0]=armys;
		  arm[1]=armys;
		  arm[2]=armys;
		 
		  for(int pig=0; pig<arm.length; pig++)
		  {
			 Army ref=arm[pig] ;
			  if(ref!=null) {
				  System.out.println(ref.getColourOfUniforms());
				  System.out.println(ref.getNoOfSoldier());
				  System.out.println(ref.getNoOfRiffles());
				  
				  
			  }
			  else
			  {
				  System.out.println("index pointing to null");
			  }
		  }	

	}

}
