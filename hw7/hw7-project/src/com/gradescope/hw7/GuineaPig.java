package com.gradescope.hw7;

/**
 * A guinea pig.
 */
public class GuineaPig implements Comparable<GuineaPig>, Squeakable {
	private int age;
	private String name;

	/**
	 * Initializes a new guinea pig object.
	 * 
	 * @param name - the name
	 * @param age  - the age
	 */
	public GuineaPig(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * Initializes a new guinea pig object with default name "arya" and age 1 (Prof
	 * Wu's pet).
	 */
	public GuineaPig() {
		this("arya", 1);
	}

	/**
	 * Returns the name of this guinea pig.
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param o - type GuineaPig with name and age
	 * 
	 * @return a positive/negative number if this guinea pig is 
	 * 		   older/younger than the argument ginea pig
	 * 		   zero if they are equivilant
	 */
	@Override
	public int compareTo(GuineaPig o) {
		if (Integer.compare(this.age, o.age) != 0) {
			return Integer.compare(this.age, o.age);
		}
		else if (this.name == o.name) {
			return 0;
		}
		else {
			return this.name.compareTo(o.name);
		}
	}

	@Override
	public String squeak() {
		return "Squeak! (Feed me!)";
	}
}
