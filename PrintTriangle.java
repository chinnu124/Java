import java.util.Scanner;
public class PrintTriangle 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int number=sc.nextInt();
		sc.close();
		printTriangle(number);
	}
	public static void print(int rows,String value)
	{
		for(int count=1;count<=rows;count++)
		{
			System.out.print(value);
		}
	}
	public static void printTriangle(int number)
	{
		for(int count=1;count<=number;count++)
		{
			print(number-count," ");
			print(count*2-1,"*");
			System.out.println();
		}
	}
}