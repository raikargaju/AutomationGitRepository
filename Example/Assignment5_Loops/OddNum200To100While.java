class OddNum200To100While
{
	public static void main(String args[])
	{		  
	        int n = 200;
	        while(n >= 100)
		{
			if(n % 2 != 0)
			System.out.println(n);
			n--;
		}
	}
}