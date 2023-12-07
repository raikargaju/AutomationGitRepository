package samplePrograms;
class Demo2
{
	Demo2(char ch[][])
	{
		char b[] = new char[ch.length * ch[0].length];
		int k = 0;
		for(int i = 0;i < ch.length;i++)
		{
			for(int j = 0;j < ch[i].length;j++)
			{
				b[k] = ch[i][j];
				k++;
			}
		}
		// Read elements from 1D char array
		for(char zz:b)
		{
			System.out.println(zz);
		}
	}
}
public class ConstructorChainingDemo3 {

	public static void main(String[] args) {
		// Constructor Chaining example 3
		char a[][] = {{'A','B','C'},{'D','E','F'}};
		new Demo2(a);
	}
}