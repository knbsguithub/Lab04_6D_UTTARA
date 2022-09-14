/*  Print the following pattern in main() of a Test class using looping control statements 
(Think: 5 lines you need to print and in each line you need to print 1,2,3,4 and 5 values…
how many loops do you need? See code hint given in the last part of the document if you 
do not get the answer to this)
1
12
123
1234
12345*/

public class L4P17
{
	public static void main(String[] argss)
	{
		for(int i=1; i<=5; i++)
	    {
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
		    System.out.println(" ");
		}
	}
}