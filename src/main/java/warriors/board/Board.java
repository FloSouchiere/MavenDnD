package warriors.board;

import warriors.board.Board;
import warriors.board.EnemyCase;
import warriors.board.EmptyCase;
import warriors.board.PotionCase;
import warriors.board.SpellCase;
import warriors.board.WeaponCase;
import warriors.contracts.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Board implements Map {

	// Attributes

	private final List<Case> MapCase = null;
	private String mapName;
	private int numberOfCases;

	// Constructor

	Board(String name, int numberOfCases) {
		this.setMapName(name);
		this.numberOfCases = numberOfCases;
	}

	public Board(int bonusPower, int strengthPower, int life, String name) {

	}

	public String getName() {
		return this.getMapName();

	}

	public int getNumberOfCase() {
		return this.numberOfCases;

	}

	public String getMapName() {
		return mapName;
	}

	public void setMapName(String mapName) {
		this.mapName = mapName;
	}

	public static Map Board = new Board("MapLe Joe", 64);

	public void setBoard() {
		ArrayList<Case> MapCase = null;

		// 1-5
		MapCase.add(new LightningSpell());
		MapCase.add(new Bow());
		MapCase.add(new Gobelin());
		MapCase.add(new LightningSpell());
		MapCase.add(new Masse());

		// 6-10
		MapCase.add(new Gobelin());
		MapCase.add(new PotionSmall());
		MapCase.add(new LightningSpell());
		MapCase.add(new Gobelin());
		MapCase.add(new Warlock());

		// 11-15
		MapCase.add(new Bow());
		MapCase.add(new Gobelin());
		MapCase.add(new PotionSmall());
		MapCase.add(new Bow());
		MapCase.add(new Gobelin());

		// 16-20
		MapCase.add(new EmptyCase());
		MapCase.add(new LightningSpell());
		MapCase.add(new Gobelin());
		MapCase.add(new Bow());
		MapCase.add(new Warlock());

		// 21-25
		MapCase.add(new Gobelin());
		MapCase.add(new Masse());
		MapCase.add(new LightningSpell());
		MapCase.add(new Gobelin());
		MapCase.add(new Warlock());

		// 26-30
		MapCase.add(new Bow());
		MapCase.add(new Gobelin());
		MapCase.add(new PotionSmall());
		MapCase.add(new PotionSmall());
		MapCase.add(new Gobelin());

		// 31-35
		MapCase.add(new PotionMedium());
		MapCase.add(new Warlock());
		MapCase.add(new PotionSmall());
		MapCase.add(new EmptyCase());
		MapCase.add(new Warlock());

		// 36-40
		MapCase.add(new Warlock());
		MapCase.add(new Warlock());
		MapCase.add(new Masse());
		MapCase.add(new EmptyCase());
		MapCase.add(new Warlock());

		// 41-45
		MapCase.add(new PotionLarge());
		MapCase.add(new Sword());
		MapCase.add(new PotionMedium());
		MapCase.add(new Warlock());
		MapCase.add(new Dragon());

		// 46-50
		MapCase.add(new EmptyCase());
		MapCase.add(new Warlock());
		MapCase.add(new FireBall());
		MapCase.add(new FireBall());
		MapCase.add(new EmptyCase());

		// 51-55
		MapCase.add(new EmptyCase());
		MapCase.add(new Dragon());
		MapCase.add(new Sword());
		MapCase.add(new EmptyCase());
		MapCase.add(new EmptyCase());

		// 56-60
		MapCase.add(new Dragon());
		MapCase.add(new EmptyCase());
		MapCase.add(new EmptyCase());
		MapCase.add(new EmptyCase());
		MapCase.add(new EmptyCase());

		// 61-64
		MapCase.add(new EmptyCase());
		MapCase.add(new Dragon());
		MapCase.add(new EmptyCase());
		MapCase.add(new EmptyCase());

	}

	@Override

	public List<Case> getListCase() {
		return MapCase;
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public boolean containsKey(Object key) {
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		return false;
	}

	@Override
	public Object get(Object key) {
		return null;
	}

	@Override
	public Object put(Object key, Object value) {
		return null;
	}

	@Override
	public Object remove(Object key) {
		return null;
	}

	@Override
	public void putAll(Map m) {

	}

	@Override
	public void clear() {

	}

	@Override
	public Set keySet() {
		return null;
	}

	@Override
	public Collection values() {
		return null;
	}

	@Override
	public Set entrySet() {
		return null;
	}

}
