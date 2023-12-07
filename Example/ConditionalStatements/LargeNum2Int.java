class LargeNum2Int
{
	public static void main(String args[])
	{
		int n1,n2,Largest;
		n1 = Integer.parseInt(args[0]);
		n2 = Integer.parseInt(args[1]);
		if (n1 > n2)
		{
			Largest = n1;
			System.out.println(n1+" is Largest Number!");
		}
		else
		{
			Largest = n2;
			System.out.println(n2+" is Largest Number!");
		}
	}
}