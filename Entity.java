package com.gamingroom;

public class Entity {
	protected long id;
	protected String name;
	
	/*We set the brand attribute in Entity to a protected access modifier.
	 *  If it was set to private, the player, team, and game  classes would 
	 *  not be able to access it.
	*/
	
	
	protected Entity() {}
	
		
		/*
		 * Constructor with an identifier and name
		 */
		public Entity (long id, String name) {
			this.id = id;
			this.name = name;
		}

		/**
		 * @return the id
		 */
		public long getId() {
			return id;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		@Override
		public String toString() {
			return "Player [id=" + id + ", name=" + name + "]";
		}
	}



