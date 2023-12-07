package Test1;

public class ContinueStatementWhileLoop {

	public static void main(String[] args) {
		// Continue Statement using While Loop
		int i = 1;
		while(i <= 10)
		{
			if(i % 2 != 0)
			{
				i++;
				continue;
			}
		}
		System.out.println(i);
		i++;
	}
}