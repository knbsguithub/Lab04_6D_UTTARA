/*15) Code a class named TestLoop with main(). Write the code to print the following when 
executed:
12345678910
12131415161718192021
23242526272829303132
343536…
Print all numbers in 1 line till you get a multiple of 11. Then skip the multiple of 11 and print 
the next set of numbers in next line (till 300).*/

class TestLoop
{
	public static void main(String[] args)
	{
		 for(int i=1;i<300;i++)
			if(i%11!=0)
			{
				System.out.print(i);
			}
			else
			{
				System.out.println();
			}
	}
}
