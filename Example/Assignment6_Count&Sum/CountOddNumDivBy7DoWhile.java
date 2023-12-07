class CountOddNumDivBy7DoWhile
{
	public static void main(String args[])
	{
		int i = 200;
		int count = 0;
	        do
		{
			if(i % 7 == 0)
			count++;
			i--;
	        } while (i >= 100);
		System.out.println(count);
	}
}