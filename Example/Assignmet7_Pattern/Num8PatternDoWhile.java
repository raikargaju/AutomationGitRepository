/*
  8 8 8 8 8
  8 8 8 8
  8 8 8
  8 8
  8
*/
class Num8PatternDoWhile
{
	public static void main(String args[])
    	{
		int i=1;
        	do
        	{
	    		int j=5;
	    		do
            		{
				System.out.print("8 ");
                		j--;
	    		}while(j>=i);
			System.out.println();
                	i++;
		}while(i<=5);
    	}
}