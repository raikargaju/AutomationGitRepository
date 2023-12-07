/* 5 5 5 5 5
   4 4 4 4
   3 3 3
   2 2
   1
*/
class NumReversePatternDoWhile
{
    	public static void main(String args[])
    	{
		int i=5;
        	do
        	{
	    		int j=1;
	    		do
            		{
				System.out.print(i+" ");
                		j++;
	    		}while(j<=i);
			System.out.println();
                	i--;
		}while(i>=1);
    	}
}