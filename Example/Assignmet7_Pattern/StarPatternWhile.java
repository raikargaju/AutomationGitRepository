/* *
   * *
   * * *
   * * * *
   * * * * *
*/
class StarPatternWhile
{
    	public static void main(String args[])
    	{
		int i=1;
        	while(i<=5)
        	{
	    		int j=i;
	    		while(j>=1)
            		{
				System.out.print("* ");
                		j--;
	    		}
			System.out.println();
                	i++;
		}
    	}
}