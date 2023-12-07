package Test1;

public class SumofEvenNumForloop {

	public static void main(String[] args) {
		// Sum of Even Numbers in between 1 to 100 using For Loop
		int sum = 0;
		for(int i = 1;i <= 100;i++)
		{
			if(i % 2 == 0)
			{
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}