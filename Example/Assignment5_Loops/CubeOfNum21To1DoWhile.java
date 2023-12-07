class CubeOfNum21To1DoWhile
{
	public static void main(String args[])
	{
		int n,x;
		n = 21;
	        do
		{
			x = n * n * n;
			System.out.println(x);
			n--;
	        } while (n >= 1);
	}
}