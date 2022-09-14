/*10) Print the multiplication tables for all values from 1 to 10 (1x1, 1x2…1x10 and then 2x1, 2x2, 2x3…)*/
public class L4P10
{
	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++)
		{
			for (int a=1;a<=10;a++)
			{
				System.out.println(i + " X "+ a +"=" +a*i);
			}
		}
	}
}