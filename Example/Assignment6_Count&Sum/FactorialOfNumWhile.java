class FactorialOfNumWhile

{
	public static void main(String args[])
	{		  
	        int fact = 1;
		int n = Integer.parseInt(args[0]);
		int i = n;
	        while(i >= 1)
		{
			fact *= i;
			i--;
		}
		System.out.println(fact);
	}
}