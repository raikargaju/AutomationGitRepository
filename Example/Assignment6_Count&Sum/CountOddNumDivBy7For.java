class CountOddNumDivBy7For
{
	public static void main(String args[])
	{
		int count = 0;
		for(int i = 200;i >= 100;i--)
		{
			if(i % 7 == 0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}