package assignment5;

import java.util.Scanner;

public class UserInput {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static double Circle() {
		System.out.println("Enter the radius of the circle: ");
		double radius = scanner.nextDouble();
		return radius;
	}

}
