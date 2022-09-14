/*8) Print "divisible" and the number if the num is divisible by 3 or 5 and not both between 1-100.*/

public class L4P8
{
	public static void main(String[] args)
	{
		for(int i=1;i<=100;i++)
		{
			if(i%3==0^i%5==0)
			{
				if(i%3==0)
				{
					System.out.println(i+" divisible by " + 3);
				}
				else if(i%5==0)
				{
					System.out.println(i+" divisible by " + 5);
				}
			}
		}
	}
}