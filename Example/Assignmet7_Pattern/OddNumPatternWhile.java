/* 1
   3 5
   7 9 11
   13 15 17 18
   21 29 25 27 29
*/
class OddNumPatternWhile
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
                		n=n+2;
                		j++;
	    		}
			System.out.println();
                	i++;
		}
    	}
}