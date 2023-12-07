class  CountOddNumDivBy7While
{
	public static void main(String args[])
	{		  
	        int i,count;
		i = 200;
		count = 0;
	        while(i >= 100)
		{
			if(i % 7 == 0)
			count++;
			i--;
		}
		System.out.println(count);
	}
}