package TicTacToe;

public class GameDriver {
	Board board = new Board();
	Game gameNow = new Game();
	
	public void newGame() {
		board.newBoard(board.board);
		//TO DO: MANGGIL PLAY LANGSUNG DI SINI
		gameNow.play();
	}
}
