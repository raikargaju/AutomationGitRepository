package test1;

public class ContinueStatementForLoop {

	public static void main(String[] args) {
		// Continue Statement using For Loop
		for(int i = 0;i<=10;i++)
		{
			if(i % 2 != 0)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}