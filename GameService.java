package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;
	
	//hold game service 

	private static GameService service=null;
	// hold game id
	private static long nextTeamId =1;
	
	
	// hold  next player id
	private static long nextPlayerId=1;
	
	// Empty constructor
	
	private GameService() {}
	
	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	
	public Game addGame(String name) {

		// a local game instance
		Game game = null;
		
		// FIXME: Use iterator to look for existing game with same name
		// if found, simply return the existing instance
		// use if statement to look for existing game with same name. if found return to existing instance.
		if(getGame(name) !=null) {
			game =getGame(name);
		}
		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same id
		// if found, simply assign that instance to the local variable
		// simple for loop to look for existing game with same id
		for(int i=0; i< getGameCount(); i++  ) {
			if (getGame(i).getId()==id) {
				game=getGame(id);
			}
			
		}
		
		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same name
		/* if found, simply assign that instance to the local variable. we use .
		 * equals because we work with string. use this method to allow a game instance to be
		 * using only the unique name. 
		 */
		for(int i = 0; i<getGameCount(); i++) {
			
			if(getGame(i).getName().equals(name)) {
				
				game= getGame(name);
				
			}
		}
		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}

	public static GameService getInstance() {
		if (service ==null) {
			service= new GameService();
		}
		return service;
	}

	public  long getNextTeamId() {
		return nextTeamId;
	}

	

	public  long getNextPlayerId() {
		return nextPlayerId;
	}

	

	
}
