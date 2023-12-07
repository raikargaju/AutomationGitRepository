class DivisibleBy4
{
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);
		if (n%4==0)
		{
			System.out.println(n+" is Divisible by 4");
		}
		else
		{
			System.out.println(n+" is Not Divisible by 4");
		}
	}
}