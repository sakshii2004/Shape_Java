package assignment5;

//abstract class for Shape
public abstract class Shape {
	
	//non-abstract method
	void showShape(String shape) {
		System.out.println("Shape: "+ shape);
	}
	
	//abstract methods for area and perimeter
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
}
