/* # # # # #
   # # # #
   # # #
   # #
   #
*/
class HashPatternWhile
{
	public static void main(String args[])
	{
		char ch='#';
		int i=1;
        	while(i<=5)
        	{
	    		int j=5;
	    		while(j>=i)
            	{
				System.out.print(ch+" ");
                		j--;
	    		}
			System.out.println();
            	i++;
		}
    	}
}
  