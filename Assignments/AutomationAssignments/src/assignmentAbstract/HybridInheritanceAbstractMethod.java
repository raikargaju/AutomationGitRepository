package assignmentAbstract;
abstract class House
{
	abstract void HouseName(String name);
	
}
class Window extends House
{
	void HouseName(String name)
	{
		System.out.println("House name : "+name);
	}
	void windowmaterial(String name)
	 {
		System.out.println("window material : "+name);
	 }
	
}
class Door extends House
{
	void HouseName(String name)
	{
		System.out.println("House name : "+name);
	}
	 void Doormaterial(String name)
	 {
		System.out.println("Door material : "+name);
	 }
	
}
class Room extends Door
{
	void Roomname(String name)
	{
		System.out.println("Roomname : "+name);
	}

}
public class HybridInheritanceAbstractMethod {

	public static void main(String[] args) {
		// Q.05 Hybrid Inheritance Abstract Method
		Room O = new Room();
		 O.HouseName("Sharada Nilaya");
		 O.Doormaterial("Wood");
		 O.Roomname("Bed Room");
		 
		 System.out.println("---------------------------");
		 Window obj = new Window();
		 obj.HouseName("Narayan Nilaya");
		 obj.windowmaterial("Teak");
	}

}