package assignment5;

public class Cylinder extends Shape implements Volume {
	private double radius;
	private double height;
	
	//constructor
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	//getters and setters
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}	

	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double calculateArea() {
		return 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius,  2) ;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}
	
	@Override
	public double calculateVolume() {
		return Math.PI * Math.pow(radius,  2) * height;
	}

}
