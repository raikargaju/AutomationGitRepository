package assignmentInterface;
abstract class Shape
{
	abstract double calculateArea();
}
interface Drawable
{
	void draw();
}
interface Colorable
{
	void setColor(String color);
}
class Circle extends Shape implements Drawable, Colorable
{
	private double radius;
	public Circle(double radius)
	{
		this.radius = radius;
	}
	double calculateArea()
	{
		return Math.PI * radius * radius;
	}
	public void draw()
	{
		System.out.println("Drawing a circle");
	}
	public void setColor(String color)
	{
		System.out.println("Color is "+color);
	}
}
public class MultipleInheritanceq2 {

	public static void main(String[] args) {
		// Q.02 Multiple Inheritance subclass extends an abstract class & implements more than two interface.
		Circle circle = new Circle(4.0);
		circle.draw();
		circle.setColor("Red");
		System.out.println("Circle Area: " + circle.calculateArea());
	}
}