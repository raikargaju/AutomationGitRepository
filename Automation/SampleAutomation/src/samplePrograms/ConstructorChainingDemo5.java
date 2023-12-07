package samplePrograms;
class Demo4
{
	Demo4()
	{
		int fn = 0;
		int sn = 1;
		System.out.println(fn);
		System.out.println(sn);
		for(int i = 1;i <= 10;i++)
		{
			int tn = fn + sn;
			System.out.println(tn);
			fn = sn;
			sn = tn;
		}
	}
}
public class ConstructorChainingDemo5 {

	public static void main(String[] args) {
		// Constructor Chaining Demo5 for fibonanci Number
		new Demo4();
	}
}