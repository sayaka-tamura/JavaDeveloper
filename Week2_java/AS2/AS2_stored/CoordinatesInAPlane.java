import java.util.Scanner;

/**
 * @author Sayaka Tamura
 * 
 * 4. Coordinates in a plane
 * 
 * Create a program that takes two integers: [x] and [y].
 * In that program, print out all possible coordinates of (0-x, 0-y)
 * Note that 0-y means 0 through y in this case.
 * 
 * Your output could look like the following:
 * What is the maximum x?
 * >2
 * What is the maximum y?
 * >3
 * 
 * Here are your possible coordinates:
 * (0,0)
 * (0,1)
 * (0,2)
 * (0,3)
 * (1,0)
 * ...
 * (2,3)
 * 
 */

public class CoordinatesInAPlane {
	public static void main(String[] args) {
		System.out.println("What is the maximum x?");		
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		
		System.out.println("What is the maximum y?");	
		int y = in.nextInt();
		in.close();
		
		System.out.println("all possible coordinates of (0-x, 0-y) are ");
		for (int i = 0; i <= x; i++) {
			for (int j = 0; j <= y; j++) {
				System.out.println("(" + i + "," + j + ")");
			}
		}

	}
}
