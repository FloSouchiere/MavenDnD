package warriors.engine;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

import warriors.board.Board;
import warriors.contracts.GameState;
import warriors.contracts.GameStatus;
import warriors.contracts.Hero;
import warriors.contracts.Map;
import warriors.contracts.WarriorsAPI;
import warriors.heroes.Character;
import warriors.heroes.Warrior;
import warriors.heroes.Wizard;

public class Warriors implements WarriorsAPI {

	
	// Attributes 
	
	Random random = new Random();
	protected java.util.Map <String,GameStates>gameList;
	
	public List<? extends Hero> getHeroes() {
		List<Character> listOfCharacters = new ArrayList<>();
		addCharactersToCharactersList(listOfCharacters);
		return listOfCharacters;
	}

	public List<? extends Map> getMaps() {
		List<Map> listOfMaps = new ArrayList<>();
		addMapsToMapsList(listOfMaps);
		return listOfMaps;
	}

	// Methods
	
	public GameState createGame(String playerName, Hero hero, Map map) {
		GameStates game = new GameStates(playerName, hero, map);
		gameList.put(game.getGameId(), game);
		return game;
	}

	public GameState nextTurn(String gameID) {
	
		int dice = rollDice();
		GameStates games = gameList.get(gameID);
		games.movePlayer(dice);
		
		return games;
		
	}
	
	public int rollDice() {
		
		int dice = 1 +random.nextInt(6-1);
		System.out.println("Vous lancez un dé de : " +dice);
		return dice;
	}

	private void addCharactersToCharactersList(List<Character> list) {
		list.add(Warrior.Warrior);
		list.add(Wizard.Wizard);
	}
	
	private void addMapsToMapsList(List<Map> list) {
		list.add(Board.Board);
	}

}
