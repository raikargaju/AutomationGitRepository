package assignmentInterface;
interface Shape2
{
	void draw();
}
interface Square extends Shape2
{
	void drawSquare();
}
interface Rectangle extends Shape2
{
	void drawRectangle();
}
class SquareShape implements Square
{
	public void draw()
	{
		System.out.println("Drawing a shape (Square)");
	}
	public void drawSquare()
	{
		System.out.println("Drawing a Square");
	}
}
class RectangleShape implements Rectangle
{
	public void draw()
	{
		System.out.println("Drawing a shape (rectangle)");
	}
	public void drawRectangle()
	{
		System.out.println("Drawing a rectangle");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// Q.04 Hierarchical Inheritance One interface extends another interface.
		SquareShape circleShape = new SquareShape();
		circleShape.draw();
		circleShape.drawSquare();
		RectangleShape rectangleShape = new RectangleShape();
		rectangleShape.draw();
		rectangleShape.drawRectangle();
	}
}