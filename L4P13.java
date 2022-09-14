/*13) Write a program to print the number of days in a given month and year (1 implies Jan 
which means 31 should be printed out, 2 implies Feb which implies that 28 or 29 should be 
printed depending on whether the year is a leap year and so on). Do this by only using “if” 
and then with “switch”.*/

public class L4P13
{
	public static void main(String[] args)
	{
		int m=2,y=2016;
		switch(m)
		{
			case 1:
				System.out.println("Jan 31");
				break;
			
			case 2:
				if (((y % 4 == 0) && (y % 100!= 0)) || (y%400 == 0))
				{
					System.out.println("Leap year Feb 29");
				}
				else
				{
					System.out.println("not a Leap year Feb 28");
				}
				break;
			case 3:
				System.out.println("Mar 31");
				break;
			case 4:
				System.out.println("Apr 30");
				break;
			case 5:
				System.out.println("May 31");
				break;
			case 6:
				System.out.println("Jun 30");
				break;
			case 7:
				System.out.println("Jul 31");
				break;
			case 8:
				System.out.println("Aug 31");
				break;
			case 9:
				System.out.println("Sep 30");
				break;
			case 10:
				System.out.println("Oct 31");
				break;
			case 11:
				System.out.println("Nov 30");
				break;
			case 12:
				System.out.println("Dec 31");
				break;
		}	
	}
}