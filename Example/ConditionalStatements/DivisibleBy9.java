class DivisibleBy9
{
	public static void main(String args[])
	{
		int num = Integer.parseInt(args[0]);
		if (num%9==0)
		{
			System.out.println(num+" This number is Divisible by 9");
		}
		else
		{
			System.out.println(num+" This number is not Divisible by 9");
		}
	}
}