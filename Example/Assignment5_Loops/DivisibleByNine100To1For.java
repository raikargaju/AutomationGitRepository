class DivisibleByNine100To1For
{
	public static void main(String args[])
	{
		int n;
		for (n = 100; n >= 1; n--)
		{
			if (n % 9 == 0)
			{
				System.out.println(n);
			}
		}
	}
}