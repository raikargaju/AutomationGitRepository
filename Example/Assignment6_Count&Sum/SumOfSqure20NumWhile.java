class  SumOfSqure20NumWhile
{
	public static void main(String args[])
	{		  
	        int i,x,sum;
		i = 1;
		x = 0;
		sum = 0;
	        while(i <= 20)
		{
			x = i * i;
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}
}