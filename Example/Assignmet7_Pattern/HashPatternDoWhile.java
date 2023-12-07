/* # # # # #
   # # # #
   # # #
   # #
   #
*/
class HashPatternDoWhile
{
	public static void main(String args[])
	{
		char ch='#';
		int i=1;
        	do
        	{
	    		int j=5;
	    		do
            	{
				System.out.print(ch+" ");
                		j--;
	    		}while(j>=i);
				System.out.println();
                		i++;
		}while(i<=5);
	}
}