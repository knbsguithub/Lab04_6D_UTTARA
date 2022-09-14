/*12) Write a program to check if a given year (in a variable) is a leap year.*/
public class L4P12
{
	public static void main(String[] args)
	{
		int a=2017;
		if (((a % 4 == 0) && (a % 100!= 0)) || (a%400 == 0))
		{
			System.out.println("It is a Leap year");
		}
		else
			System.out.println("It is not a Leap year");
	}
}