   
   public class FactorialUsingRecursion
{
    public static void main(String[] args)
    {
        int number = 6;
        long factorial = calculateFactorial(number);

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
    
    public static long calculateFactorial(int number)
    {
        if (number == 1)
            return 1;
        else
            return number * calculateFactorial(number -1);
    }
}