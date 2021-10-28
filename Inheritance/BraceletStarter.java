package com.xworkz.dp.dto;

public class BraceletStarter {

	public static void main(String[] args) {
		
		Bracelet bracelet=new Bracelet();
		bracelet.setColour("gold");
		bracelet.setGemUsed(true);
		bracelet.setGifted(false);
		bracelet.setMaterial("iron");
		bracelet.setPrice(20);
		
		
		 Bracelet bracelet2=new  Bracelet("pink","plastic",true,false,23.0f);
		 Bracelet bracelet3=new  Bracelet("green","plastic",true,false,23.0f);
		 Bracelet bracelet4=new  Bracelet("pista","plastic",true,false,23.0f);
		 
	//grouping of bracelets
		 
	      Bracelet[] fig =new Bracelet[5];
	        fig[0]=bracelet;
	       fig[1]=bracelet2;
	       fig[4]=bracelet3;
	       
	       for(int xyz=0; xyz<fig.length; xyz++)
	       {
	    	   Bracelet ref = fig[xyz];
	    	   if(ref!=null) 
	    	   {
	    		   System.out.println(ref.getColour());
	    		   System.out.println(ref.getMaterial());
	    		   System.out.println(ref.isGemUsed());
	    		   System.out.println(ref.isGifted());
	    		   System.out.println(ref.getPrice());
	    		   
	    	   }
	    	   else 
	    	   {
	    		   System.out.println("index pointing to null".concat(String.valueOf(xyz)));
	           }
	       }
	}
}



	
	


	