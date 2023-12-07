package Test1;

public class CharArray1DReverse {

	public static void main(String[] args) {
		// Q.1 Char Array 1D in Reverse
		char ch[] = {'A','B','C','D','E','F'};
		for(int i = ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]+" ");
		}
	}
}