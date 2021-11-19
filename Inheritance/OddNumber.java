   class OddNumber{
	   public static void main(String[]args)
	   {
		   int n=50;
     System.out.print("even numbers from 1 to n+  ");
     for(int i=1; i<=n; i++)
	 {
		if(i%2!=0){
		System.out.print(i + " ");	
		 
	 }
	 }
	 
        while(n<=50)
		{
		if(n%2!=0)
		{
			
		System.out.print(n +  "    ");  
	   }
	   n++;
	 }
	 
	  do{
		  if(n%2==1){
			System.out.print(n+ "    ");
		  }
		  n++;
	  }
	  while(n<=50);
   
   } 
   }
   