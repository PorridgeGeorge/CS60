package com.gradescope.hw7;

import static org.junit.Assert.*;
import org.junit.Test;

public class ClarinetTest {

    //Public methods in Clarinet.java

    @Test
    public void testClarinetInstrument() {
        Clarinet clair1 =  new Clarinet(); //checking for null pointers
    }

    //Inherited Methods from Instrument.Java

    @Test
    public void testGetKey() {
        Clarinet clair2 =  new Clarinet();
        assertEquals(clair2.getKey(), "Bb");
    }

    @Test
    public void testStaticType() {
        Instrument clair3 =  new Clarinet();
    }

    //Methods Inrerfaced from Squeakable.java 

    @Test
    public void testSqueak() {
        Clarinet clair4 = new Clarinet();
        clair4.squeak();
    }

    @Test
    public void testStaticSqueak() {
        Squeakable squeakC1 = new Clarinet();
    }

    @Test
    public void testSqueakRef() {
        Squeakable squeakC2 = new Clarinet();
        assertEquals(squeakC2.squeak(), "Squeak! (Need more practice...)");
    }
}
