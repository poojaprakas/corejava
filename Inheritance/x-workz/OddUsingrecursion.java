   
   void OddUsingrecursion(int n1,int n2){
     int(n2<n1)
	 {
		return; 
   
   }
     if(n2%2==1)
	  OddUsingrecursion(n1,n2 -2);
       else
    OddUsingrecursion(n1,n2 -1);

    if(n2%2==1)
	{
		System.out.println(n2 + "\n");
	}
   }