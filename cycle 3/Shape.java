import java.util.*;
import java.lang.*;
abstract class Shape
{
	abstract void numberofsides();
}
class Rectangle extends Shape
{
	void numberofsides()
	{
		System.out.println("The number of sides in the rectangle is:4");
		
	}
	void printArea(int l,int b)
	{
		System.out.println("The area of the rectangle is:"+l*b);
	}
}
class Triangle extends Shape
{
	void numberofsides()
	{
		System.out.println("The number of sides in Triangle is:3");
	}
	void printArea(int l,double h)
	{
		System.out.println("The area of the triangle is:"+(0.5*l*h));
	}
}
class Hexagon extends Shape
{
	void numberofsides()
	{
		System.out.println("The number of sides in Hexagon is:6");
	}
	void printArea(int l)
	{
		System.out.println("The area of the hexagon is:"+((3*Math.sqrt(3)/2)*Math.pow(l,2)));
	}
}
class Abshape
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int a,b,c,sl;
		double h; 
		Rectangle r1=new Rectangle();
		Triangle t1=new Triangle();
		Hexagon h1=new Hexagon();
		r1.numberofsides();
		t1.numberofsides();
		h1.numberofsides();
		System.out.println("Enter the length of the Rectangle:");
		a=s1.nextInt();
		System.out.println("Enter the breadth of the Rectangle:");
		b=s1.nextInt();
		System.out.println("Enter the height of the Triangle:");
		h=s1.nextDouble();
		System.out.println("Enter the length of the Triangle:");
		c=s1.nextInt();
		System.out.println("Enter the side length of the Hexagon:");
		sl=s1.nextInt();
		r1.printArea(a,b);
		t1.printArea(c,h);
		h1.printArea(sl);
	}
}
