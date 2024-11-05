package com.gradescope.hw7;

/**
 * A table with chairs and people that also has snacks.
 */
public class SnackTable extends Table {
	/**
	 * The default number of chairs.
	 */
	public static final int NUMBER_OF_CHAIRS = 3;

	/**
	 * The number of snacks in a bag of snacks.
	 */
	public static final int BAG_OF_SNACKS = 6;

	//inherits other instance variables from Table

	private int numSnacks;

	/**
	 * Constructs a table with the default number of chairs.
	 */
	public SnackTable() {
		this(SnackTable.NUMBER_OF_CHAIRS);
	}

	/**
	 * Constructs a table with the specified number of chairs.
	 * 
	 * @param capacity - the number of seats
	 * @throws IllegalArgumentException if the capacity is less than 0
	 */

	public SnackTable(int capacity) {
		super(capacity);		
		numSnacks = 0; //unique to SnackTable
	}
	
	//inherits getNumChairs

	//inherits getNumPeople

	//inherits getPeople

	//inherits emptySeat

	//inherits addPerson

	//inherits removePerson

	/**
	 * Returns the number of snacks at this table.
	 */
	public int getNumSnacks() {
		return numSnacks;
	}


	/**
	 * Adds snacks to this table.
	 */
	public void addSnacks() {
		numSnacks += BAG_OF_SNACKS;
	}

	/**
	 * Adds a hungry person to this table if there is space and an available snack.
	 * A hungry person eats one snack.
	 * 
	 * @param name - the name of the person to add
	 * @return a welcome message
	 */
	public String addHungryPerson(String name) {
		if (emptySeat() && numSnacks > 0) {
			String welcome = addPerson(name);
			String eating = name + " says yummy!";
			numSnacks--;
			return welcome + " " + eating;
		}

		if (numPeople == 0) {
			return "(Silence - no one is here to say sorry.)";
		}

		// either there were no empty seats or there was no snack
		if (!emptySeat()) {
			return "Sorry - there is no space for you " + name + ".";
		}

		// no snack
		return "Sorry - there is no snack for you " + name + ".";
	}
}
