package returnMethods;
class Demo1
{
	String getName()
	{
		String s = "Ganesh";
		return s;
	}
	int getAge()
	{
		int age = 21;
		return age;
	}
	String[] getHobbies(String hobbies[])
	{
		return hobbies;
	}
}
public class SampleDemo1 {

	public static void main(String[] args) {
		Demo1 O = new Demo1();
		String S1 = O.getName();
		System.out.println(S1);
		int a = O.getAge();
		System.out.println(a);
		String Str[] = {"Reading","Programming"};
		String S2[] = O.getHobbies(Str);
		
		for(String kk : S2)
		{
			System.out.print(kk+" ");
		}
	}
}