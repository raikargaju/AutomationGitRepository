class DivisibleByNine100To1DoWhile
{
	public static void main(String args[])
	{
		int n = 100;
	        do
		{
			if (n % 9 == 0)
			System.out.println(n);
			n--;
	        } while (n >= 1);
	}
}