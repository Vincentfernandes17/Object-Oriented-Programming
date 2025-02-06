package TicTacToe;

import java.util.Scanner;

public class Game {
	private boolean gameDone = false;
	Board board = new Board();
	Scanner input = new Scanner(System.in);
	Player player1 = new Player(1, 'O', "Player 1");
	Player player2 = new Player(2, 'X', "Player 2");
	Player currentPlayer = player1;

	public boolean playAgain() {
		String playAgainOption = "null";
		while(!(playAgainOption.equalsIgnoreCase("yes")) && !(playAgainOption.equalsIgnoreCase("no")) ) {
			System.out.println("Play again?[yes / no]");
			input.nextLine();
			playAgainOption = input.nextLine();
		}
		if(playAgainOption.equalsIgnoreCase("yes")) {
			return true;
		}else {
			return false;
		}
	}
	
	public void play() {
		System.out.println("Tic Tac TOE");
		System.out.println("===========");
		board.newBoard(board.board);
		while(!gameDone) {
			board.printBoard(board.board);
			System.out.println("Player " + currentPlayer.getPlayerNumber() + " move: ");
			int col;
			int row;
			do {
				col = input.nextInt();
				row = input.nextInt();
				if(col < 0 || col > 2 || row < 0 || row > 2)System.out.println("Move Out of bounds!");
			}while(col < 0 || col > 2 || row < 0 || row > 2);
			
			
			
			
			if(board.checkboard(board.board, row, col)) {
				board.setBoard(board.board, row, col, currentPlayer.getPlayerSymbol());
				boolean win = GameChecker.winningCheck(board.board, currentPlayer.getPlayerSymbol());
				boolean tie = GameChecker.tieCheck(board.board);
				if(win) {
					System.out.println("Player " + currentPlayer.getPlayerNumber() + " has won!");
					board.printBoard(board.board);
					//untuk tanya user apakah mau main ulang
					if(playAgain()) {
						gameDone = false;
						board.newBoard(board.board);
					}else {
						gameDone = true;
					}					
				}else if(tie){
					System.out.println("Game is a TIE!");
					board.printBoard(board.board);
					if(playAgain()) {
						gameDone = false;
						board.newBoard(board.board);
					}else {
						gameDone = true;
					}	
				}else {
					//switch player
					currentPlayer = (currentPlayer.getPlayerSymbol() == 'O')? player2: player1;
				}
				
			}else {
				System.err.println("Invalid move!");
			}
		}
		if(gameDone)System.out.println("Thank you for playing!");
		return;
	}
	
}
