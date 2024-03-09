package assignment5;

public class Square extends Shape{
	private double side;
	
	//constructor
	public Square(double side) {
		this.side = side;
	}
	
	//getters and setters
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double calculateArea() {
		return side*side;
	}
	
	@Override
	public double calculatePerimeter() {
		return 4*(side);
	}
}
