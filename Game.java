package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */
public class Game extends Entity{
	
	
	/**
	 * A list of the active team
	 */
	private static List<Team> teams = new ArrayList<Team>();


	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		
		this.id = id;
		this.name = name;
	}
	public Team addTeam(String name) {
		Team team=null;
// use for loop to look through teams list
	for(int i=0; i<teams.size(); i++) {
		if(team.getName()== name) {
			team= teams.get(i);
			
		}
		
	}
	
	if (team.getName()==null) {
		GameService service=GameService.getInstance();
		team=new Team(service.getNextTeamId(), name);
		teams.add(team);
	}
	
	
	return team;
}
	

	@Override
	public String toString() {
		
		return "Game [id=" + id + ", name=" + name + "]";
	}



}
