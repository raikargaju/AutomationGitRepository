package assignmentMethods;

class Democ
{
	Democ()
	{
		int count = 0;
		for(int i = 1;i <= 100;i++)
		{
			if(i % 3 == 0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}

public class PrimeNumDemo2 {

	public static void main(String[] args) {
		// Constructor method count Prime number in between 1 - 100
		new Democ();
	}
}