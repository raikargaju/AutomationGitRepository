class FactorialOfNumDoWhile
{
	public static void main(String args[])
	{
		int fact = 1;
		int n = Integer.parseInt(args[0]);
		int i = n;
	        do
		{
			fact *= i;
			i--;
	        } while (i >= 1);
		System.out.println(fact);
	}
}