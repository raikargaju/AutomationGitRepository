package test3;
class ClassWithStaticBlockAndMethod 
{
    static
    {
        System.out.println("Static block.");
    }
    static void staticMethod()
    {
        System.out.println("Static method.");
    }
}
class AnotherClass
{
    {
        System.out.println("Instance block in AnotherClass");
        ClassWithStaticBlockAndMethod.staticMethod();
    }
}
public class instanceBlockq5 {

	public static void main(String[] args) {
		// Q.05 Class With Static Block And Method
		 new AnotherClass();
	}
}