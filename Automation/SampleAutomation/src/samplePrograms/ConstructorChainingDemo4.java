package samplePrograms;
class Demo3
{
	Demo3(int num)
	{
		int flag = 0;
		for(int i = 2;i < num;i++)
		{
			if(num % i == 0)
			{
				flag = flag + i;
				break;
			}
		}
		if(flag == 0)
		{
			System.out.println(num+" is a Prime Number.");
		}
		else
		{
			System.out.println(num+" is not a Prime Number.");
		}
	}
}
public class ConstructorChainingDemo4 {

	public static void main(String[] args) {
		// Constructor Chaining Demo 4 Given Number is  Prime or Not
		new Demo3(11);
		new Demo3(21);
		new Demo3(8);
	}
}