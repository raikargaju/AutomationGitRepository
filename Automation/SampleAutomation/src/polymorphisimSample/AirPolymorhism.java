package polymorphisimSample;

abstract class Air
{
	abstract void AirComposition();
}
class Nitrogen extends Air
{
	String a="78%";
	void AirComposition()
	{
		System.out.println("Nitrogen Compostion: "+a);
	}
}
class Oxygen extends Air
{
	String b="21%";
	void AirComposition()
	{
		System.out.println("Oxygen Composition: "+b);
	}
}
class Carbondioxide extends Air
{
	String c="0.04%";
	void AirComposition()
	{
		System.out.println("Carbondioxide Composition: "+c);
	}
}
public class AirPolymorhism {

	public static void main(String[] args) {
		
		Nitrogen nitro=new Nitrogen();
		Oxygen oxy=new Oxygen();
		Carbondioxide car=new Carbondioxide();
		
		nitro.AirComposition();
		oxy.AirComposition();
		car.AirComposition();
	}

}
