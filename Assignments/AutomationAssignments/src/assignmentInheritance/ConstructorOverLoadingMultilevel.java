package assignmentInheritance;

class Studenta
{
	Studenta(String fname)
	{
		System.out.println("First Name : "+fname);
	}
	Studenta(String address,int rnum)
	{
		System.out.println("Address : "+address);
		System.out.println("Roll No : "+rnum);
	}
}
class Studentb extends Studenta
{
	String Cname;
	Studentb(String fname,String Cname)
	{
		super(fname);
		this.Cname = Cname;
		System.out.println("College Name : "+Cname);
	}
	String Colladdress;
	Studentb(String address,int rnum,String Colladdress)
	{
		super(address,rnum);
		this.Colladdress = Colladdress;
		System.out.println("College Address : "+Colladdress);
	}	
}
class Studentc extends Studentb
{
	String Sname;
	Studentc(String fname,String Cname,String Sname)
	{
		super(fname,Cname);
		this.Sname = Sname;
		System.out.println("Sports Name : "+Sname);
	}
	String Sground;
	Studentc(String address,int rnum,String Colladdress,String Sground)
	{
		super(address,rnum,Colladdress);
		this.Sground = Sground;
		System.out.println("Sport Ground : "+Sground);
	}
}

public class ConstructorOverLoadingMultilevel {
	public static void main(String[] args) {
		// Question No 5
		new Studentc("Rajesh","Jain Institute","Cricket");
		new Studentc("Bidar",25,"Dudda","Hasanamba");
	}
}