/* *
   * *
   * * * 
   * * * *
   * * * * * 
*/
class StarPatternDoWhile
{
    	public static void main(String args[])
    	{
		int i=1;
        	do
        	{
	    		int j=i;
	    		do
            		{
				System.out.print("* ");
                		j--;
	    		}while(j>=1);
			System.out.println();
                	i++;
		}while(i<=5);
    	}
}