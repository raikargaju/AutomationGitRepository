/* 8 8 8 8 8
   8 8 8 8
   8 8 8 
   8 8 
   8
*/
class Num8PatternWhile
{
	public static void main(String args[])
    	{
		int i=1;
        	while(i<=5)
        	{
	    		int j=5;
	    		while(j>=i)
            	{
			System.out.print("8 ");
                	j--;
	    	}
		System.out.println();
                i++;
		}
    	}
}