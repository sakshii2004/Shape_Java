package assignment5;

public class Circle extends Shape {
	private double radius;	
	
	//constructor
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//getters and setters
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	@Override
	public double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	@Override
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}
}
