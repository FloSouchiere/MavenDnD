package warriors.board;

import warriors.board.EnemyCase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EnemyCase extends Case {

	// Attributes

	private int life;

	// Constructor

	public EnemyCase(int life, int strengthPower, String name) {
		super(strengthPower, name);

		this.life = life;

	}

	// Getter

	public int getLife() {
		return this.life;

	}

}