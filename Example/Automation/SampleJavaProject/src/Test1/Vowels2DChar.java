package Test1;

public class Vowels2DChar {

	public static void main(String[] args) {
		// Q.8 Vowels Two Dimensional Character array 3 x 3
		char ch[][] = {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
		for(int i = 0;i<ch.length;i++)
		{
			for(int j = 0;j<ch.length-1;j++)
			{
				System.out.print(ch[i][j]+" ");
			}
		}
		System.out.println();
	}
}