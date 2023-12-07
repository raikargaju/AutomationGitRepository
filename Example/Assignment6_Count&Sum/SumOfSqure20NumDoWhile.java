class SumOfSqure20NumDoWhile
{
	public static void main(String args[])
	{
		int i = 1;
		int sum = 0;
		int x = 1;
	        do
		{
			x = i * i;
			sum = sum + i;
			i++;
	        } while (i <= 20);
		System.out.println(sum);
	}
}