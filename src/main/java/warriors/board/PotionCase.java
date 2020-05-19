package warriors.board;

import warriors.board.Case;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PotionCase extends Case {

	// Attributes

	private static int bonusPower;
	private static String name;

	// Constructor

	public PotionCase(int bonusPower, String name) {
		super(bonusPower, name);
	}

}