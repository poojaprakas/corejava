 
  public class FactorialUsingDoWhile{
  public static void main(String[] args)
	
    {
        int number = 6;
        long factorial = 1;
        int i = 1;
        
        do
        {
            factorial = factorial * i;
            i++;
        } while (i <= number);

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}