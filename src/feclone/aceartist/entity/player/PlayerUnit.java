package feclone.aceartist.entity.player;
import feclone.aceartist.entity.Unit;

public class PlayerUnit extends Unit {

	private int experience = 0, level = 1;
	
	
	public PlayerUnit(int health, int aid, int strength, int defense, int magic, int resistance, int skill, int speed, int luck) {
		super(health, aid, strength, defense, magic, resistance, skill, speed, luck);
	}

	public void gainExperience(int exp) {
		experience += exp;
		if(experience >= 100)
		{
			unitLevelUp();
			experience -= 100;
		}
	}
	
	
	public void unitLevelUp() {
		System.out.println(" has leveled up!");
		
		System.out.println("Health: ->");
		
		
		System.out.println("Str: " + getStrength() + " -> ");
		System.out.println("Def: " + getDefense() + " - > ");
		
		
	}//End of 
	
	
}//End of class
