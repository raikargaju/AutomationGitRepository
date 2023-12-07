/* 3
   3 3
   3 3 3
   3 3 3 3
   3 3 3 3 3
*/
class Num3PatternDoWhile
{
	public static void main(String args[])
    	{
        	int num=3;
		int i=1;
        	do
        	{
	    		int j=i;
	    		do
            		{
				System.out.print(num+" ");
                		j--;
	    		}while(j>=1);
			System.out.println();
                	i++;
		}while(i<=5);
    	}
}