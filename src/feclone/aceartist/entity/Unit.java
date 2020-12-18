package feclone.aceartist.entity;

public class Unit {

	
	private int health, aid;
	private int strength, defense;
	private int magic, resistance;
	private int skill, speed, luck;
	
	public Unit(int health, int aid, int strength, int defense, int magic, int resistance, int skill, int speed, int luck) {
		this.health = health;
		this.aid = aid;
		this.strength = strength;
		this.defense = defense;
		this.magic = magic;
		this.resistance = resistance;
		this.skill = skill;
		this.speed = speed;
		this.luck = luck;
	}//End of constructor

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int stregth) {
		this.strength = stregth;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getMagic() {
		return magic;
	}

	public void setMagic(int magic) {
		this.magic = magic;
	}

	public int getResistance() {
		return resistance;
	}

	public void setResistance(int resistance) {
		this.resistance = resistance;
	}

	public int getSkill() {
		return skill;
	}

	public void setSkill(int skill) {
		this.skill = skill;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getLuck() {
		return luck;
	}

	public void setLuck(int luck) {
		this.luck = luck;
	}
	
}//End of class
