package test1;

public class CountNumDivisibleByEightForLoop {

	public static void main(String[] args) {
		// Count the Numbers in between 500 to 800 Divisible By Eight using For Loop.
		int count = 0;
		for(int i=500;i<=800;i++)
		{
			if(i % 8 == 0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}