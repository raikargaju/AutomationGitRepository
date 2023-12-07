class LargeNum3Integers
{
	public static void main(String args[])
	{
		int n1,n2,n3,Largest;
		n1 = Integer.parseInt(args[0]);
		n2 = Integer.parseInt(args[1]);
		n3 = Integer.parseInt(args[2]);
		if (n1 >= n2 && n1 >= n3)
		{
			Largest = n1;
			System.out.println(n1+" is Largest Number.");
		}
		else if (n2 >= n1 && n2 >= n3)
		{
			Largest = n2;
			System.out.println(n2+" is a Largest Number.");
		}
		else
		{
			Largest = n3;
			System.out.println(n3+" is a Largest Number.");
		}
	}
}