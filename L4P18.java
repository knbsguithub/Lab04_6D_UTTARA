/*18)Print the following:
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20 
3 9 12 15 18 …
Skip printing multiples of 4 & 5
6 12 18 … 60*/

public class L4P18
{
	public static void main(String[] argss)
	{
		for(int i=1;i<11;i++)
		{
			for(int j=1;j<11;j++)
			{
				if(i!=4 && i!=5)
				{
					int k=i*j;
					System.out.print(k+" ");
					if(j==10)
					{
						System.out.println();
					}
				}
			}
		}
	}
}