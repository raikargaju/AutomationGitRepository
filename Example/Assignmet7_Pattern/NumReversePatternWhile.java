/* 5 5 5 5 5
   4 4 4 4
   3 3 3
   2 2
   1
*/
class NumReversePatternWhile
{
    	public static void main(String args[])
    	{
		int i=5;
        	while(i>=1)
        	{
	    		int j=1;
	    		while(j<=i)
            		{
				System.out.print(i+" ");
                		j++;
	    		}
			System.out.println();
                	i--;
		}
    	}
}