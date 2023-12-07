/* 1
   3 5
   7 9 11
   13 15 17 18
   21 29 25 27 29
*/
class OddNumPatternDoWhile
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
                		n=n+2;
                		j++;
	    		}while(j<=i);
			System.out.println();
                	i++;
		}while(i<=5);
    	}
}