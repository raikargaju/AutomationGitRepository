class TwelthTableReverseDoWhile
{
	public static void main(String args[])
	{
		int n,i,res;
		n = 12;
		i = 10;
	        do
		{
			res = n * i;
			System.out.println(n + " x " + i + " = " + res);
			i--;
	        } while (i >= 1);
	}
}