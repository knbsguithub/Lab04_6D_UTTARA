/*7) Print "even" and the number or "odd" and the number between 1-100 ( odd 1, even 2, odd 3 and so on in each line).*/

public class L4P7
{
	public static void main(String[] args)
	{
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0)
			{
				System.out.println("odd "+i);
			}
			else
			{
				System.out.println("even "+i);
			}
		}
	}
}