package shapes;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */
public class Circle implements Shape {

	private int radius;
	private static double pi = 3.14;
	public Circle(int radius) {
		this.radius = radius;
}

	
	public double calculateArea() {
		return( pi*(radius*radius));
	}
	
	public double calculatePerimeter() {
		return (2*pi*radius);
	}

	
	public String toString() {
		return "The area of the circle is" + " " + calculateArea() + "." + "The circumference of the circle is"+" "+calculatePerimeter()+".";
	}
}
