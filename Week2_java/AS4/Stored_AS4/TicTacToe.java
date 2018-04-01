import java.util.Scanner;

/**
 * @author Sayaka Tamura
 * 
 * 3. Tic Tac Toe
 * 
 * Create a 2D character array with 3 rows and 3 columns.
 * Start by filling the array with spaces.
 * 
 * Create a loop that will do the following:
 * Ask the user for what row and column they would like to place their mark.
 * If the spot is currently filled with a space, place their mark.
 * If it's currently an odd-numbered turn, the mark is X
 * If it's currently an even-numbered turn, the mark is Y
 * At the end of their turn, print the current board
 * 
 * Continue until all spaces are filled.
 */

public class TicTacToe {
	public static char [][] table = new char[3][3];
	public static char [] blankLine = {' ', ' ', ' '};
	public static final int ROWS = 3;
	public static final int COLS = 3;
	public static int currentRow, currentCol;
	public static char currentPlayer;
	public static int turn=1;
	public static Scanner in = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		initGame();

		do {
			playerMark(currentPlayer);		
			printTable();	
			
			// Switch player
	        currentPlayer = (currentPlayer == 'X') ? 'Y' : 'X';
	        turn++;
		} while (turn < 10);
		System.out.println("The game has ended. Bye!");
	} 

	public static void initGame() {
		table = fill(table, blankLine);
		currentPlayer = 'X'; // cross plays first
		System.out.println("Tic Tac Toe!");
	}
	

	public static char[][] fill(char[][] table, char[] blankLine) {
		for(int i=0; i<table.length; i++)
			table[i] = blankLine.clone();
		return table;
	}

	public static void playerMark(char player) {
		boolean validInput = false;
		do {
			if(turn%2 != 0)
				System.out.println("Player 'X', enter your move (row[1-3] column[1]");
			else
				System.out.println("Player 'Y', enter your move (row[1-3] column[1]");
			
			int rowNum = in.nextInt()-1;
			int colNum = in.nextInt()-1;
			
			if(rowNum>= 0 && rowNum <ROWS && colNum >= 0 && colNum<COLS && table[rowNum][colNum] == ' ')
			{
				currentRow = rowNum;
				currentCol = colNum;
				table[currentRow][currentCol] = player;
				validInput = true;
			}else {
				System.out.println("This move at (" + (rowNum + 1) + "," + (colNum + 1) + ") is not valid. Try again...");
			}
			
		} while(!validInput);
	}		
			
	private static void printTable() {
		// Print table
		for (int row = 0; row < ROWS; row++) {
			for (int col = 0; col < COLS; col++) {
				printCell(table[row][col]);		// print each of the cells
				
				if(col != COLS-1)
					System.out.print("|");		// print vertical partition
			}
			System.out.println();
			if(row != ROWS-1)
				System.out.println("-----------"); // print horizontal partition
		}
		System.out.println();
	}

	private static void printCell(char content) {
		switch(content) {
			case ' ': System.out.print("   "); break;
			case 'Y': System.out.print(" Y "); break;
			case 'X': System.out.print(" X "); break;
		}
	}
}


