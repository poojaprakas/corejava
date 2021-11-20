   
   class ForestTester{
	   public static void main(String[] args)
	   {
		Forest forest=new  Forest("meghalaya", "manglore", "karnataka");
         System.out.println(forest.name);
         System.out.println(forest.location);		
         System.out.println(forest.state);
		 
		 
		 State state=new State(31, "sanvi", "koorg");
		 System.out.println(state.name);
		  System.out.println(state.noofDistricts);
		 System.out.println(state.cmName);
		 System.out.println(state.CapitalCity);
		 
		 CapitalCity capita=new CapitalCity("Banglore", 6543268,"companies");
		 System.out.println(capita.name);
		  System.out.println(capita.population);
		 System.out.println(capita.famousFor);


	   }
   }	   