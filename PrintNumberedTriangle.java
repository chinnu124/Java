import java.util.Scanner;
public class PrintNumberedTriangle 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int number=sc.nextInt();
		sc.close();
		printTriangle(number);
	}
	public static void printLeftTriangleRow(int rows)
	{
		for(int count=1;count<=rows;count++)
		{
			System.out.print(rows+count);
		}
	}
	public static void printLeftTriangleSpace(int rows,String value)
	{
		for(int count=1;count<rows;count++)
		{
			System.out.print(value);
		}
	}
	public static void printMiddleLine(int number)
	{
			System.out.print(number);
	}
	public static void printRightTriangleRow(int rows)
	{
		for(int count=rows;count>=1;count--)
		{
			System.out.print(rows+count);
		}
	}
	public static void printTriangle(int number)
	{
		int numberCount=1;
		for(int count=0;count<number;count++)
		{
			printLeftTriangleSpace(number-count," ");
			printLeftTriangleRow(count);
			printMiddleLine(count+numberCount);
			printRightTriangleRow(count);
			System.out.println();
			numberCount+=1;
		}
	}

}
