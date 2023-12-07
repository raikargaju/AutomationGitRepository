/* 4
   8 12
   16 20 24
   28 32 36 40
   44 48 52 56 60
*/
class Addition4NumPatternDoWhile
{
    	public static void main(String args[])
    	{
        	int k=4;
		int i=1;
        	do
        	{
	    		int j=1;
	    		do
            		{
				System.out.print(k+" ");
                		k=k+4;
                		j++;
	    		}while(j<=i);
			System.out.println();
                	i++;
		}while(i<=5);
    	}
}