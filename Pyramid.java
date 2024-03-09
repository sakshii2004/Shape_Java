package assignment5;

public class Pyramid extends Shape implements Volume {
	
	private double slantHeight;
	private double baseEdgeLength;
	
	//constructor
	public Pyramid(double baseEdgeLength, double slantHeight) {
		this.baseEdgeLength = baseEdgeLength;
		this.slantHeight = slantHeight;
	}
	
	//getters and setters
	public double getBaseEdgeLength() {
		return baseEdgeLength;
	}
	
	public void setBaseEdgeLength(double baseEdgeLength) {
		this.baseEdgeLength = baseEdgeLength;
	}
	
	public double getSlantHeight() {
		return slantHeight;
	}
	
	public void setSlantHeight(double slantHeight) {
		this.slantHeight = slantHeight;
	}
	
	@Override
	public double calculateArea() {
		return Math.pow(baseEdgeLength,  2) + 2 * baseEdgeLength * slantHeight;
	}
	
	@Override
	public double calculatePerimeter() {
		return 4 * baseEdgeLength;
	}	

	@Override
	public double calculateVolume() {
		return (1.0/3.0) * Math.pow(baseEdgeLength, 2) * slantHeight;
	}
}
