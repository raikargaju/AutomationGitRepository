class FactorialOfNumFor
{
	public static void main(String args[])
	{
		int fact = 1;
		int n = Integer.parseInt(args[0]);
		for(int i = n;i >= 1;i--)
		{
			fact *= i;
		}
		System.out.println(fact);
	}
}
