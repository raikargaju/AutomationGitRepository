class SumOfCube10To20NumFor
{
	public static void main(String args[])
	{
		int sum = 0;
		int x = 1;
		for(int i = 10;i <= 20;i++)
		{
			x = i * i * i;
			sum = sum + i;
		}
		System.out.println(sum);
	}
}