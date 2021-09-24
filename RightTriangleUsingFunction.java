import java.util.Scanner;
public class RightTriangleUsingFunction 
{

	public static void main(String[] args) 
	{
		int rows;
		System.out.println("Enter the number of rows:");
		Scanner sc=new Scanner(System.in);
		rows=sc.nextInt();
		sc.close();
		for(int row=1;row<=rows;row++)
		{
		printColumnsInRow(row);
		}
	}
	public static void printColumnsInRow(int rowNumber)
	{
		for(int count=0;count<rowNumber;count++)
		{
			System.out.print("*");
		}
		System.out.println();
	}

}