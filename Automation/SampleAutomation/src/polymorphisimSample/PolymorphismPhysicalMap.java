package polymorphisimSample;

abstract class PhysicalMap
{
	abstract void ContinentLocation();
	
}
class Asia extends PhysicalMap
{
	void ContinentLocation()
	{
		String a="North East";
		System.out.println("Asia ContinentLocation: "+a);
	}
}
class Australia extends PhysicalMap
{
	void ContinentLocation()
	{
		String b="South East";
		System.out.println("Australia ContinentLocation: "+b);
	}
}
class NorthAmerica extends PhysicalMap
{
	void ContinentLocation()
	{
		String c="North West";
		System.out.println("NorthAmerica ContinentLocation: "+c);
	}
}
public class PolymorphismPhysicalMap {

	public static void main(String[] args) {
		
		Asia asia =new Asia();
		Australia australia=new Australia();
		NorthAmerica northAmerica=new NorthAmerica();
		
		
		asia.ContinentLocation();
		
		australia.ContinentLocation();
		
		northAmerica.ContinentLocation();
		
	}

}
