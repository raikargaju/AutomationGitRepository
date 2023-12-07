package test1;

public class SumNumDivisibleByThreeForLoop {

	public static void main(String[] args) {
		// Sum of Numbers in between 300 to 600 Divisible By Three using For Loop
		int sum = 0;
		for(int i=300;i<=600;i++)
		{
			if(i % 3 == 0)
			{
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}