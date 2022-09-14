/*5) Print all even numbers except multiples of 10 from 1 to 100 to the monitor*/
public class L4P5
{
	public static void main(String[] args)
	{
		for(int i=1;i<=100;i++)
		{
			if(i%10!=0&&i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}