package Test1;

public class SumofEvenNumWhileloop {

	public static void main(String[] args) {
		// Sum of Even Numbers in between 1 to 100 using While Loop
		int sum=0;
		int i=1;
		while(i<=100)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}i++;
		}
		System.out.println(sum);
	}
}
