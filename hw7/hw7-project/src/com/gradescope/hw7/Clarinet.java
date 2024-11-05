package com.gradescope.hw7;


public class Clarinet extends Instrument implements Squeakable{

    /**
	 * Initializes a Clarinet from parent 
     * class Instrument with key "Bb"
	 */

    public Clarinet() {
        super("Bb");
    }

    @Override
    public String squeak() {
        return "Squeak! (Need more practice...)";
    }
    
}
