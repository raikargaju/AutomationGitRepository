package samplePrograms;
class College
{
	College(String name)
	{
		System.out.println("College Name: "+name);
	}
	College(int branchcount)
	{
		this("Jain College of Engineering");
		System.out.println("Number of branches in College: "+branchcount);
	}
}
public class ConstructorChainingDemo1 {

	public static void main(String[] args) {
		// Constructor Chaining example 1
		new College(4);
	}
}