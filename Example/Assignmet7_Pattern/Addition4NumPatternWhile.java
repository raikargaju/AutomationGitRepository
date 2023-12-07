/* 4
   8 12
   16 20 24
   28 32 36 40
   44 48 52 56 60
*/
class Addition4NumPatternWhile
{
    	public static void main(String args[])
    	{
        	int k=4;
		int i=1;
        	while(i<=5)
        	{
	    		int j=1;
	    		while(j<=i)
            		{
				System.out.print(k+" ");
                		k=k+4;
                		j++;
	    		}
			System.out.println();
                	i++;
		}
    	}
}