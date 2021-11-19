       
    
	public class FactorialUsingWhileLoop
{
    public static void main(String[] args)
    {
        int number = 6;
        long factorial = 1;
        int i=1;
        
        while (i <= number);
        {
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
	
   