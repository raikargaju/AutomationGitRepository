package test3;
class Demo16
{  
    {
	System.out.println("First instance block!!");
    }
    {
	System.out.println("Second instance block!!");
    }
    {
	System.out.println("Third instance block!!");
    }
}
public class q10instanceblock {

	public static void main(String[] args) {
		// Q.10
        new Demo16();
	}
}