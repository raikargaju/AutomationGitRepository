package assignmentInterface;
interface Shape1
{
	void draw();
}
interface ColorShape1 extends Shape1
{
	void setColor(String color);
}
interface FillShape1 extends ColorShape1
{
	void fill();
}
class Triangle implements FillShape1
{
	public void draw()
	{
		System.out.println("Drawing a Triangle");
	}
	public void setColor(String color)
	{
		System.out.println("Setting color to " +color);
	}
	public void fill()
	{
		System.out.println("Filling the Triangle");
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		// Q.03 MultiLevel Inheritance One interface extends another interface.
		Triangle circle = new Triangle();
		circle.draw();
		circle.setColor("Blue");
		circle.fill();
	}
}