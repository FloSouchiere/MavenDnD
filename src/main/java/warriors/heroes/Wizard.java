package warriors.heroes;

import warriors.heroes.Character;

public class Wizard extends Character {

	// Attributes
	
	private static final String Name = "Wiz";
	private static final String Image = null;
	private static final int Life = 10;
	private static final int AttackLevel = 7;

	// Constructor

	public Wizard(String name, String url, int life, int strength) {
		super(name, url, life, strength);

	}
	
	public static Wizard Wizard = new Wizard ("Wiz", "img", 8, 10);

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
