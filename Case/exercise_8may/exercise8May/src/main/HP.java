package main;

public class HP {
	private int health;

	public HP(int health) {
		this.health = health;
	}

	public int getHp() {
		return health;
	}

	public void setHp(int health) {
		this.health = health;
	}
	
	public void heal(int heal) {
		this.health += heal;
	}
}
