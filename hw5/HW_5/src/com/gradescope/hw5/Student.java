package com.gradescope.hw5;


/**
 * The Student class represents a Student with a name and id
 */
public class Student {
    /********************************
	 * Instance Variables
	 ********************************/

    // name of student
     private String name;

     //id of student
     private long id;

    /********************************
	 * Constructors
	 ********************************/

    // Initializes a new Student
     public Student(String name, long id) {
        this.name = name;
        this.id = id;
     }

    /********************
	 * getters
	 ********************/

    /**
    * gets the id number of a given student
    * @return the id number
    **/
     public long getId() {
        return this.id;
    }

    /**
    * gets the name of a given student
    * @return the name
    **/
    public String getName() {
        return this.name;
    }

	/********************
	 * setters
	 ********************/

    // Destructively sets a new name to a student
    public void setName(String name) {
        this.name = name;
    }

	/********************
	 * methods
	 ********************/
    /**
    * converts the student name and id to a string
    * @return the string in the for "name [id]"" number
    **/
    public String toString() {
        return this.name + " [" + this.id + "]";
    }  

    /**
	 * Compares two students and returns true if they have the same id
	 * 
	 * @param otherStudent - The student being compared with name and id
	 * @return boolean
     */
    public boolean equals(Student otherStudent) {
        if (this.id == otherStudent.id) {
            return true;
        }
        else{
            return false;
        }
    }

}

