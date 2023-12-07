class TwelthTableReverseWhileLoop
{
	public static void main(String args[])
	{		  
	        int n,i,res;
		n = 12;
	        i = 10;
	        while (i >= 1)
		{
			res = n * i;
			System.out.println(n + " x " + i + " = " + res);
			i--;
		}
	}
}