class CountOfNum
{
	public static void main(String args[])
	{
		int count = 0;
		for(int i = 100;i >= 20;i--)
		{
			if(i % 5 == 0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}