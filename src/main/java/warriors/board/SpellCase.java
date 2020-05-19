package warriors.board;

import warriors.board.Case;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SpellCase extends Case {

	// Attributes

	private int bonusPower;
	private int strengthPower;
	private String name;

	// Constructor

	public SpellCase(int bonusPower, String name) {
		super(bonusPower, name);
	}

}
