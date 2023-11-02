package test;

interface Shape {
	public abstract double getArea();
}
class Rectangle implements Shape {
	private double length, breadth;

	public Rectangle(double l, double b) {
		this.length = l;
		this.breadth = b;
	}

	public double getArea() {
		return length * breadth;
	}
}

class Square implements Shape {
	private double side;
	public Square(double a) {
		this.side = a;
	}

	public double getArea() {
		return Math.pow(side, 2);
	}
}

public class A5 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(6, 5);
		Square c = new Square(5);
		System.out.println("The area of rectangle is: "+r.getArea());
		System.out.println("The area of square is: "+c.getArea());
		
	}
}
