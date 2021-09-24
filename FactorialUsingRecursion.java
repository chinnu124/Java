import java.util.*;
public class FactorialUsingRecursion
{

	public static void main(String[] args)
	{
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		number=sc.nextInt();
		sc.close();
		System.out.println("Factorial of "+number+" is: "+factorial(number));

	}
	public static int factorial(int number)
	{
		if(number==0)
		{
			return 1;
		}
		else
		{
			return number*factorial(number-1);
		}
	}

}
