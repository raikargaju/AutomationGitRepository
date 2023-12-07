class FifthTableReverseDoWhile
{
	public static void main(String args[])
	{
		int n,i,res;
		n = 5;
		i = 10;
	        do
		{
			res = n * i;
			System.out.println(res);
			i--;
	        } while (i >= 1);
	}
}