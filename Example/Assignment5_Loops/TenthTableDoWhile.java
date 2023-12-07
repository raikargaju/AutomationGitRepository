class TenthTableDoWhile
{
	public static void main(String args[])
	{
		int n,i,res;
		n = 10;
		i = 1;
	        do
		{
			res = n * i;
			System.out.println(n + " x " + i + " = " + res);
			i++;
	        } while (i <= 10);
	}
}