/*16) Print all character symbols to monitor from 1 to 65535. You should leave a space after 
each character symbol and if the numerical value is divisible by 5, you should skip to next 
number (which control statement will help you to go to end of iteration?).*/

public class L4P16
{
	public static void main(String[] args)
	{
		for(int i=1;i<65535;i++)
		{
			if(i%5!=0)
			{
				char c=(char)i;
				System.out.println(c);
			}
		}
	}
}