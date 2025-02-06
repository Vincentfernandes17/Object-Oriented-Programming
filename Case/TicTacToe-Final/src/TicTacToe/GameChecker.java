package TicTacToe;

public class GameChecker {
	
	
	public static boolean tieCheck(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if(board[i][j] == '-')return false;
			}
		}
		return true;
	}
	
	public static boolean winningCheck(char[][] board, char currentPlayer) {
		//check horizontally
		for (int i = 0; i < board.length; i++) {
			if(board[i][0] == currentPlayer &&
				board[i][1] == currentPlayer &&
				board[i][2] == currentPlayer) {
				return true;
			}
		
		}
		
		//check vertically
		for (int i = 0; i < board[0].length; i++) {
			if(board[0][i] == currentPlayer &&
					board[1][i] == currentPlayer &&
					board[2][i] == currentPlayer) {
					return true;
			}
		}
		
		//check diagonally
		if(board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer)return true;
		if(board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)return true;
		
		
		//haven't won
		return false;
	}
}
