class DigitCountIfElse
{
	public static void main(String args[])
	{
		int num = Integer.parseInt(args[0]);
		if ((num < 10) && (num >= 0))
		{
			System.out.println("One Digit Number.");
		}
		else if ((num < 100) && (num >= 10))
		{
			System.out.println("Two Digit Number.");
		}
		else if ((num < 1000) && (num >= 100))
		{
			System.out.println("Three Digit Number.");
		}
		else if ((num < 10000) && (num >= 1000))
		{
			System.out.println("Four Digit Number.");
		}
		else
		{
			System.out.println("Number has more than Four Digit Numbers.!");
		}
	}
}