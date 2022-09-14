/*14) Print ten powers of a number given (ex: if num is 2, print value of 2 pow 1, then 2 pow 
2, then 2 pow 3… till 2 pow 10).14) Given an int value, print all its divisors (if 10 is the num, 
divisors are 1,2,5,10. If 15 is the num, 1,3,5,15 are the divisors).*/

public class L4P14
{
	public static void main(String[] args)
	{
		long a=2,r=1,p;
		for (int i=0;i<=10;i++)
		{	
			p=i;
			while(p!=0)
			{
				r=r*a;
				p--;
			}
			System.out.println(a+" power of " +i+ " is " + r);
		}
		
		int a=15;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				System.out.println("Divisors are "+i);
			}
		}
	}
}