class StudentGradeNestedIfElse
{
	public static void main(String args[])
	{
		int m = Integer.parseInt(args[0]);
		if ((m >= 70) && (m <= 100))
		{
			System.out.println("The result is First Class with Distinction.");
		}
		else if ((m < 70) && (m >= 60))
		{
			System.out.println("The result is First Class.");
		}
		else if ((m < 60) && (m >= 50))
		{
			System.out.println("The result is Second Class.");
		}
		else if ((m < 50) && (m >= 35))
		{
			System.out.println("The result is Pass Class.");
		}
		else if ((m < 35) && (m >= 0))
		{
			System.out.println("The result is Failed.");
		}
		else
		{
			System.out.println("Invalid Marks.!");
		}
	}
}