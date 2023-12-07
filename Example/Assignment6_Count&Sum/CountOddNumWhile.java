class  CountOddNumWhile
{
	public static void main(String args[])
	{		  
	        int i,count;
		i = 250;
		count = 0;
	        while(i <= 500)
		{
			if(i % 2 != 0)
				count++;
				i++;
		}
		System.out.println(count);
	}
}