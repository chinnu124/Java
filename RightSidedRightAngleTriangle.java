public class RightSidedRightAngleTriangle 
{

	public static void main(String[] args) 
	{
		printTriangle(5);
	}
	public static void print(int columns,String value)
	{
		for(int column=1;column<=columns;column++)
		{
			System.out.print(value);
		}
	}
	public static void printTriangle(int number)
	{
		int row=1;
		for(row=1;row<=number;row++)
		{
			print(number-row," ");
			print(row,"*");
			System.out.println();
		}
	}

}
