class PrimeNumbers
{
   public static void main (String[] args)
   {		
       int i =0;
       int num =0;
       String  primeNumbers = "";

       for (i = 1; i <= 100; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	   
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to 100 are :");
       System.out.println(primeNumbers);
   
   
  int primeCheckNumber;
  int n = 1;
  int divisibleCount;

  while (n <= 100) {
   divisibleCount = 0;
   primeCheckNumber = 2;
   while (primeCheckNumber <= n / 2) {
    if (n % primeCheckNumber == 0) {
     divisibleCount++;
     break;
    }
    primeCheckNumber++;
   }
   if (divisibleCount == 0 && n != 1) {
    System.out.print(n + " ");
   }
   n++;
  }

 }
}


