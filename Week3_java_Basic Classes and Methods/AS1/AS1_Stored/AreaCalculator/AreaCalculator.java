import java.util.Scanner;

/**
 * @author Sayaka Tamura
 * 5-5. Area Calculator
 * 
 * Create four methods to calculate the area for different objects.
 * 
 * Your method declaration will look something like this:
 * public static double area_circle()   // returns the area of a circle
 * public static int area_rectangle()   // returns the area of a rectangle
 * public static int area_square()      // returns the area of a square
 * public static double area_triangle() // returns the area of a triangle
 * 
 * The equations for each are as follows:
 * Circle = pi * radius^2
 * Rectangle = length * width
 * Square = side^2
 * Triangle = 0.5 * base * height
 * 
 * Note: you can use Math.PI for the value of pi.
 * 
 * Create a main method that asks the user which object they would 
 * like to get the area of.
 * 
 * It will then direct them to that method.
 * 
 * Each method will then ask the user to input the value of each variable required.
 * For example, area_circle() will ask the user to input the radius.
 * 
 * The main method will then return the results.
 * 
 */
public class AreaCalculator {
	
	static Scanner in = new Scanner(System.in);
	private static double area;
	
	public static double area_circle() {
		System.out.println("What is the radius?");
		double radius = in.nextDouble();
		
		area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	
	public int area_rectangle() {
		System.out.println("Type integer for the length of a rectangle");
		int length = in.nextInt();
		System.out.println("Type integer for  the width of a rectangle");
		int width = in.nextInt();
		area = length*width;
		return (int) area;
	}
	
	public int area_square() {
		System.out.println("Type integer for the side of a square");
		int side = in.nextInt();
		area = Math.pow(side, 2);
		return (int) area;
	}
	

	public double area_triangle() {
		System.out.println("What is the height?");
		double height = in.nextInt();
		System.out.println("What is the base?");
		double base = in.nextInt();
		area = 0.5 * base * height;
		return area;
	}

	public double askArea() {
		System.out.println("Type a number which area you would like to get the area in 1 to 4");
		System.out.println("Circle: 1 \n" + "Rectangle: 2 \n" + "Square: 3 \n"
							+ "Triangle: 4 \n");
		
		int areaType = in.nextInt();
		switch(areaType)
		{
			case 1:
				area = area_circle();
				break;
			case 2:
				area = area_rectangle();
				break;
			case 3:
				area = area_square();
				break;
			case 4:
				area = area_triangle();
				break;
			default:
				System.out.println("InValid Input, try again");
		}
		return area;
	}

}
	

