package com.xworkz.dp.dto;

public class SeasonStarter {

	public static void main(String[] args) {
		
		Season season =new Season() ;
		season.setNoOfSeason(3);
		season.setType("summer");
		season.setWork("plantation");
		
		Season season1 =new Season() ;
		season1.setNoOfSeason(3);
		season1.setType("winter");
		season1.setWork("watering");
		
		//grouping of all seasons
		
		Season[] son=new Season[4];
		son[0]=season1;
		son[1]=season1;
		son[2]=season1;
		
		
		for(int ac=0; ac<son.length; ac++) {
			Season ref=son[ac];
			if(ref!=null) {
				System.out.println(ref.getNoOfSeason());
				System.out.println(ref.getType());
				System.out.println(ref.getWork());
			}
			else
			{
				System.err.println("index is pointing to null".concat(String.valueOf(ac)));
			}
		}	
			
		
	}

}
