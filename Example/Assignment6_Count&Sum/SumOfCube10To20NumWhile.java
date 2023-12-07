class SumOfCube10To20NumWhile

{
	public static void main(String args[])
	{		  
	        int i,x,sum;
		i = 10;
		x = 0;
		sum = 0;
	        while(i <= 20)
		{
			x = i * i * i;
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}
}