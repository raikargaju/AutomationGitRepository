/* # # # # #
   # # # #
   # # #
   # #
   #
*/
class HashPatternFor
{
    public static void main(String args[])
    {
        char ch='#';
	for(int i=1;i<=5;i++)
        {
	    for(int j=5;j>=i;j--)
            {
		System.out.print(ch+" ");
	    }
		System.out.println();
	}
    }
}
   