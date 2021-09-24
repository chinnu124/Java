import java.util.*;
public class Factorial {

	public static void main(String[] args)
	{
		int n;
		int factorial=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		sc.close();
		if(n>=0)
		{
			for(int i=n;i>=1;i--)
			{
				factorial*=i;
			}
			System.out.println("Factorial:"+factorial);
		}
		else
		{
			System.out.println("Factorial is not existing");
		}

	}

}
