import java.util.Scanner;

public class Print2InversedTriangles 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int number=sc.nextInt();
		sc.close();
		printTriangle(number);
	}
	public static void printLeftTriangleRows(int rows)
	{
		for(int count=1;count<=rows;count++)
		{
			System.out.print("*");
		}
	}
	public static void printRightTriangleRow(int rows,String value)
	{
		for(int count=1;count<=rows;count++)
		{
			System.out.print(value);
		}
	}
	public static void printTriangle(int number)
	{
		int spaceCount=0;
		for(int count=number;count>=1;count--)
		{
			printLeftTriangleRows(count);
			printRightTriangleRow((number-count)+spaceCount," ");
			printRightTriangleRow(count,"*");
			System.out.println();
			spaceCount++;
		}
	}
}
