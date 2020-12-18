package feclone.aceartist.entity.player;

public enum UnitGrowths {

	MARTH("Marth", 0, 0, 0, 0, 0, 0, 0,0, 0);
	
	
	
	private final String name;
	private final int health, aid;
	private final int stregth, defense;
	private final int magic, resistance;
	private final int skill, speed, luck;
	
	private UnitGrowths(String name, int health, int aid, int stregth, int defense, int magic, int resistance, int skill, int speed, int luck) {
		this.name = name;
		this.health = health;
		this.aid = aid;
		this.stregth = stregth;
		this.defense = defense;
		this.magic = magic;
		this.resistance = resistance;
		this.skill = skill;
		this.speed = speed;
		this.luck = luck;
	}
	
	
}
