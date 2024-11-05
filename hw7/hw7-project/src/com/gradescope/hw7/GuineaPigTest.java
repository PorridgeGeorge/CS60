package com.gradescope.hw7;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class GuineaPigTest {
     //Constructor Tests
    @Test
    public void testGuineaPig() {
        new GuineaPig(); // checking for nullpointer
    }
    public void testGuineaPigNameAge() {
        new GuineaPig("Oinkie", 8); // checking for nullpointer
    }

     // Getters
    @Test
     public void testGgetNameArya() {
        GuineaPig g = new GuineaPig();
        assertEquals("arya", g.getName());
     }

     public void testGgetName() {
        GuineaPig g = new GuineaPig("Oinkie", 8);
        assertEquals(8, g.getName());
     }

     // Methods
     @Test
     public void testcompareTo() {
        GuineaPig otherY = new GuineaPig("Ted", 1);
        GuineaPig otherA = new GuineaPig("Fred", 3);
        GuineaPig otherO = new GuineaPig("Ed", 5);
        GuineaPig otherS = new GuineaPig("Ted", 3);

        
        GuineaPig pig = new GuineaPig("Ted", 3);

        assertTrue(pig.compareTo(otherY) > 0);
        assertEquals(0, pig.compareTo(otherS));
        assertTrue(pig.compareTo(otherO) < 0);
        assertTrue(pig.compareTo(otherA) > 0);
     }

    @Test
    public void testComparable() {
        Comparable<GuineaPig> pig = new GuineaPig("Ted",5);
        GuineaPig other = new GuineaPig("Geo", 3);
        assertTrue(pig.compareTo(other) > 0);
    }

    //Methods Inrerfaced from Squeakable.java 

    @Test
    public void testSqueak() {
        GuineaPig pig = new GuineaPig();
        pig.squeak();
    }

    @Test
    public void testStaticSqueak() {
        Squeakable squeakPig1 = new GuineaPig();
    }

    @Test
    public void testSqueakRef() {
        Squeakable squeakPig2 = new GuineaPig();
        assertEquals(squeakPig2.squeak(), "Squeak! (Feed me!)");
    }
}
