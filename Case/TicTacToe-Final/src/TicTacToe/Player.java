package TicTacToe;

public class Player {
	private int playerNumber;
	private char playerSymbol;
	private String playerName;
	
	public Player(int num, char sym, String name){
		this.setPlayerNumber(num);
		this.setPlayerSymbol(sym);
		this.setPlayerName(name);
	}
	
	public void setPlayerNumber(int playerNumber){
		this.playerNumber = playerNumber;
	}
	public int getPlayerNumber() {
		return this.playerNumber;
	}
	
	public void setPlayerSymbol(char playerSymbol){
		this.playerSymbol = playerSymbol;
	}
	public char getPlayerSymbol() {
		return this.playerSymbol;
	}
	
	public void setPlayerName(String playerName){
		this.playerName = playerName;
	}
	public String getPlayerName() {
		return this.playerName;
	}
}
