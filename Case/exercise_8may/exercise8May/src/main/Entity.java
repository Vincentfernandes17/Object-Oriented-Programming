package main;

public class Entity implements IHeal, IRecoverable, IAttack, IDamageable{
	private String name;
	private int damage;
	private int defense;
	private HP hp;
	private HP maxHp;
	
	public Entity(String name, HP hp, int damage, int defense) {
		this.name = name;
		this.hp = hp;
		this.damage = damage;
		this.defense = defense;
		this.setMaxHp(hp);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public HP getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp.setHp(hp);
	}
	
	public void showHP() {
		System.out.printf(this.name + " current HP is " + hp.getHp() + "\n");
	}

	@Override
	public int takeDamage(int damage, int defense) {
		int totalDamage = damage - defense;
		totalDamage = (totalDamage < 0)? 0: totalDamage;
		System.out.printf(this.name + " is taking damage for " + totalDamage + " points(s)\n" );
		return totalDamage;
	}

	@Override
	public void attack(IDamageable damageable) {
		Enemy enemy = (Enemy) damageable;
		System.out.printf(this.name + " attacking " + enemy.getName() +"\n");
		int totalDamage = enemy.takeDamage(this.damage, enemy.getDefense());
		int currentHP = enemy.getHp().getHp();
		enemy.setHp(currentHP - totalDamage);
	}

	@Override
	public void recover(int value) {
		this.hp.heal(value);
		int currentHealth = hp.getHp();
		if(currentHealth > maxHp.getHp())hp.setHp(maxHp.getHp());
		System.out.printf(this.name + " recovered " + value+ " point(s)\n");
	}

	@Override
	public void heal(int value) {
		this.hp.heal(value);
		int currentHealth = hp.getHp();
		if(currentHealth > maxHp.getHp())hp.setHp(maxHp.getHp());
		System.out.printf(this.name + " healed " + value+ " point(s)\n");
	}

	public HP getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(HP maxHp) {
		this.maxHp = maxHp;
	}
	
}
