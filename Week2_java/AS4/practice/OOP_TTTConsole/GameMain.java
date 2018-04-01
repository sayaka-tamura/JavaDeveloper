import java.util.Scanner;

public class GameMain {
	private Board board;
	private GameState currentState;
	private Seed currentPlayer;
	
	private static Scanner in = new Scanner(System.in);
	
	/** Constructor to setup the game */
	public GameMain() {
		board = new Board();
		
		initGame();
		do {
			playerMove(currentPlayer);
			board.paint();
			updateGame(currentPlayer);
			
			if (currentState == GameState.CROSS_WON) {
	            System.out.println("'X' won! Bye!");
	        } else if (currentState == GameState.NOUGHT_WON) {
	           System.out.println("'O' won! Bye!");
	        } else if (currentState == GameState.DRAW) {
	           System.out.println("It's Draw! Bye!");
	        }
			currentPlayer = (currentPlayer == Seed.CROSS) ? Seed.NOUGHT : Seed.CROSS;
		} while (currentState == GameState.PLAYING);
	}
	
	public void initGame() {
		board.init();
		currentPlayer = Seed.CROSS;
		currentState = GameState.PLAYING;
	}
	
	/** The player with "theSeed" makes one move, with input validation.
    Update Cell's content, Board's currentRow and currentCol. */
	public void playerMove(Seed theSeed) {
      boolean validInput = false;  // for validating input
      do {
         if (theSeed == Seed.CROSS) {
            System.out.print("Player 'X', enter your move (row[1-3] column[1-3]): ");
         } else {
            System.out.print("Player 'O', enter your move (row[1-3] column[1-3]): ");
         }
         int row = in.nextInt() - 1;
         int col = in.nextInt() - 1;
         if (row >= 0 && row < Board.ROWS && col >= 0 && col < Board.COLS
               && board.cells[row][col].content == Seed.EMPTY) {
            board.cells[row][col].content = theSeed;
            board.currentRow = row;
            board.currentCol = col;
            validInput = true; // input okay, exit loop
         } else {
            System.out.println("This move at (" + (row + 1) + "," + (col + 1)
                  + ") is not valid. Try again...");
         }
      } while (!validInput);   // repeat until input is valid
   }
	
	public void updateGame(Seed theSeed) {
		if (board.hasWon(theSeed)) {  // check for win
			currentState = (theSeed == Seed.CROSS) ? GameState.CROSS_WON : GameState.NOUGHT_WON;
		} else if (board.isDraw()) {  // check for draw
			currentState = GameState.DRAW;
		}
      // Otherwise, no change to current state (still GameState.PLAYING).
	}
	
	public static void main(String[] args) {
	    new GameMain();  // Let the constructor do the job
	}
	
}
