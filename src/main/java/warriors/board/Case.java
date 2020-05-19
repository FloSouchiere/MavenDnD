package warriors.board;

import warriors.board.Case;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class Case {
	
	// Attributes
	
	int strengthPower;
	String name;
	
	// Constructor
	
	public Case(int strengthPower, String name) {

		this.strengthPower = strengthPower;
		this.name = name;
	}
	
	//	public void enemyEvent(GameState game, EventCase event) {
	//String new_log = game.getLastLog();
	//int enemyLife = ((Enemy) event).getLife();
	//enemyLife -= game.getHero().getAttackLevel();
	//new_log += "\n"+game.getPlayerName()+" se trouve devant un "+event.getName()+" et lui inflige "+game.getHero().getAttackLevel()+" pts de dégats !";
	//if (enemyLife < 1) {
	//	new_log += "\n" + event.getName() + " n'a pas survécu à l'attaque de " + game.getPlayerName();
	//} else {
	//	int atkfromenemy = event.getPower();
	//	int newlife = (game.getHero().getLife() - atkfromenemy);
	//	((Character) game.getHero()).setLife(newlife);
	//	new_log +="\n"+event.getName()+" survit et riposte en infligeant "+atkfromenemy+" pts de dégats !\nPoints de vie restants : "+game.getHero().getLife();
	//}
	//((Gamestate) game).setLastLog(new_log);
//}

	public Case(String name) {

		this.name = name;
	}
	
}
