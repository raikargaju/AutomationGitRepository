/* 3
   3 3
   3 3 3
   3 3 3 3
   3 3 3 3 3
*/
class Num3PatternWhile
{
	public static void main(String args[])
    	{
        	int num=3;
		int i=1;
        	while(i<=5)
        	{
	    		int j=i;
	    		while(j>=1)
            		{
				System.out.print(num+" ");
                		j--;
	    		}
			System.out.println();
                	i++;
		}
    	}
}