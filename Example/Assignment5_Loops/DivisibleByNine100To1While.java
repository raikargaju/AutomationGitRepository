class DivisibleByNine100To1While
{
	public static void main(String args[])
	{		  
	        int n = 100;
	        while (n >= 1)
		{
			if (n % 9 == 0)
			System.out.println(n);
			n--;
		}
	}
}