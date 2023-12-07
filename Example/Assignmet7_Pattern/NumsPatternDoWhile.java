/* 1
   2 3
   4 5 6
   7 8 9 10
   11 12 13 14 15
*/
class NumsPatternDoWhile
{
    	public static void main(String args[])
    	{
        	int n=1;
		int i=1;
        	do
        	{
	    		int j=1;
	    		do
            		{
				System.out.print(n+" ");
                		n=n+1;
                		j++;
	    		}while(j<=i);
			System.out.println();
                	i++;
		}while(i<=5);
    	}
}