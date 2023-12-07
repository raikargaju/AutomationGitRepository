/* 4
   8 12
   16 20 24
   28 32 36 40
   44 48 52 56 60
*/
class Addition4NumPatternFor
{
	public static void main(String args[])
   	{
        	int k=4;
        	for(int i=1;i<=5;i++)
        	{
	    		for(int j=1;j<=i;j++)
	    		{
				System.out.print(k+" ");
				k=k+4;
            		}
                	System.out.println();
        	}
    	}
}