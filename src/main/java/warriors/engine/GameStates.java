package warriors.engine;

import warriors.board.Board;
import java.util.Random;
import warriors.contracts.GameState;
import warriors.contracts.GameStatus;
import warriors.contracts.Hero;
import warriors.contracts.Map;

public class GameStates implements GameState {
	
	
	//Attributes
	
	String playerName;
	Hero hero;
	Map map;
	String GameID;
	GameStatus gameStatus;
	String LastLog;
	int CurrentCase;
	Random random = new Random();

	//Constructor
	
	public GameStates(String playerName, Hero hero, Map map) {
		this.playerName = playerName;
		this.hero = hero;
		this.map = map;
		this.gameStatus = GameStatus.IN_PROGRESS;
		this.GameID = "Game";
		this.LastLog = "Start";
		this.CurrentCase = 0;
	}

	@Override
	public String getPlayerName() {
		return this.playerName;
	}

	@Override
	public String getGameId() {
		return this.GameID;
	}

	@Override
	public GameStatus getGameStatus() {
		return this.gameStatus;
	}

	@Override
	public Hero getHero() {
		return this.hero;
	}

	@Override
	public Map getMap() {
		return this.map;
	}

	@Override
	public String getLastLog() {
		return this.LastLog;
	}

	@Override
	public int getCurrentCase() {
		return this.CurrentCase;
	}

	@Override
	public void setGameStatus(warriors.contracts.GameStatus finished) {

		
	}

	public void movePlayer(int dice) {
		
		this.CurrentCase = this.CurrentCase+dice;
		
		if (this.CurrentCase >= getMap().getNumberOfCase()) {
			gameStatus = GameStatus.FINISHED;
		}
		// Délencher les évènements de la case sur laquelle le joureur vient de tomber
	}
	
	private void nextCase() {
		int CurrentCase = getCurrentCase();
		CurrentCase++;
		setCurrentCase(CurrentCase);
		setLastLog(" Vous avancez en case"+getCurrentCase());
		
	}

	private void setLastLog(String string) {
	}

	private void setCurrentCase(int currentCase2) {		
	}
	
}