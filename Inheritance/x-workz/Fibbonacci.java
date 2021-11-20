    class Fibbonacci
	{
	public static void main(String[]args)
	{
	  	Fibbonacci fibbonacci=new Fibbonacci();
		fibbonacci.printUsingwhileLoop();
	}
	
	void printUsingwhileLoop()
	{
		int sum;
		int i=1;
		int num1=0,  num2=1;
		
		while(i<=10)
		{
			System.out.print(num1 + " ");
			sum=num1+num2;
			num1=num2;
			num2=sum;
			i++;
		}
	}
	}