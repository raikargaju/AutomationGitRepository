package samplePrograms;
class BasicMaths
{
	BasicMaths(int x,int y,String action)
	{
		int res = 0;
		switch(action)
		{
		case "add":
			res = x + y;
			System.out.println("Addition Result: "+res);
			break;
		case "sub":
			res = x - y;
			System.out.println("Substraction Result: "+res);
			break;
		case "div":
			res = x / y;
			System.out.println("Division Result: "+res);
			break;
		case "mul":
			res = x * y;
			System.out.println("Multiplication Result: "+res);
			break;
		}
	}
}
public class ConstructorChainingDemo6 {

	public static void main(String[] args) {
		// Constructor Chaining Demo 6 for Basic Math's
		new BasicMaths(10,20,"add");
		new BasicMaths(20,8,"sub");
		new BasicMaths(10,2,"div");
		new BasicMaths(8,9,"mul");
	}
}