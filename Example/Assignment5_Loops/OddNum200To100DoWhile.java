class OddNum200To100DoWhile
{
	public static void main(String args[])
	{
		int n = 200;
	        do
		{
			if (n % 2 != 0)
			System.out.println(n);
			n--;
	        } while(n >= 100);
	}
}