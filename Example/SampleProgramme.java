package com.sgtesting.Polymorphism;

abstract class Figure
{
	abstract void calculateArea();
	
}
class Square extends Figure
{
	void calculateArea()
	{
		int side=5;
		System.out.println("Area of square:"+(side*side));
	}
}
class Rectangle extends Figure
{
	void calculateArea()
	{
		int l,b;
		l=5;b=12;
		System.out.println("Area of Rectangle:"+(l*b));
	}
}
class Circle extends Figure
{
	void calculateArea()
	{
		double pi=3.142;
		double r=2.5;
		System.out.println("Area of Circle:"+(pi*r*r));
	}
}
public class SampleProgramme {

	public static void main(String[] args) {
		
		Figure figure=null;
		Square square =new Square();
		Rectangle rect=new Rectangle();
		Circle circle=new Circle();
		
		
		figure =square;
		figure.calculateArea();
		
		figure =rect;
		figure.calculateArea();
		
		figure =circle;
		figure.calculateArea();
		
	}

}
