/* 1
   2 3
   4 5 6
   7 8 9 10
   11 12 13 14 15
*/
class NumsPatternWhile
{
    	public static void main(String args[])
    	{
        	int n=1;
		int i=1;
        	while(i<=5)
        	{
	    		int j=1;
	    		while(j<=i)
            		{
				System.out.print(n+" ");
                		n=n+1;
                		j++;
	    		}
			System.out.println();
                	i++;
		}
    	}
}