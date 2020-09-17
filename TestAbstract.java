abstract class Shape
{
	String color;
	//Declaring two abstract methods
	abstract double area();
	public abstract String toString();
	//Declaring Constructor
	public Shape(String color)
	{
		System.out.println("Shape Constructor is Called");
		this.color = color;
	}
	//Declaring a Concrete method
	public String getColor()
	{
		return color;
	}
}

class Circle extends Shape
{
	double radius;
	//Defining Constructor
	public Circle (String color,double radius)
	{
		super(color);
		System.out.println("Circle Constructor is Called");		
		this.radius = radius;	
	}
	
	@Override
	double area()
	{
		return Math.PI * Math.pow(radius,2);
	}
	@Override
	public String toString()
	{
		return "Circle color is : "+super.color+" and area is : " + area();
	}
}

class Rectangle extends Shape
{
	double length;
	double width;
	public Rectangle(String color,int length,int width)
	{
		super(color);
		System.out.println("Rectangle Constructor is Called");
		this.length = length;
		this.width = width;
	}
	@Override
	double area()
	{
		return length*width;	
	}
	@Override
	public String toString()
	{
		return "Rectangle color is "+super.color + "and area is : " + area();
	}
}

public class TestAbstract
{
	public static void main(String [] args)
	{
		Shape s1 = new Circle("SkyBlue",2);
		Shape s2 = new Rectangle("Green",5,10);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}
