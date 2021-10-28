package com.xworkz.dp.dto;

public class ParkStarter {

	public static void main(String[] args) {
		
		Park park=new Park();
		park.setEntryFee(true);
		park.setFlowers("roses");
		park.setNoOfPlant(12.5f);
		park.setNoOfShop(34);
		
		Park park1=new Park(12.5f,"sunflowers",true,12);
		Park park2=new Park(14.5f,"lily",true,17);
		Park park3=new Park(15.5f,"marriegold",false,18);
		
		
		//grouping of park
		Park[] ref=new Park[5];
	     ref[0]=park;
	     ref[1]=park1;
	     ref[2]=park2;
	     ref[3]=park3;
	     
	     for(int we=0; we<ref.length; we++)
	     {
	    	 Park pi=ref[we];
	    	 if(ref!=null)
	    	 {
	    		 System.out.println(pi.getEntryFee());
	    		 System.out.println(pi.getNoOfPlant());
	    		 System.out.println(pi.getNoOfShop());
	    		 
	    		 System.out.println(pi.getFlowers());
	    		 
	    		  }
	    	 else
	    	 {
	    		 System.err.println("index pointing to null".concat(String.valueOf(pi)));
	    	 }
	     }
		
	}

}
