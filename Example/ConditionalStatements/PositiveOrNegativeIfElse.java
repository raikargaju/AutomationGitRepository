class PositiveOrNegativeIfElse
{
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);
		if (n > 0)
		{
			System.out.println(n+" is Positive Number.");
		}
		else if (n < 0)
		{
			System.out.println(n+" is Nagative Number.");
		}
		else
		{
			System.out.println(n+" is Zero.");
		}
	}
}