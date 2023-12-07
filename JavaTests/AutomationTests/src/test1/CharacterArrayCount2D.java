package test1;

public class CharacterArrayCount2D {

	public static void main(String[] args) {
		// Character Array Count2DWithoutLengthMethod
		char ch[][] = {{'A','B'},{'C','D'}};
		for(int i = 0;i < ch.length;i++)
		{
			for(int j = 0;j < ch.length;j++)
			{
				System.out.println(ch[i][j]+" ");
			}
		}
	}
}