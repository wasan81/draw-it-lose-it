package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Team extends Entity {
	
	/**
	 * A list of the active player
	 */
	private static List<Player> players = new ArrayList<Player>();

	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//Add player
	public Player addPlayer(String name) {
		//use for loop to go over the players list to find existing local player 
		Player player=null;
		for(int i=0; i <(players.size());i++) {
			//use if statement to look player exist
			if (player.getName()==name){
				player =players.get(i);
				
			}
			if(player.getName() ==null) {
				GameService service =GameService.getInstance();
				// call get next player id from game service
				player=new Player(service.getNextPlayerId(), name);
				players.add(player);
			}
			
		}
		
		return player;
		
	}


	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + "]";
	}

	
}
