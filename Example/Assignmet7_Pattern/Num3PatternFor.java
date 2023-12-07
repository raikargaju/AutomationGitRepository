/* 3
   3 3
   3 3 3
   3 3 3 3
   3 3 3 3 3
*/
class Num3PatternFor
{
	public static void main(String args[])
   	{
		int num=3;
        	for(int i=1;i<=5;i++)
        	{
	    		for(int j=i;j>=1;j--)
	    		{
				System.out.print(num+" ");
            		}
                	System.out.println();
        	}
    	}
}