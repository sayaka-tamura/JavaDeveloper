import java.util.Random;

/**
 * @author Sayaka Tamura
 * 1. Max Value
 * 
 * Create a 2D integer array with 3 rows and 3 columns.
 * Fill the array with data.
 * 
 * Print out the maximum value in the array.
 */

public class MaxValue {
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
		
		int maxVal = arr[0][0];
		for (int i = 0; i < arr.length; i++) {			
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > maxVal)
					maxVal = arr[i][j];					
			}
		}
		
		System.out.println("The maxmum number is : " + maxVal);
	}
}
