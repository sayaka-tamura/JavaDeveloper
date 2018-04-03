import java.util.Scanner;

/**
 * @author Sayaka Tamura
 *  5-4. Pythagorean Theorum
 *	Create a method that takes in two sides of a triangle 
 *	and returns the length of the hypotenuse.
 *	
 *	This can be found with the following equation:
 *	c = sqrt(a^2 + b^2)
 *	
 *	Create a main that calls this method with at least 3 different
 *	sets of values and prints the results of each.
 *	
 */

public class PythagoreanTheorum {
	static double sideA;
	static double sideB;
	static double sideC;
	
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		
		System.out.println("Type a number for each length of triangle");
		Scanner in = new Scanner(System.in);
		sideA = in.nextDouble();
		sideB = in.nextDouble();
		sideC = t1.calcHypotenuse(sideA, sideB);
		
		printEveryLength();
		in.close();
	}
	
	public static void printEveryLength() {
		System.out.printf("Length of Side A: %.2f \n", sideA);
		System.out.printf("Length of Side B: %.2f \n", sideB);
		System.out.printf("Length of Side C: %.2f \n", sideC);
	}
	
}

