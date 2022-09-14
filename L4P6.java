/*6) Print all non multiples of 3 between 100 to 1 to the monitor*/

public class L4P6
{
	public static void main(String[] args)
	{
		for(int i=1;i<=100;i++)
		{
			if(i%3!=0)
			{
				System.out.println(i);
			}
		}
	}
}