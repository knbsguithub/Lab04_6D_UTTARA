/*1) Print HelloWorld 10 times to the monitor using for, while & do..while control statements.*/

public class L4P1
{
	public static void main(String[] args)
	{
		/*for loop
		for(int i=0;i<10;i++)
		{
			System.out.println("HelloWorld");
		}*/
		
		/*while loo
		int  i=0;
		while(i<10)
		{
			System.out.println("HelloWorld");
			i++;
		}*/
		
		int i=0;
		do
		{
			System.out.println("HelloWorld");
			i++;
		}while(i<10);
	}
}