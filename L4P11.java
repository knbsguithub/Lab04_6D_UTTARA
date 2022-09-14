/*11) Have a variable containing a test score between 1-100. Now write a code snippet to find out the grade of the score. If the score is > 90, then the grade is A. 
70-90 -> B, 50-70 -> C, 30-50 -> D, < 30 - FAIL. Verify the output with different scores.*/

import java.util.*;
public class L4P11
{
	public static void main(String[] args)
	{
		int marks;
		Scanner sc = new Scanner(System.in);
		marks=sc.nextInt();
		if(marks>=90&&marks<=100)
		{
			System.out.println("GRADE A");
		}
		else if(marks>=70)
		{
			System.out.println("GRADE B");
		}
		else if(marks>=50&&marks<70)
		{
			System.out.println("GRADE C");
		}
		else if(marks>=30&&marks<50)
		{
			System.out.println("GRADE C");
		}
		else if(marks<30)
		{
			System.out.println("FAIL");
		}
		else if(marks>100)
		{
			System.out.println("Invalid Marks");
		}
	}
}