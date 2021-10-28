package com.xworkz.dp.dto;

public class ElevatorStarter {

	public static void main(String[] args) {
		
	Elevator elevator =new Elevator("BTM","upward",150,"black",true);
		
		elevator.setLocation("mysore");
		elevator.setMotionType("downward");
		elevator.setNoOfSteps(200);
		elevator.setColour("white");
		elevator.setWorking(false);
		
		Elevator elevator1 =new Elevator("peenya","upward",100,"gray",true);
		Elevator elevator2 =new Elevator("banashankri","upward",200,"cement",true);
	   Elevator elevator3 =new Elevator("BTM","downward",145,"black",false);
	
	   //grouping of elevators
	   Elevator[] fig =new  Elevator[4];
       fig[0]=elevator1;
       fig[1]=elevator2;
       fig[2]=elevator3;
      

      for(int xyz=0; xyz<fig.length; xyz++)
      {
    	  Elevator ref = fig[xyz];
   	   if(ref!=null) 
   	   {
   		   System.out.println(ref.getLocation());
   		   System.out.println(ref.getMotionType());
   		   System.out.println(ref.getNoOfSteps());
   		   System.out.println(ref.getColour());
   		   System.out.println(ref.isWorking());
   		   
   	   }
   	   else 
   	   {
   		   System.out.println("index pointing to null".concat(String.valueOf(xyz)));
          }
      }
}


	}


