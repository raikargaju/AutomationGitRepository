/* 1
   2 2
   3 3 3
   4 4 4 4
   5 5 5 5 5
*/
class NumForwordPatternDoWhile
{
    	public static void main(String args[])
    	{
		int i=1;
        	do
        	{
	    		int j=1;
	    		do
            		{
				System.out.print(i+" ");
                		j++;
	    		}while(j<=i);
			System.out.println();
                	i++;
		}while(i<=5);
    	}
}