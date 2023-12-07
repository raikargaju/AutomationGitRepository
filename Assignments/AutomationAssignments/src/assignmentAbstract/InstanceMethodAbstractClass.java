package assignmentAbstract;
abstract class Hotel
{
	void HotelName(String name)
	{
		System.out.println("Hotel Name : "+name);
	}
	void HotelLocation(String location)
	{
		System.out.println("Hotel Location : "+location);
	}
}
class Chef extends Hotel
{
	
	void Chefspecial(String name)
	{
		System.out.println("Chefspecial Name : "+name);
	}
}
public class InstanceMethodAbstractClass {

	public static void main(String[] args) {
		// Q.06 
		Chef ob=new  Chef();
		 ob.HotelName("Tiptur");
		 ob.HotelLocation("Pai Hotel");
		 ob.Chefspecial("Gadbud icecream");
	}

}