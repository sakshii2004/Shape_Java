package assignment5;

public class Sphere extends Shape implements Volume {
	
	private double radius;
	
	//constructor
	public Sphere(double radius) {
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
		return 4 * Math.PI * Math.pow(radius, 2);
	}
	
	@Override
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}	

	@Override
	public double calculateVolume() {
		return 4/3 * Math.PI * Math.pow(radius, 3);
	}
}
