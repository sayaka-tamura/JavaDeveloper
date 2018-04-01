import java.util.Scanner;

/**
 * @author Sayaka Tamura
 * 
 * Create a 2D character array with 5 rows and 5 columns
 * To start, fill every position with an O.
 * Then, fill the [0][0] position with an X.
 * This X represents the user's "avatar".

 * Create a loop which does the following:
 * -Starts by printing the array
 * -Asks the user for what direction they would like to go
 * -Waits for user input
 * -Moves the avatar in that direction, if it exists (ie: up=row-1, right=column+1)
 * -If it does not exist, tell the user and exit the program
 * -Fill the avatar's new position with an X
 * -Fill the avatar's old position with an O
 * 
 * Example Output:
 * 
 * Current Map:
 * =========
 * X O O O O
 * O O O O O
 * O O O O O
 * O O O O O
 * O O O O O
 * =========
 * Which direction would you like to move?
 * >down
 * 
 * Current Map:
 * =========
 * O O O O O
 * X O O O O
 * O O O O O
 * O O O O O
 * O O O O O
 * =========
 * Which direction would you like to move?
 * >right
 * 
 * Current Map:
 * =========
 * O O O O O
 * O X O O O
 * O O O O O
 * O O O O O
 * O O O O O
 * =========
 * Which direction would you like to move?
 * >up
 * 
 * Current Map:
 * =========
 * O X O O O
 * O O O O O
 * O O O O O
 * O O O O O
 * O O O O O
 * =========
 * Which direction would you like to move?
 * >up
 * 
 * Error: You cannot move there from your current position
 * Exiting program...
 *
 */

public class Movement2DPlane {
	
//	loop:
//	- Starts by printing the array	
//	- Asks the user for what direction they would like to go
//	- Moves the avatar in that direction, if it exists (ie: up=row-1, right=column+1)
//	- If it does not exist, tell the user and exit the program
//	- Fill the avatar's new position with an X
//	- Fill the avatar's old position with an O
	
	public static final int ROWS = 5;
	public static final int COLS = 5;
	public static char [][] map = new char[ROWS][COLS];
	
	// cell contents
	public static final char CROSS = 'X';
	public static final char NOUGHT = 'O';
	
	// The map and the status
	public static boolean currentState = true;
	public static int avRow, avCol = 0;
	public static int tempRow, tempCol = 0;
	
	private static Scanner in = new Scanner(System.in); 
	private static String command = "";
	
	public static void main(String[] args) {
		upDateTable();
		do {
			paint();
			
			askDirection();
			upDateTable();	
		} while(currentState);
	}

	private static void upDateTable() {
		for (int row = 0; row < ROWS; row++) {
			for (int col = 0; col < COLS; col++) {
				map[row][col] = NOUGHT;
			}
		}
		map[avRow][avCol] = CROSS;
		
	}

	public static void askDirection() {
		System.out.println("Which direction would you like to move? enter 'UP','DOWN','RIGHT' or 'LEFT'");
		command = in.nextLine();
		
		switch(command.toUpperCase()) 
		{
			case "UP": 
				tempRow =  avRow;
				avRow = avRow-1;
				break;
			case "DOWN":
				tempRow =  avRow;
				avRow = avRow+1;
				break;
			case "RIGHT":
				tempCol =  avCol;
				avCol = avCol+1;
				break;
			case "LEFT":
				tempCol =  avCol;
				avCol = avCol-1;
				break;
		}
		
		if(avRow>= 0 && avRow <ROWS &&
				avCol >= 0 && avCol<COLS && map[avRow][avCol] != 'X') 
		{currentState = true;}
		else {
			System.out.println("Error: You cannot move there from your current position");
			System.out.println("Exiting program...");
			System.exit(0);
		}
			
	}

	
	public static void paint() {
		 System.out.println("Current Map:");  
		 System.out.println("===============");
		 
	     for (int row = 0; row < ROWS; row++) {
	        for (int col = 0; col < COLS; col++) {
	        	System.out.print(" " + map[row][col] + " ");   // each cell paints itself
	        }
	        System.out.println();
	     }
	     System.out.println("===============");
  }
}
