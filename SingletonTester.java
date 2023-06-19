package com.gamingroom;

/**
 * A class to test a singleton's behavior
 * 
 * @author coce@snhu.edu
 */
public class SingletonTester {

	public void testSingleton() {
		
		System.out.println("\nAbout to test the singleton...");
		
		// FIXME: obtain local reference to the singleton instance
		/* get the only service available
		 * use singleton to make sure there are no duplicate instance of game at the point of saving.
		 */
		GameService service = GameService.getInstance(); // 
		
		// a simple for loop to print the games
		for(int i = 0; i < service.getGameCount(); i++) {
			
			System.out.println(service.getGame(i));
		}

	}
	
}
