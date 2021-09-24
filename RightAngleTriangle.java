import java.util.*;
public class RightAngleTriangle {

	public static void main(String[] args) 
	{
		int number;
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		sc.close();
		printRightTriangle(number);
	}
	public static void printRightTriangle(int number)
	{
		for(int row=1;row<=number;row++)
		{
			for(int column=1;column<=row;column++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
