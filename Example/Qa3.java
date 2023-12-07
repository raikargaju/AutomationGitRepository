package www.sgtesting.interfacedemo;

interface Company
{
	void CompanyName(String name);
}
interface Product extends Company
{
	abstract void ProductName(String name);
}
interface Employee extends Product
{
	abstract void EmployeeName(String name);
}
class Infosis implements Company,Product,Employee
{
	public void CompanyName(String name)
	{
		System.out.println("Company Name :"+name);
	}
	public void ProductName(String name)
	{
		System.out.println("Product Name :"+name);
	}
	public void EmployeeName(String name)
	{
		System.out.println("Employee Name:"+name);
	}
	void Location(String Location)
	{
		System.out.println("Location :"+Location);
	}
}
public class Qa3 {
	public static void main(String[] args) {
		Infosis o=new Infosis();
		o.CompanyName("Reliance");
		o.ProductName("Mobile Phone");
		o.EmployeeName("Manoj");
		o.Location("Bangalore");

	}

}
