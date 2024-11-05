package com.gradescope.hw5;

import java.util.Arrays;
/**
 * The Course class represents a Course with a code and cap
 */
public class Course {
    /********************************
	 * Instance Variables
	 ********************************/

     // string course code
     private String code;

     // integer course capacity
     private int cap;

     // uses Student class to hold an array of enrolled students
     private Student[] enrolled;

    /********************
	 * constructors
	 ********************/

     public Course(String code, int cap) {
        this.code = code;
        this.cap = cap;;
        enrolled = new Student[0];
     }

    /********************
	 * getters
	 ********************/
    /**
    * gets the code of a given course
    * @return the code
    **/
    public String getCode() {
        return this.code;
    }

    /**
    * gets the capacity of a given course
    * @return the capacity
    **/
    public int getCap() {
        return this.cap;
    }
    
    /**
    * @return the string representation of the array of enrolled students
    **/
    public String getStudents() {
        return Arrays.asList(this.enrolled).toString();
    }

	/********************
	 * methods
	 ********************/

    /**
    * gets the number of enrolled students of a given course
    * @return the length of the enrolled object
    **/
     public int getNumEnrolled() {
        return this.enrolled.length;
     }
    /**
    * enrolls a student in the course and returns how many spaces are occupied
    * if the student is already enrolled or the capacity is met return -1
    * @return the number of spaces filled or -1 if cap is met or if the student is already enrolled
    **/
     public int enrollStudent(Student newStudent) {
        int numEnrolled = this.enrolled.length;
        if (numEnrolled < this.cap) {
            Student[] updatedEnrolled = new Student[numEnrolled + 1];
            for (int i = 0; i < numEnrolled; i++) {
                if (this.enrolled[i].equals(newStudent)){ //student already enrolled
                    return -1;
                }
                    updatedEnrolled[i] = this.enrolled[i]; //adds existing student to new
                }
            updatedEnrolled[numEnrolled] = newStudent;
            enrolled = updatedEnrolled;
            return this.enrolled.length;
        }
        return -1; // at capacity
    }
}