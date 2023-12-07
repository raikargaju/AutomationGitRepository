package test1;

public class DivisibleBy7DoWhileLoop {

	public static void main(String[] args) {
		// Divisible By 7 using Do While Loop in between 150 to 100.
		int i = 150;
		do
		{
			if(i % 7 == 0)
			{
				System.out.println(i);
			}
			i--;
		}while(i >= 100);
	}
}