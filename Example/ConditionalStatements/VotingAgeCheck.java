class VotingAgeCheck
{
	public static void main(String args[])
	{
		int age = Integer.parseInt(args[0]);
		if (age >= 18)
		{
			System.out.println("Eligible for Voting.");
		}
		else
		{
			System.out.println(" Not Eligible for Voting.");
		}
	}
}