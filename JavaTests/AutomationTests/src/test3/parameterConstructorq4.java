package test3;
class Demo5
{
    void instanceMethod()
    {
        System.out.println("Instance method");
    }
    static void staticMethod()
    {
        System.out.println("Static method");
    }
}
class AnotherClass1
{
    AnotherClass1()
    {
        System.out.println("Parameterized constructor in AnotherClass");
        Demo5.staticMethod();

        Demo5 instance = new Demo5();
        instance.instanceMethod();
    }
}
public class parameterConstructorq4 {

	public static void main(String[] args) {
		// Q.04 Class With Instance And Static Method
        new AnotherClass();
	}
}