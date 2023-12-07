package samplePrograms;
class demo9
{
	void show()
	{
		for(int i = 100;i >= 50;i--)
		{
			if(i % 3 == 0)
			{
				System.out.println(i);
			}
		}

	}

}
public class DivisibleByThree {

	public static void main(String[] args) {
		demo9 O = new demo9();
		O.show();
	}
}