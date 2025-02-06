package TicTacToe;

public class Board {
	public char[][] board = new char[3][3];
	
	public void setBoard(char[][] board, int row, int col, char symbol) {
		board[row][col] = symbol;
	}
	
	public void newBoard(char[][] board) {
		//buat new board
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = '-';
			}
		}
	}
	
	public void printBoard(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]);
				if(j != board[i].length - 1)System.out.print("|");
			}			
			System.out.println();
			if(i != board.length - 1)System.out.println("-+-+-");
		}
	}
	
	public boolean checkboard(char[][] board, int row, int col) {
		if(board[row][col] == '-')return true;
		
		return false;
	}
	
	
}
