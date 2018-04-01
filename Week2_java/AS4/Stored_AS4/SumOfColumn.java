import java.util.Random;
import java.util.Scanner;

/**
 * @author Sayaka Tamura
 * 
 * 2. Sum of a column
 * 
 * Create a 2D integer array with 3 rows and 3 columns.
 * Fill the array with random data.
 * 
 * Ask the user which column they would like to get the sum of.
 * Get the total of all values in that column.
 * 
 * For instance, if the user chose column 1:
 * array[0][1] + array[1][1] + array[2][1]
 * 
 */

public class SumOfColumn {
	public static void main(String[] args) {
			
			int [][] arr = new int[3][3];
			Random rnd = new Random();
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = rnd.nextInt(100)+1;
				}
			}	
			
			System.out.println("Generating rondom numbers in 3x3 table...");
			for(int[] row: arr) {
				for (int val: row) 
					System.out.print(val + " ");
				System.out.println();
			}
			
			System.out.println("Type a number which column you would like to get the sum of?");
			Scanner in = new Scanner(System.in);
			int userinput = in.nextInt(); 
			
			
			int sum = 0;
			for (int i = 0; i < arr[userinput].length; i++) {			
						sum += arr[i][userinput];					
			}
			
			System.out.println("The of the column : " + sum);
			in.close();
		}
}



