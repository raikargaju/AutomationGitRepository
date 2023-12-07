class SumOfSqure20NumFor
{
	public static void main(String args[])
	{
		int sum = 0;
		int x = 1;
		for(int i = 1;i <= 20;i++)
		{
			x = i * i;
			sum = sum + i;
		}
		System.out.println(sum);
	}
}