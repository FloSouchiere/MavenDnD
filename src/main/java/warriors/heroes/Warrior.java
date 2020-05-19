package warriors.heroes;

import warriors.heroes.Character;

public class Warrior extends Character {

	// Attributes
	
	private static final String Name = "War";
	private static final String Image = null;
	private static final int Life = 8;
	private static final int AttackLevel = 10;

	// Constructor

	public Warrior(String name, String url, int life, int strength) {
		super(name, url, life, strength);

	}
	
	public static Warrior Warrior = new Warrior (Name, Image, Life, AttackLevel);

	// Methods
	
	@Override
	public String getName() {
		return Name;
	}

	@Override
	public String getImage() {
		return Image;
	}

	@Override
	public int getLife() {
		return Life;
	}

	@Override
	public int getAttackLevel() {
		return AttackLevel;
	}

}
