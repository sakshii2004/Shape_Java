package assignment5;

public class Rectangle extends Shape{
	private double length;
	private double breadth;

	//constructor
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	//getters and setters
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public double calculateArea() {
		return length*breadth;
	}

	@Override
	public double calculatePerimeter() {
		return 2*(length+breadth);
	}	
}
