package assignment5;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int goOn = 1; //choice variable to continue the program or not
		
		while(goOn == 1) {
			
			//listing all the choices
	        System.out.println("Select the shape: ");
	        System.out.println("1. Circle ");
	        System.out.println("2. Rectangle ");
	        System.out.println("3. Square ");
	        System.out.println("4. Sphere ");
	        System.out.println("5. Cylinder ");
	        System.out.println("6. Pyramid ");
	
	        //taking user input
	        int choice = scanner.nextInt();
	        
	        switch (choice) {
	            case 1: 
	            	System.out.println("You selected Cirlce.");
	            	System.out.println("Enter the radius: "); //taking input
	                double radius = scanner.nextInt();
	                //creating circle object
	                Circle circle = new Circle(radius);
	                //displaying area and perimeter
	                System.out.println("Perimeter: " + circle.calculatePerimeter()); 
	                System.out.println("Area: " + circle.calculateArea());
	                break;
	                
	            case 2:
	            	 System.out.println("You selected Rectangle.");
	            	 //taking inputs
	            	 System.out.println("Enter the length:");
	                 double length = scanner.nextDouble();
	                 System.out.println("Enter the breadth:");
	                 double breadth = scanner.nextDouble();
	                 //creating rectangle object
	                 Rectangle rectangle = new Rectangle(length, breadth); 
	                 //displaying perimeter and area
	                 System.out.println("Perimeter: " + rectangle.calculatePerimeter());
	                 System.out.println("Area: " + rectangle.calculateArea());
	                 break;
	                 
	            case 3:
	            	System.out.println("You selected Square.");
	            	//taking inputs
	            	System.out.println("Enter the side:");
	            	double side = scanner.nextDouble();
	            	//creating square object
	                Square square = new Square(side);
	                //displaying area and perimeter
	                System.out.println("Perimeter: " + square.calculatePerimeter());
	                System.out.println("Area: " + square.calculateArea());
	                break;
	                
	            case 4:
	                System.out.println("You selected Sphere.");
	                //taking inputs
	                System.out.println("Enter the radius:");
	                radius = scanner.nextDouble();     
	                //create sphere object
	                Sphere sphere = new Sphere(radius);
	                //displaying area, perimeter, volume
	                System.out.println("Perimeter " + sphere.calculatePerimeter());
	                System.out.println("Area " + sphere.calculateArea());
	                System.out.println("Volume: " + sphere.calculateVolume()); 
	                break;        
	                
	            case 5:
	                System.out.println("You selected Cylinder.");
	                //taking inputs
	                System.out.println("Enter the radius:");
	                radius = scanner.nextDouble();   
	                System.out.println("Enter the height:");
	                double height = scanner.nextDouble();   
	                //create cylinder object
	                Cylinder cylinder = new Cylinder(radius, height);
	                //displaying area, perimeter, volume
	                System.out.println("Perimeter " + cylinder.calculatePerimeter());
	                System.out.println("Area " + cylinder.calculateArea());
	                System.out.println("Volume: " + cylinder.calculateVolume()); 
	                break;
	                
	            case 6:
	                System.out.println("You selected Pyramid.");
	                //taking inputs
	                System.out.println("Enter the length of the base:");
	                double baseEdgeLength = scanner.nextDouble();   
	                System.out.println("Enter the slant height:");
	                double slantHeight = scanner.nextDouble();   
	                //create pyramid object
	                Pyramid pyramid = new Pyramid(baseEdgeLength, slantHeight);
	                //displaying area, perimeter, volume
	                System.out.println("Perimeter " + pyramid.calculatePerimeter());
	                System.out.println("Area " + pyramid.calculateArea());
	                System.out.println("Volume: " + pyramid.calculateVolume()); 
	                break;
	                
	            default:
	                System.out.println("Invalid choice. Please select a valid option.");        
	        }
	        
	        System.out.println("\nContinue? (0/1) "); //asking the user if they want to continue
	        goOn = scanner.nextInt();	        
		}
		
		System.out.println("Exiting program. . . ");		
		scanner.close();

	}

}
