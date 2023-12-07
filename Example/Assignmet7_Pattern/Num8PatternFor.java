/* 8 8 8 8 8
   8 8 8 8
   8 8 8 
   8 8
   8
*/
class Num8PatternFor
{
	public static void main(String args[])
   	{
		int num=8;
        	for(int i=1;i<=5;i++)
        	{
	    		for(int j=5;j>=i;j--)
	    		{
				System.out.print(num+" ");
            		}
                	System.out.println();
        	}
    	}
}