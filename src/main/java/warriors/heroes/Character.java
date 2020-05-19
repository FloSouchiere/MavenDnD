package warriors.heroes;

import warriors.contracts.Hero;

public abstract class Character implements Hero {

	// Attributes

	private String name;
	private String img_url;
	private int life;
	private int strength;

	// Constructor

	public Character(String name, String url, int life, int strength) {
		this.name = name;
		this.img_url = url;
		this.life = life;
		this.strength = strength;
	}

	// Getters

	public String getName() {
		return name;
	}

	public String getImage() {
		return img_url;
	}

	public int getLife() {
		return life;
	}

	public int getAttackLevel() {
		return strength;
	}
}
