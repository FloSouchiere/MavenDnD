package warriors.board;

import warriors.board.Case;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WeaponCase extends Case {

	// Constructor

	private static int bonusPower;
	private static String name;

	// Constructor

	public WeaponCase(int bonusPower, String name) {
		super(bonusPower, name);
	}

}